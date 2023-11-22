package ar.com.desafio5.service.pokedex;


import ar.com.desafio5.domain.pokedex.Move;
import ar.com.desafio5.service.EntidadBaseServiceMTM;
import ar.com.desafio5.repository.pokedex.MoveRepositoryImpl;

public class MoveServiceImpl extends EntidadBaseServiceMTM<Move> implements MoveService {

	public MoveServiceImpl() {
		super(new MoveRepositoryImpl());
	}

	

}
