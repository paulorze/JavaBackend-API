package ar.com.desafio5.service;

import java.util.Collection;

public interface IEntidadBaseService <T> {
	public Collection<T> findAll();
	public T findById(Long id);
	public void deleteById(Long id);
	public void save (T entity);
	public void update (T entity);
}
