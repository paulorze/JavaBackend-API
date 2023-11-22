package ar.com.desafio5.repository.pokedex;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ar.com.desafio5.domain.pokedex.Species;
import ar.com.desafio5.repository.BaseCrud;

public class SpeciesRepositoryImpl extends BaseCrud<Species> implements SpeciesRepository {

	public SpeciesRepositoryImpl( ) {
		super(Species.class, "SPECIES");
	}

	@Override
	protected String getSaveSQL() {
		return "(name, url) values (?,?)";
	}

	@Override
	protected void saveEntity(Species entity, PreparedStatement pst) throws SQLException {
		pst.setString(1, entity.getName());
		pst.setString(2, entity.getUrl());
	}

	@Override
	protected String getUpdateSQL() {
		return "name = ?, url = ?";
	}

	@Override
	protected void setUpdateSQL(Species entity, PreparedStatement pst) throws SQLException {
		pst.setString(1, entity.getName());
		pst.setString(2, entity.getUrl());
	}
	
	@Override
	protected Species fromResultSetToEntity (ResultSet res) throws SQLException {
		Long id = res.getLong(1);
		String name = res.getString(2);
		String url = res.getString(3);
		return new Species(id, name, url);
	}
	
}
