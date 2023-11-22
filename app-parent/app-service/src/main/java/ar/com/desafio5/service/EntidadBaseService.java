package ar.com.desafio5.service;

import java.util.Collection;

import ar.com.desafio5.repository.IBaseRepository;

public abstract class EntidadBaseService <T> implements IEntidadBaseService<T> {
	
	protected IBaseRepository<T> repository;
	
	@SuppressWarnings("all")
	public EntidadBaseService (IBaseRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public Collection <T> findAll() {
		return this.repository.findAll();
	}
	
	@Override
	public T findById (Long id) {
		return this.repository.getById(id);
	}
	
	@Override
	public void deleteById (Long id) {
		this.repository.delete(id);
	}
	
	@Override
	public void save (T entity) {
		this.repository.save(entity);
	}
	
	@Override
	public void update (T entity) {
		this.repository.update(entity);
	}
}
