package ar.com.desafio5.repository.pokedex;

import java.util.List;

import ar.com.desafio5.domain.pokedex.Stat;
import ar.com.desafio5.repository.IBaseRepositoryMTM;

public interface StatRepository extends IBaseRepositoryMTM<Stat> {
	public List<Stat> findByPokemonId(Long id);
}
