package ar.com.desafio5.repository.pokedex;

import java.util.List;

import ar.com.desafio5.domain.pokedex.Ability;
import ar.com.desafio5.repository.IBaseRepositoryMTM;

public interface AbilityRepository extends IBaseRepositoryMTM<Ability> {
	public List<Ability> findByPokemonId(Long id);
}
