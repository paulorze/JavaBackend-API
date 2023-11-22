package ar.com.desafio5.service;

import java.util.Collection;
import java.util.List;

public interface IEntidadBaseServiceMTM <T> {
	public Collection<T> findAll();
	public List<T> findByPokemonId(Long id);
	public T findById(Long id);
	public void deleteById(Long id);
	public void save (T entity, Long id);
	public void update (T entity);
}
