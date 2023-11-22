package ar.com.desafio5.service.pokedex;

import ar.com.desafio5.domain.pokedex.Sprites;
import ar.com.desafio5.service.EntidadBaseService;
import ar.com.desafio5.repository.pokedex.SpritesRepositoryImpl;

public class SpritesServiceImpl extends EntidadBaseService<Sprites> implements SpritesService {

	public SpritesServiceImpl() {
		super(new SpritesRepositoryImpl());
		// TODO Auto-generated constructor stub
	}

}
