package ar.com.desafio5.repository.pokedex;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import ar.com.desafio5.domain.pokedex.Ability;

public class AbilityRepositoryImpl extends PokedexBaseCrud<Ability> implements AbilityRepository {

	public AbilityRepositoryImpl() {
		super(Ability.class, "ABILITIES", "POKEMON_ABILITIES");
	}
	
	@Override
	protected Ability fromResultSetToEntity(ResultSet res) throws SQLException {
		Long id = res.getLong(1);
		String name = res.getString(2);
		String url = res.getString(3);
		return new Ability(id, name, url);
	}

	@Override
	public List<Ability> findByPokemonId(Long id) {
		String sql = "SELECT A.* FROM POKEMON P \r\n"
				+ "JOIN POKEMON_ABILITIES PA ON P.ID = PA.POKEMON_ID \r\n"
				+ "INNER JOIN ABILITIES A ON A.ID = PA.ABILITY_ID \r\n"
				+ "WHERE P.ID = " + id;
		return super.getBySQL(sql);
	}

	@Override
	protected String getMTMSQL() {
		return "(pokemon_id, ability_id) values (?,?)";
	}
	
}
