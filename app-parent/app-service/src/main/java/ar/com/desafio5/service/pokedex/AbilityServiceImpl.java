package ar.com.desafio5.service.pokedex;

import ar.com.desafio5.domain.pokedex.Ability;
import ar.com.desafio5.service.EntidadBaseServiceMTM;
import ar.com.desafio5.repository.pokedex.AbilityRepositoryImpl;

public class AbilityServiceImpl extends EntidadBaseServiceMTM<Ability> implements AbilityService {

	public AbilityServiceImpl() {
		super(new AbilityRepositoryImpl());
	}

}
