package ar.com.desafio5.repository.pokedex;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import ar.com.desafio5.domain.pokedex.Item;

public class ItemRepositoryImpl extends PokedexBaseCrud<Item> implements ItemRepository {
	
	public ItemRepositoryImpl() {
		super(Item.class, "ITEMS", "POKEMON_ITEMS");
	}

	@Override
	protected Item fromResultSetToEntity(ResultSet res) throws SQLException {
		Long id = res.getLong(1);
		String name = res.getString(2);
		String url = res.getString(3);
		return new Item(id, name, url);
	}
	
	@Override
	public List<Item> findByPokemonId(Long id) {
		String sql = "SELECT I.* FROM POKEMON P \r\n"
				+ "JOIN POKEMON_ITEMS PI ON P.ID = PI.POKEMON_ID \r\n"
				+ "INNER JOIN ITEMS I ON I.ID = PI.ITEM_ID \r\n"
				+ "WHERE P.ID = " + id;
		return super.getBySQL(sql);
	}
	
	@Override
	protected String getMTMSQL() {
		return "(pokemon_id, item_id) values (?,?)";
	}

}
