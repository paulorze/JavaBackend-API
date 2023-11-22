package ar.com.desafio5.controllers.parsers.pokedex;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import ar.com.desafio5.domain.ErrorResponse;
import ar.com.desafio5.domain.pokedex.Ability;
import ar.com.desafio5.domain.pokedex.Form;
import ar.com.desafio5.domain.pokedex.Item;
import ar.com.desafio5.domain.pokedex.Move;
import ar.com.desafio5.domain.pokedex.Pokemon;
import ar.com.desafio5.domain.pokedex.Species;
import ar.com.desafio5.domain.pokedex.Sprites;
import ar.com.desafio5.domain.pokedex.Stat;
import ar.com.desafio5.domain.pokedex.Type;
import ar.com.desafio5.restapiconnector.connectors.pokedex.APIPokedexServiceImpl;
import ar.com.desafio5.restapiconnector.connectors.pokedex.dto.AbilityJson;
import ar.com.desafio5.restapiconnector.connectors.pokedex.dto.AbilityPre;
import ar.com.desafio5.restapiconnector.connectors.pokedex.dto.FormJson;
import ar.com.desafio5.restapiconnector.connectors.pokedex.dto.HeldItem;
import ar.com.desafio5.restapiconnector.connectors.pokedex.dto.ItemJson;
import ar.com.desafio5.restapiconnector.connectors.pokedex.dto.MoveJson;
import ar.com.desafio5.restapiconnector.connectors.pokedex.dto.MovePre;
import ar.com.desafio5.restapiconnector.connectors.pokedex.dto.PokemonJson;
import ar.com.desafio5.restapiconnector.connectors.pokedex.dto.SpeciesJson;
import ar.com.desafio5.restapiconnector.connectors.pokedex.dto.SpritesJson;
import ar.com.desafio5.restapiconnector.connectors.pokedex.dto.StatJson;
import ar.com.desafio5.restapiconnector.connectors.pokedex.dto.StatPre;
import ar.com.desafio5.restapiconnector.connectors.pokedex.dto.TypeJson;
import ar.com.desafio5.restapiconnector.connectors.pokedex.dto.TypePre;
import ar.com.desafio5.service.pokedex.AbilityServiceImpl;
import ar.com.desafio5.service.pokedex.FormServiceImpl;
import ar.com.desafio5.service.pokedex.ItemServiceImpl;
import ar.com.desafio5.service.pokedex.MoveServiceImpl;
import ar.com.desafio5.service.pokedex.PokemonServiceImpl;
import ar.com.desafio5.service.pokedex.SpeciesServiceImpl;
import ar.com.desafio5.service.pokedex.SpritesServiceImpl;
import ar.com.desafio5.service.pokedex.StatServiceImpl;
import ar.com.desafio5.service.pokedex.TypeServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/api/pokemon")
public class PokedexController extends HttpServlet {

	private static final long serialVersionUID = -1430546183264765534L;
	PokemonServiceImpl pokemonService = new PokemonServiceImpl();
	AbilityServiceImpl abilityService = new AbilityServiceImpl();
	FormServiceImpl formService = new FormServiceImpl();
	ItemServiceImpl itemService = new ItemServiceImpl();
	MoveServiceImpl moveService = new MoveServiceImpl();
	SpeciesServiceImpl speciesService = new SpeciesServiceImpl();
	SpritesServiceImpl spritesService = new SpritesServiceImpl();
	StatServiceImpl statService = new StatServiceImpl();
	TypeServiceImpl typeService = new TypeServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (req.getParameter("id") == null || req.getParameter("id").isEmpty()) {
			Collection<Pokemon> objects = pokemonService.findAll();
			ObjectMapper mapper = new ObjectMapper();
			String json = mapper.writeValueAsString(objects);
			resp.getWriter().print(json);
		} else {			
			Long id = Long.parseLong(req.getParameter("id"));
			Pokemon object = pokemonService.findById(id);
			if (object == null) {
				APIPokedexServiceImpl apiConnector = new APIPokedexServiceImpl();
				try {
					PokemonJson objectJson = apiConnector.findById(id);
					createPokemon(id, objectJson);
					object = pokemonService.findById(id);
				} catch (RuntimeException e) {
					ErrorResponse error = new ErrorResponse(HttpServletResponse.SC_NOT_FOUND, "No data found for ID " + id);
					ObjectMapper mapper = new ObjectMapper();
				    resp.getWriter().print(mapper.writeValueAsString(error));
				    return;
				} catch (Exception e) {
					ErrorResponse error = new ErrorResponse(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "There was an unexpected error while trying to save the object.");
					ObjectMapper mapper = new ObjectMapper();
				    resp.getWriter().print(mapper.writeValueAsString(error));
				    return;
				}
			}
			ObjectMapper mapper = new ObjectMapper();
			String json = mapper.writeValueAsString(object);
			resp.getWriter().print(json);
		}
	}

	private void createPokemon(Long id, PokemonJson objectJson) {
		Long base_experience = (long) objectJson.baseExperience;
		BigDecimal height = new BigDecimal(objectJson.height);
		String location_area_encounters = objectJson.locationAreaEncounters;
		String name = objectJson.name;
		SpeciesJson speciesJson = objectJson.species;
		Species species = new Species(speciesJson.name, speciesJson.url);
		speciesService.save(species);
		SpritesJson spritesJson = objectJson.sprites;
		Sprites sprites = new Sprites (spritesJson.backDefault, spritesJson.backShiny, spritesJson.frontDefault, spritesJson.frontShiny);
		spritesService.save(sprites);
		BigDecimal weight = new BigDecimal (objectJson.weight);
		Pokemon pokemon = new Pokemon(base_experience, height, id, location_area_encounters, name, species, sprites, weight);
		pokemonService.save(pokemon);
		List<AbilityPre> abilitiesPre = objectJson.abilities;
		List<AbilityJson> abilitiesJson = new ArrayList<>();
		for (AbilityPre abilityPre : abilitiesPre) {
			abilitiesJson.add(abilityPre.ability);
		}
		List<Ability> abilities = new ArrayList<>();
		for (AbilityJson abilityJson : abilitiesJson) {
			Ability ability = new Ability(abilityJson.name, abilityJson.url);
			abilityService.save(ability, id);
			abilities.add(ability);
		}
		List<FormJson> formsJson = objectJson.forms;
		List<Form> forms = new ArrayList<>();
		for (FormJson formJson : formsJson) {
			Form form = new Form(formJson.name, formJson.url);
			formService.save(form, id);
			forms.add(form);
		}
		List<HeldItem> heldItems = objectJson.heldItems;
		List<ItemJson> itemsJson = new ArrayList<>();
		for (HeldItem heldItem : heldItems) {
			itemsJson.add(heldItem.item);
		}
		List<Item> items = new ArrayList<>();
		for (ItemJson itemJson : itemsJson) {
			Item item = new Item(itemJson.name, itemJson.url);
			itemService.save(item, id);
			items.add(item);
		}
		List<MovePre> movesPre = objectJson.moves;
		List<MoveJson> movesJson = new ArrayList<>();
		for (MovePre movePre : movesPre) {
			movesJson.add(movePre.move);
		}
		List<Move> moves = new ArrayList<>();
		for (MoveJson moveJson : movesJson) {
			Move move= new Move(moveJson.name, moveJson.url);
			moveService.save(move, id);
			moves.add(move);
		}
		List<StatPre> statsPre = objectJson.stats;
		List<StatJson> statsJson = new ArrayList<>();
		for (StatPre statPre : statsPre) {
			statsJson.add(statPre.stat);
		}
		List<Stat> stats = new ArrayList<>();
		for (int i = 0; i < statsJson.size(); i++) {
			Stat stat = new Stat((long) statsPre.get(i).baseStat, (long) statsPre.get(i).effort, statsJson.get(i).name );
			statService.save(stat, id);
			stats.add(stat);
		}
		List<TypePre> typesPre = objectJson.types;
		List<TypeJson> typesJson = new ArrayList<>();
		for (TypePre typePre : typesPre) {
			typesJson.add(typePre.type);
		}
		List<Type> types = new ArrayList<>();
		for (int i = 0; i < typesJson.size(); i++) {
			Type type= new Type((long) typesPre.get(i).slot, typesJson.get(i).name);
			typeService.save(type, id);
			types.add(type);
		}
	}
}
