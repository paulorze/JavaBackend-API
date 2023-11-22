package ar.com.desafio5.domain.pokedex;

public class Item extends PokedexEntity {
	
	public Item(Long id, String name, String url) {
		super(id, name, url);
	}
	
	public Item(String name, String url) {
		super(name, url);
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", url=" + url + "]";
	}
}
