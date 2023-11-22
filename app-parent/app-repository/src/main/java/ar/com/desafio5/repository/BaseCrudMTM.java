package ar.com.desafio5.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import ar.com.desafio5.db.ConnectionAdministrator;
import ar.com.desafio5.domain.Entity;

public abstract class BaseCrudMTM <T extends Entity> implements IBaseRepositoryMTM<T> {
	private Class<T> type;
	protected String table;
	protected String tableMTM;
	
	public BaseCrudMTM(Class<T> type, String table, String tableMTM) {
		this.type = type;
		this.table = table;
		this.tableMTM = tableMTM;
	}
	
	public void save(T entity, Long id) {
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
	
	protected abstract String getSaveSQL();
	protected abstract void saveEntity(T entidad,PreparedStatement pst) throws SQLException;
	protected abstract String getMTMSQL();
	protected void saveMTM(Long firstId, Long secondId, PreparedStatement pst) throws SQLException {
		pst.setLong(1, firstId);
		pst.setLong(2, secondId);
	};
	
//	READ
	@Override
	public T getById(Long id) {
		String sql = "SELECT * FROM " + this.table + " WHERE ID = " + id;
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
	
	protected abstract T fromResultSetToEntity (ResultSet res) throws SQLException;

	@Override
	public Collection<T> findAll() {
		System.out.println("Todos los resultados de " + type.getName());
		String sql = "SELECT * FROM " + this.table;
		Collection<T> list = new ArrayList<>();
		
		try (Connection connection = ConnectionAdministrator.getConnection()) {
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				list.add(fromResultSetToEntity(resultSet));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<T> getBySQL(String sql) {
		List<T> list = new ArrayList<>();
		
		try (Connection connection = ConnectionAdministrator.getConnection()) {
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				list.add(this.fromResultSetToEntity(resultSet));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
//	UPDATE
	@Override
	public void update(T entity) {
		String sql = "UPDATE " + this.table + " SET " + getUpdateSQL() + " WHERE ID = " + entity.getId();
		try (Connection connection = ConnectionAdministrator.getConnection()) {
			PreparedStatement statement = connection.prepareStatement(sql);
			setUpdateSQL(entity, statement);
			int res = statement.executeUpdate();
			if (res > 0) {
				System.out.println("Object with ID: "+ entity.getId() + " updated successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	protected abstract String getUpdateSQL();
	protected abstract void setUpdateSQL(T entity, PreparedStatement pst)  throws SQLException;
	
//	DELETE
	@Override
	public void delete(Long id) {
		String sql = "DELETE FROM " + this.table + " WHERE ID = ?";
		
		try (Connection connection = ConnectionAdministrator.getConnection()) {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setLong(1, id);
			int res = statement.executeUpdate();
			if(res > 0) {
				System.out.println("Object with ID: " + id + " has been deleted successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
