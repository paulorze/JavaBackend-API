package ar.com.desafio5.domain.pokedex;

public class Form extends PokedexEntity {
	
	public Form(Long id, String name, String url) {
		super(id, name, url);
	}
	
	public Form(String name, String url) {
		super(name, url);
	}

	@Override
	public String toString() {
		return "Form [id=" + id + ", name=" + name + ", url=" + url + "]";
	}
	
//    {
//    "name": "ditto",
//    "url": "https://pokeapi.co/api/v2/pokemon-form/132/"
//  }
}
