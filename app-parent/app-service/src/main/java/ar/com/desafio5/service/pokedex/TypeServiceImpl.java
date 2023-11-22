package ar.com.desafio5.service.pokedex;

import ar.com.desafio5.domain.pokedex.Type;
import ar.com.desafio5.service.EntidadBaseServiceMTM;
import ar.com.desafio5.repository.pokedex.TypeRepositoryImpl;

public class TypeServiceImpl extends EntidadBaseServiceMTM<Type> implements TypeService {

	public TypeServiceImpl() {
		super(new TypeRepositoryImpl());
	}

}
