package ar.com.desafio5.repository;

import java.util.Collection;
import java.util.List;

public interface IBaseRepositoryMTM <T> {
	public void save (T entity, Long id);
	public T getById (Long id);
	public Collection<T> findAll();
	public List<T> findByPokemonId(Long id);
	public void update (T entity);
	public void delete (Long id);
}
