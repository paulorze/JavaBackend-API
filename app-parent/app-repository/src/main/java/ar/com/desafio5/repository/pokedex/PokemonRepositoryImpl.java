package ar.com.desafio5.repository.pokedex;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import ar.com.desafio5.domain.pokedex.Ability;
import ar.com.desafio5.domain.pokedex.Form;
import ar.com.desafio5.domain.pokedex.Item;
import ar.com.desafio5.domain.pokedex.Move;
import ar.com.desafio5.domain.pokedex.Pokemon;
import ar.com.desafio5.domain.pokedex.Species;
import ar.com.desafio5.domain.pokedex.Sprites;
import ar.com.desafio5.domain.pokedex.Stat;
import ar.com.desafio5.domain.pokedex.Type;
import ar.com.desafio5.repository.BaseCrud;

public class PokemonRepositoryImpl extends BaseCrud<Pokemon> implements PokemonRepository {

	public PokemonRepositoryImpl() {
		super(Pokemon.class, "POKEMON");
	}

	@Override
	protected String getSaveSQL() {
		return "(base_experience, height, id, location_area_encounters, name, species, sprites, weight) values (?,?,?,?,?,?,?,?)";
	}

	@Override
	protected void saveEntity(Pokemon entity, PreparedStatement pst) throws SQLException {
		pst.setLong(1, entity.getBase_experience());
		pst.setBigDecimal(2, entity.getHeight());
		pst.setLong(3, entity.getId());
		pst.setString(4, entity.getLocation_area_encounters());
		pst.setString(5, entity.getName());
		pst.setLong(6, entity.getSpecies().getId());
		pst.setLong(7, entity.getSprites().getId());
		pst.setBigDecimal(8, entity.getWeight());
	}


	@Override
	protected String getUpdateSQL() {
		return "base_experience = ?, height = ?, id = ?, location_area_encounters = ?, name = ?, species = ?, sprites = ?, weight = ?";
	}

	@Override
	protected void setUpdateSQL(Pokemon entity, PreparedStatement pst) throws SQLException {
		pst.setLong(1, entity.getBase_experience());
		pst.setBigDecimal(2, entity.getHeight());
		pst.setLong(3, entity.getId());
		pst.setString(4, entity.getLocation_area_encounters());
		pst.setString(5, entity.getName());
		pst.setLong(6, entity.getSpecies().getId());
		pst.setLong(7, entity.getSprites().getId());
		pst.setBigDecimal(8, entity.getWeight());
	}

	@Override
	protected Pokemon fromResultSetToEntity(ResultSet res) throws SQLException {
		Long id = res.getLong(3);
		AbilityRepositoryImpl abilityRepository = new AbilityRepositoryImpl();
		List<Ability> abilities = abilityRepository.findByPokemonId(id);
		Long base_experience = res.getLong(1);
		FormRepositoryImpl formRepository = new FormRepositoryImpl();
		List<Form> forms = formRepository.findByPokemonId(id);
		BigDecimal height = res.getBigDecimal(2);
		ItemRepositoryImpl itemsRepository = new ItemRepositoryImpl();
		List<Item> items = itemsRepository.findByPokemonId(id);
		String location_area_encounters = res.getString(4);
		MoveRepositoryImpl moveRepository = new MoveRepositoryImpl();
		List<Move> moves = moveRepository.findByPokemonId(id);
		String name = res.getString(5);
		SpeciesRepositoryImpl speciesRepository = new SpeciesRepositoryImpl();
		Species species = speciesRepository.getById(res.getLong(6));
		SpritesRepositoryImpl spritesRepository = new SpritesRepositoryImpl();
		Sprites sprites = spritesRepository.getById(res.getLong(7));
		StatRepositoryImpl statRepository = new StatRepositoryImpl();
		List<Stat> stats = statRepository.findByPokemonId(id);
		TypeRepositoryImpl typeRepository = new TypeRepositoryImpl();
		List<Type> types = typeRepository.findByPokemonId(id);
		BigDecimal weight = res.getBigDecimal(8);
		return new Pokemon(abilities, base_experience, forms, height, items, id, location_area_encounters, moves, name, species, sprites, stats, types, weight);
	}
	
}
