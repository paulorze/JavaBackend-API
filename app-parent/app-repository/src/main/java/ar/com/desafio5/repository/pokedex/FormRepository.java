package ar.com.desafio5.repository.pokedex;

import java.util.List;

import ar.com.desafio5.domain.pokedex.Form;
import ar.com.desafio5.repository.IBaseRepositoryMTM;

public interface FormRepository extends IBaseRepositoryMTM<Form> {
	public List<Form> findByPokemonId(Long id);
}
