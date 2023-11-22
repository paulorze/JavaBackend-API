package ar.com.desafio5.service.pokedex;

import ar.com.desafio5.domain.pokedex.Pokemon;
import ar.com.desafio5.service.EntidadBaseService;
import ar.com.desafio5.repository.pokedex.PokemonRepositoryImpl;

public class PokemonServiceImpl extends EntidadBaseService<Pokemon> implements PokemonService {

	public PokemonServiceImpl() {
		super(new PokemonRepositoryImpl());
	}

}
