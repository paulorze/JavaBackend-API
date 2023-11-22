package ar.com.desafio5.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Entity {
	@JsonIgnore
	protected Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
