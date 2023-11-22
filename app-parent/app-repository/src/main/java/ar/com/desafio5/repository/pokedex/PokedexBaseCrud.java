package ar.com.desafio5.repository.pokedex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ar.com.desafio5.db.ConnectionAdministrator;
import ar.com.desafio5.domain.pokedex.PokedexEntity;
import ar.com.desafio5.repository.BaseCrudMTM;
import ar.com.desafio5.repository.IBaseRepositoryMTM;

public abstract class PokedexBaseCrud <T extends PokedexEntity> extends BaseCrudMTM<T> implements IBaseRepositoryMTM<T>{
	public PokedexBaseCrud(Class<T> type, String table, String tableMTM) {
		super(type, table, tableMTM);
	}

	protected String getSaveSQL() {
		return "(name, url) values (?,?)";
	}
	
	protected void saveEntity (T entity, PreparedStatement pst) throws SQLException {
		pst.setString(1, entity.getName());
		pst.setString(2, entity.getUrl());
	}
	
	@Override
	protected String getUpdateSQL() {
		return "name = ?, url = ?";
	}
	
	@Override
	protected void setUpdateSQL(T entity, PreparedStatement pst) throws SQLException {
		pst.setString(1, entity.getName());
		pst.setString(2, entity.getUrl());
	}
	
	@Override
	public void save(T entity, Long id) {
		T existingEntity = getByName(entity.getName());
		if (existingEntity != null) {
			try(Connection connection = ConnectionAdministrator.getConnection()) {
				String sqlMTM = "INSERT INTO " + this.tableMTM + this.getMTMSQL();
				PreparedStatement statementMTM = connection.prepareStatement(sqlMTM);
				saveMTM(id, existingEntity.getId(), statementMTM);
				statementMTM.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		} else {			
			String sql ="INSERT INTO " + this.table + this.getSaveSQL();
			try(Connection connection = ConnectionAdministrator.getConnection()) {
				
				PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
				
				saveEntity(entity, statement);
				
				statement.executeUpdate();
				
				ResultSet resKey = statement.getGeneratedKeys();
				if(resKey.next() && entity.getId() == null) {
					entity.setId(resKey.getLong(1));
					String sqlMTM = "INSERT INTO " + this.tableMTM + this.getMTMSQL();
					PreparedStatement statementMTM = connection.prepareStatement(sqlMTM);
					saveMTM(id, entity.getId(), statementMTM);
					statementMTM.executeUpdate();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	private T getByName (String name) {
		String sql = "SELECT * FROM " + this.table + " WHERE NAME = '" + name + "'";
		T entity = null;
		
		try (Connection connection = ConnectionAdministrator.getConnection()) {
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				entity = this.fromResultSetToEntity(resultSet);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return (T) entity;
	}
}
