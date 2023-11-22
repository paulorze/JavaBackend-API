package ar.com.desafio5.domain.pokedex;

public class Species extends PokedexEntity {
	public Species(Long id, String name, String url) {
		super(id, name, url);
	}
	
	public Species(String name, String url) {
		super(name, url);
	}

	@Override
	public String toString() {
		return "Species [id=" + id + ", name=" + name + ", url=" + url + "]";
	}
}
