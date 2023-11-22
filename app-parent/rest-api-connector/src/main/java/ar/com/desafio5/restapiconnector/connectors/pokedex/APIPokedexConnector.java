package ar.com.desafio5.restapiconnector.connectors.pokedex;

import java.util.List;

import ar.com.desafio5.restapiconnector.connectors.RestClientConnector;
import ar.com.desafio5.restapiconnector.connectors.pokedex.dto.PokemonJson;
import jakarta.ws.rs.core.GenericType;

public class APIPokedexConnector extends RestClientConnector <PokemonJson> {

	public APIPokedexConnector(String url) {
		super(url, PokemonJson.class, new GenericType<List<PokemonJson>>() {});
	}

}
