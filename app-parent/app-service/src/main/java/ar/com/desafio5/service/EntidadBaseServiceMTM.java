package ar.com.desafio5.service;

import java.util.Collection;
import java.util.List;

import ar.com.desafio5.repository.IBaseRepositoryMTM;

public class EntidadBaseServiceMTM <T> implements IEntidadBaseServiceMTM<T> {
	protected IBaseRepositoryMTM<T> repository;
	
	@SuppressWarnings("all")
	public EntidadBaseServiceMTM (IBaseRepositoryMTM repository) {
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
	public void save (T entity, Long id) {
		this.repository.save(entity, id);
	}
	
	@Override
	public void update (T entity) {
		this.repository.update(entity);
	}

	@Override
	public List<T> findByPokemonId(Long id) {
		return this.repository.findByPokemonId(id);
	}
}
