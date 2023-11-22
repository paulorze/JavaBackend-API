package ar.com.desafio5.domain.pokedex;

import ar.com.desafio5.domain.Entity;

public class Stat extends Entity {
	private Long base_stat;
	private Long effort;
	private String name;
	public Stat(Long id, Long base_stat, Long effort, String name) {
		this.id = id;
		this.base_stat = base_stat;
		init(effort, name);
	}
	
	public Stat(Long base_stat, Long effort, String name) {
		this.base_stat = base_stat;
		init(effort, name);
	}

	private void init(Long effort, String name) {
		this.effort = effort;
		this.name = name;
	}

	public Long getBase_stat() {
		return base_stat;
	}

	public void setBase_stat(Long base_stat) {
		this.base_stat = base_stat;
	}

	public Long getEffort() {
		return effort;
	}

	public void setEffort(Long effort) {
		this.effort = effort;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Stat [id=" + id + ", base_stat=" + base_stat + ", effort=" + effort + ", name=" + name + "]";
	}
	
//    {
//    "base_stat": 48,
//    "effort": 1,
//    "stat": {
//      "name": "hp",
//    }
}
