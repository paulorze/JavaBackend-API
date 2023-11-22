package ar.com.desafio5.domain.pokedex;

public class Move extends PokedexEntity{

	public Move(Long id, String name, String url) {
		super(id, name, url);
	}
	
	public Move(String name, String url) {
		super(name, url);
	}
	
	@Override
	public String toString() {
		return "Move [id=" + id + ", name=" + name + ", url=" + url + "]";
	}
}
