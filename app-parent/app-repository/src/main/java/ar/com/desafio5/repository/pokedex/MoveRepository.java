package ar.com.desafio5.repository.pokedex;

import java.util.List;

import ar.com.desafio5.domain.pokedex.Move;
import ar.com.desafio5.repository.IBaseRepositoryMTM;

public interface MoveRepository extends IBaseRepositoryMTM<Move>{
	public List<Move> findByPokemonId(Long id);
}
