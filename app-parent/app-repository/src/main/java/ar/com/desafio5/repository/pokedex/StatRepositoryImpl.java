package ar.com.desafio5.repository.pokedex;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import ar.com.desafio5.domain.pokedex.Stat;
import ar.com.desafio5.repository.BaseCrudMTM;

public class StatRepositoryImpl extends BaseCrudMTM<Stat> implements StatRepository {

	public StatRepositoryImpl() {
		super(Stat.class, "STATS", "POKEMON_STATS");
	}

	protected String getSaveSQL() {
		return "(base_stat, effort, name) values (?,?,?)";
	}
	
	protected void saveEntity (Stat entity, PreparedStatement pst) throws SQLException {
		pst.setLong(1,entity.getBase_stat());
		pst.setLong(2, entity.getEffort());
		pst.setString(3, entity.getName());
	}
	
	protected String getUpdateSQL() {
		return "base_stat = ?, effort = ?, name = ?";
	}
	
	protected void setUpdateSQL(Stat entity, PreparedStatement pst) throws SQLException {
		pst.setLong(1, entity.getBase_stat());
		pst.setLong(2, entity.getEffort());
		pst.setString(3, entity.getName());
	}
	
	protected Stat fromResultSetToEntity (ResultSet res) throws SQLException {
		Long id = res.getLong(1);
		Long base_stat = res.getLong(2);
		Long effort = res.getLong(3);
		String name = res.getString(4);
		return new Stat (id, base_stat, effort, name);
	}
	
	@Override
	public List<Stat> findByPokemonId(Long id) {
		String sql = "SELECT S.* FROM POKEMON P \r\n"
				+ "JOIN POKEMON_STATS PS ON P.ID = PS.POKEMON_ID \r\n"
				+ "INNER JOIN STATS S ON S.ID = PS.STAT_ID \r\n"
				+ "WHERE P.ID = " + id;
		return super.getBySQL(sql);
	}

	
	@Override
	protected String getMTMSQL() {
		return "(pokemon_id, stat_id) values (?,?)";
	}
}
