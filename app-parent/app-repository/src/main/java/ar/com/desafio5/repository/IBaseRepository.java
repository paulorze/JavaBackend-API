package ar.com.desafio5.repository;

import java.util.Collection;

public interface IBaseRepository <T> {
	public void save (T entity);
	public T getById (Long id);
	public Collection<T> findAll();
	public void update (T entity);
	public void delete (Long id);
}