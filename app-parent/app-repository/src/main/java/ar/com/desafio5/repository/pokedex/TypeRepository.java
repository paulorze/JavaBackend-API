package ar.com.desafio5.repository.pokedex;

import java.util.List;

import ar.com.desafio5.domain.pokedex.Type;
import ar.com.desafio5.repository.IBaseRepositoryMTM;

public interface TypeRepository extends IBaseRepositoryMTM<Type> {
	public List<Type> findByPokemonId(Long id);
}
