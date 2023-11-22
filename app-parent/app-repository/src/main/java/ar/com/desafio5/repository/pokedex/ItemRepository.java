package ar.com.desafio5.repository.pokedex;

import java.util.List;

import ar.com.desafio5.domain.pokedex.Item;
import ar.com.desafio5.repository.IBaseRepositoryMTM;

public interface ItemRepository extends IBaseRepositoryMTM<Item> {
	public List<Item> findByPokemonId(Long id);
}
