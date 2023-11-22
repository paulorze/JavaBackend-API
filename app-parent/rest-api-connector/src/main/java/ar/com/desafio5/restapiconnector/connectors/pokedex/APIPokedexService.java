package ar.com.desafio5.restapiconnector.connectors.pokedex;

import ar.com.desafio5.restapiconnector.connectors.pokedex.dto.PokemonJson;

public interface APIPokedexService {
	public PokemonJson findById(Long id);
}
