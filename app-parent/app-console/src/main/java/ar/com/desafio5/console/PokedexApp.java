package ar.com.desafio5.console;

import ar.com.desafio5.service.ServiceLocator;
//import ar.com.desafio5.service.pokedex.AbilityServiceImpl;
//import ar.com.desafio5.service.pokedex.FormServiceImpl;
//import ar.com.desafio5.service.pokedex.ItemServiceImpl;
//import ar.com.desafio5.service.pokedex.MoveServiceImpl;
import ar.com.desafio5.service.pokedex.PokemonService;
//import ar.com.desafio5.service.pokedex.SpeciesServiceImpl;
//import ar.com.desafio5.service.pokedex.SpritesServiceImpl;
//import ar.com.desafio5.service.pokedex.StatServiceImpl;
//import ar.com.desafio5.service.pokedex.TypeServiceImpl;

public class PokedexApp {

	public static void main(String[] args) {
		PokemonService pokemonService = (PokemonService) ServiceLocator.getService(PokemonService.class);
//		AbilityServiceImpl abilityService = new AbilityServiceImpl();
//		FormServiceImpl formService = new FormServiceImpl();
//		ItemServiceImpl itemService = new ItemServiceImpl();
//		MoveServiceImpl moveService = new MoveServiceImpl();
//		SpeciesServiceImpl speciesService = new SpeciesServiceImpl();
//		SpritesServiceImpl spritesService = new SpritesServiceImpl();
//		StatServiceImpl statService = new StatServiceImpl();
//		TypeServiceImpl typeService = new TypeServiceImpl();
		System.out.println(pokemonService.findAll());
		Long idToFind = (long) 4;
		System.out.println(pokemonService.findById(idToFind));
		
	}

}
