package ar.com.desafio5.domain.users;

import ar.com.desafio5.domain.Entity;

public class Company extends Entity {
	private String name;
	private String catchPhrase;
	private String bs;
	
	public Company(Long id, String name, String catchPhrase, String bs) {
		this.id = id;
		this.name = name;
		this.catchPhrase = catchPhrase;
		this.bs = bs;
	}
	
	public Company(String name, String catchPhrase, String bs) {
		this.name = name;
		this.catchPhrase = catchPhrase;
		this.bs = bs;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCatchPhrase() {
		return catchPhrase;
	}

	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}

	public String getBs() {
		return bs;
	}

	public void setBs(String bs) {
		this.bs = bs;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", catchPhrase=" + catchPhrase + ", bs=" + bs + "]";
	}
	
	
//    "company": {
//    "name": "Romaguera-Crona",
//    "catchPhrase": "Multi-layered client-server neural-net",
//    "bs": "harness real-time e-markets"
//  }
}
