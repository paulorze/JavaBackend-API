package ar.com.desafio5.domain.pokedex;

import java.math.BigDecimal;
import java.util.List;

import ar.com.desafio5.domain.Entity;

public class Pokemon  extends Entity{
	private List<Ability> abilities;
	private Long base_experience;
	private List<Form> forms;
	private BigDecimal height;
	private List<Item> held_items;
	private String location_area_encounters;
	private List<Move> moves;
	private String name;
	private Species species;
	private Sprites sprites;
	private List<Stat> stats;
	private List<Type> types;
	private BigDecimal weight;
	
	public Pokemon(List<Ability> abilities, Long base_experience, List<Form> forms, BigDecimal height,
			List<Item> held_items, Long id, String location_area_encounters,
			List<Move> moves, String name, Species species, Sprites sprites, List<Stat> stats,
			List<Type> types, BigDecimal weight) {
		this.abilities = abilities;
		this.base_experience = base_experience;
		this.forms = forms;
		this.height = height;
		this.held_items = held_items;
		this.id = id;
		this.location_area_encounters = location_area_encounters;
		this.moves = moves;
		this.name = name;
		this.species = species;
		this.sprites = sprites;
		this.stats = stats;
		this.types = types;
		this.weight = weight;
	}

	public Pokemon(Long base_experience, BigDecimal height,
			Long id, String location_area_encounters,
			String name, Species species, Sprites sprites, BigDecimal weight) {
		this.base_experience = base_experience;
		this.height = height;
		this.id = id;
		this.location_area_encounters = location_area_encounters;
		this.name = name;
		this.species = species;
		this.sprites = sprites;
		this.weight = weight;
	}
	
	public List<Ability> getAbilities() {
		return abilities;
	}

	public void setAbilities(List<Ability> abilities) {
		this.abilities = abilities;
	}

	public Long getBase_experience() {
		return base_experience;
	}

	public void setBase_experience(Long base_experience) {
		this.base_experience = base_experience;
	}

	public List<Form> getForms() {
		return forms;
	}

	public void setForms(List<Form> forms) {
		this.forms = forms;
	}

	public BigDecimal getHeight() {
		return height;
	}

	public void setHeight(BigDecimal height) {
		this.height = height;
	}

	public List<Item> getHeld_items() {
		return held_items;
	}

	public void setHeld_items(List<Item> held_items) {
		this.held_items = held_items;
	}

	public String getLocation_area_encounters() {
		return location_area_encounters;
	}

	public void setLocation_area_encounters(String location_area_encounters) {
		this.location_area_encounters = location_area_encounters;
	}

	public List<Move> getMoves() {
		return moves;
	}

	public void setMoves(List<Move> moves) {
		this.moves = moves;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Species getSpecies() {
		return species;
	}

	public void setSpecies(Species species) {
		this.species = species;
	}

	public Sprites getSprites() {
		return sprites;
	}

	public void setSprites(Sprites sprites) {
		this.sprites = sprites;
	}

	public List<Stat> getStats() {
		return stats;
	}

	public void setStats(List<Stat> stats) {
		this.stats = stats;
	}

	public List<Type> getTypes() {
		return types;
	}

	public void setTypes(List<Type> types) {
		this.types = types;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Pokemon [abilities=" + abilities + ",\n base_experience=" + base_experience + ",\n forms=" + forms
				+ ",\n height=" + height + ",\n held_items=" + held_items + ",\n id=" + id + ",\n location_area_encounters=" + location_area_encounters + "\n, moves=" + moves + ",\n name=" + name
				+ ",\n species=" + species + ",\n sprites=" + sprites + ",\n stats=" + stats + ",\n types=" + types
				+ ",\n weight=" + weight + "]\n";
	}
	
//	{
//		  "abilities": [
//		    {
//		      "ability": {
//		        "name": "limber",
//		        "url": "https://pokeapi.co/api/v2/ability/7/"
//		      },
//		      "is_hidden": false,
//		      "slot": 1
//		    },
//		    {
//		      "ability": {
//		        "name": "imposter",
//		        "url": "https://pokeapi.co/api/v2/ability/150/"
//		      },
//		      "is_hidden": true,
//		      "slot": 3
//		    }
//		  ],
//		  "base_experience": 101,
//		  "forms": [
//		    {
//		      "name": "ditto",
//		      "url": "https://pokeapi.co/api/v2/pokemon-form/132/"
//		    }
//		  ],
//		  "height": 3,
//		  "held_items": [
//		    {
//		      "item": {
//		        "name": "metal-powder",
//		        "url": "https://pokeapi.co/api/v2/item/234/"
//		      }
//		    },
//		    {
//		      "item": {
//		        "name": "quick-powder",
//		        "url": "https://pokeapi.co/api/v2/item/251/"
//		      }
//		    }
//		  ],
//		  "id": 132,
//		  "is_default": true,
//		  "location_area_encounters": "https://pokeapi.co/api/v2/pokemon/132/encounters",
//		  "moves": [
//		    {
//		      "move": {
//		        "name": "transform",
//		        "url": "https://pokeapi.co/api/v2/move/144/"
//		      }
//		    }
//		  ],
//		  "name": "ditto",
//		  "species": {
//		    "name": "ditto",
//		    "url": "https://pokeapi.co/api/v2/pokemon-species/132/"
//		  },
//		  "sprites": {
//		    "back_default": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/132.png",
//		    "back_shiny": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/shiny/132.png",
//		    "front_default": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/132.png",
//		    "front_shiny": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/132.png"
//		    }
//		  },
//		  "stats": [
//		    {
//		      "base_stat": 48,
//		      "effort": 1,
//		      "stat": {
//		        "name": "hp",
//		      }
//		    },
//		    {
//		      "base_stat": 48,
//		      "effort": 0,
//		      "stat": {
//		        "name": "attack",
//		      }
//		    },
//		    {
//		      "base_stat": 48,
//		      "effort": 0,
//		      "stat": {
//		        "name": "defense",
//		      }
//		    },
//		    {
//		      "base_stat": 48,
//		      "effort": 0,
//		      "stat": {
//		        "name": "special-attack",
//		      }
//		    },
//		    {
//		      "base_stat": 48,
//		      "effort": 0,
//		      "stat": {
//		        "name": "special-defense",
//		      }
//		    },
//		    {
//		      "base_stat": 48,
//		      "effort": 0,
//		      "stat": {
//		        "name": "speed",
//		      }
//		    }
//		  ],
//		  "types": [
//		    {
//		      "slot": 1,
//		      "type": {
//		        "name": "normal",
//		      }
//		    }
//		  ],
//		  "weight": 40
//		}
}
