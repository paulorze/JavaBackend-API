package ar.com.desafio5.restapiconnector.connectors.pokedex;

import ar.com.desafio5.restapiconnector.connectors.pokedex.dto.PokemonJson;

public class APIPokedexServiceImpl implements APIPokedexService {

	private APIPokedexConnector connector;
	
	public APIPokedexServiceImpl() {
		connector = new APIPokedexConnector("https://pokeapi.co/api/v2/pokemon");
	}
	
	@Override
	public PokemonJson findById(Long id) {
		return connector.get(Long.toString(id));
	}

}
