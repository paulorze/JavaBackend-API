package ar.com.desafio5.domain.pokedex;

import ar.com.desafio5.domain.Entity;

public class Sprites extends Entity{
	private String back_default;
	private String back_shiny;
	private String front_default;
	private String front_shiny;
	public Sprites(Long id, String back_default, String back_shiny, String front_default, String front_shiny) {
		this.id = id;
		init(back_default, back_shiny, front_default, front_shiny);
	}
	
	public Sprites(String back_default, String back_shiny, String front_default, String front_shiny) {
		init(back_default, back_shiny, front_default, front_shiny);
	}

	private void init(String back_default, String back_shiny, String front_default, String front_shiny) {
		this.back_default = back_default;
		this.back_shiny = back_shiny;
		this.front_default = front_default;
		this.front_shiny = front_shiny;
	}
	
	public String getBack_default() {
		return back_default;
	}

	public void setBack_default(String back_default) {
		this.back_default = back_default;
	}

	public String getBack_shiny() {
		return back_shiny;
	}

	public void setBack_shiny(String back_shiny) {
		this.back_shiny = back_shiny;
	}

	public String getFront_default() {
		return front_default;
	}

	public void setFront_default(String front_default) {
		this.front_default = front_default;
	}

	public String getFront_shiny() {
		return front_shiny;
	}

	public void setFront_shiny(String front_shiny) {
		this.front_shiny = front_shiny;
	}

	@Override
	public String toString() {
		return "Sprites [id=" + id + ", back_default=" + back_default + ", back_shiny=" + back_shiny
				+ ", front_default=" + front_default + ", front_shiny=" + front_shiny + "]";
	}
//	  "sprites": {
//    "back_default": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/132.png",
//    "back_shiny": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/shiny/132.png",
//    "front_default": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/132.png",
//    "front_shiny": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/132.png"
//    }
}
