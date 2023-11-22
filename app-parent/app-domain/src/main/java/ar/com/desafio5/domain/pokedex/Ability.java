package ar.com.desafio5.domain.pokedex;


public class Ability extends PokedexEntity{
	
	public Ability(Long id, String name, String url) {
		super(id, name, url);
	}

	public Ability(String name, String url) {
		super(name, url);
	}

	@Override
	public String toString() {
		return "Ability [name=" + name + ", url=" + url + ", id=" + id + "]";
	}
	
	
	//    {
//    "ability": {
//      "name": "limber",
//      "url": "https://pokeapi.co/api/v2/ability/7/"
//    },
//    "is_hidden": false,
//    "slot": 1
//  }
}
