package ar.com.desafio5.service.pokedex;

import ar.com.desafio5.domain.pokedex.Species;
import ar.com.desafio5.service.EntidadBaseService;
import ar.com.desafio5.repository.pokedex.SpeciesRepositoryImpl;

public class SpeciesServiceImpl extends EntidadBaseService<Species> implements SpeciesService {

	public SpeciesServiceImpl() {
		super(new SpeciesRepositoryImpl());
	}

}
