package ar.com.desafio5.service.pokedex;

import ar.com.desafio5.domain.pokedex.Stat;
import ar.com.desafio5.service.EntidadBaseServiceMTM;
import ar.com.desafio5.repository.pokedex.StatRepositoryImpl;

public class StatServiceImpl extends EntidadBaseServiceMTM<Stat> implements StatService {

	public StatServiceImpl() {
		super(new StatRepositoryImpl());
	}

}
