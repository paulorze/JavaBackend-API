package ar.com.desafio5.domain.pokedex;

import ar.com.desafio5.domain.Entity;

public class PokedexEntity extends Entity {
	protected String name;
	protected String url;
	
	public PokedexEntity(Long id, String name, String url) {
		this.id = id;
		init(name, url);
	}
	
	public PokedexEntity(String name, String url) {
		init(name, url);
	}

	private void init(String name, String url) {
		this.name = name;
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
