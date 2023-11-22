package ar.com.desafio5.repository.pokedex;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import ar.com.desafio5.domain.pokedex.Type;
import ar.com.desafio5.repository.BaseCrudMTM;

public class TypeRepositoryImpl extends BaseCrudMTM<Type> implements TypeRepository {

	public TypeRepositoryImpl () {
		super(Type.class, "TYPES", "POKEMON_TYPES");
	}
	
	protected String getSaveSQL() {
		return "(slot, name) value (?,?)";
	}
	
	protected void saveEntity (Type entity, PreparedStatement pst) throws SQLException {
		pst.setLong(1,entity.getSlot());
		pst.setString(2, entity.getName());
	}
	
	protected String getUpdateSQL() {
		return "slot = ?, name = ?";
	}
	
	protected void setUpdateSQL (Type entity, PreparedStatement pst) throws SQLException {
		pst.setLong(1, entity.getSlot());
		pst.setString(2, entity.getName());
	}
	
	protected Type fromResultSetToEntity (ResultSet res) throws SQLException {
		Long id = res.getLong(1);
		Long slot = res.getLong(2);
		String name = res.getString(3);
		return new Type (id, slot, name);
	}
	
	@Override
	public List<Type> findByPokemonId(Long id) {
		String sql = "SELECT T.* FROM POKEMON P \r\n"
				+ "JOIN POKEMON_TYPES PT ON P.ID = PT.POKEMON_ID \r\n"
				+ "INNER JOIN TYPES T ON T.ID = PT.TYPE_ID \r\n"
				+ "WHERE P.ID = " + id;
		return super.getBySQL(sql);
	}

	
	@Override
	protected String getMTMSQL() {
		return "(pokemon_id, type_id) values (?,?)";
	}
	
}
