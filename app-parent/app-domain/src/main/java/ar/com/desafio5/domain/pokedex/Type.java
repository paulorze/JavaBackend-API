package ar.com.desafio5.domain.pokedex;

import ar.com.desafio5.domain.Entity;

public class Type extends Entity {
	private Long slot;
	private String name;
	
	public Type(Long id, Long slot, String name) {
		this.id = id;
		init(slot, name);
	}
	
	public Type(Long slot, String name) {
		init(slot, name);
	}

	private void init(Long slot, String name) {
		this.slot = slot;
		this.name = name;
	}

	public Long getSlot() {
		return slot;
	}

	public void setSlot(Long slot) {
		this.slot = slot;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Type [id=" + id + ", slot=" + slot + ", name=" + name + "]";
	}
}
