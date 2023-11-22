package ar.com.desafio5.repository.pokedex;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import ar.com.desafio5.domain.pokedex.Move;

public class MoveRepositoryImpl extends PokedexBaseCrud<Move> implements MoveRepository {

	public MoveRepositoryImpl() {
		super(Move.class, "MOVES", "POKEMON_MOVES");
	}

	@Override
	protected Move fromResultSetToEntity(ResultSet res) throws SQLException {
		Long id = res.getLong(1);
		String name = res.getString(2);
		String url = res.getString(3);
		return new Move(id, name, url);
	}
	
	@Override
	public List<Move> findByPokemonId(Long id) {
		String sql = "SELECT M.* FROM POKEMON P \r\n"
				+ "JOIN POKEMON_MOVES PM ON P.ID = PM.POKEMON_ID \r\n"
				+ "INNER JOIN MOVES M ON M.ID = PM.MOVE_ID \r\n"
				+ "WHERE P.ID = " + id;
		return super.getBySQL(sql);
	}
	
	@Override
	protected String getMTMSQL() {
		return "(pokemon_id, move_id) values (?,?)";
	}
} 
