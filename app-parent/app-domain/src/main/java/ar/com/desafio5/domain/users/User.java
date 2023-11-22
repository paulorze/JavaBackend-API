package ar.com.desafio5.domain.users;

import ar.com.desafio5.domain.Entity;

public class User extends Entity{
	private String name;
	private String username;
	private String email;
	private Address address;
	private String phone;
	private String website;
	private Company company;
	
	public User(Long id, String name, String username, String email, Address address, String phone, String website, Company company) {
		this.id = id;
		init(name, username, email, address, phone, website, company);
	}
	
	public User(String name, String username, String email, Address address, String phone, String website,
			Company company) {
		init(name, username, email, address, phone, website, company);
	}

	private void init(String name, String username, String email, Address address, String phone, String website, Company company) {
		this.name = name;
		this.username = username;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.website = website;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ",\n name=" + name + ",\n username=" + username + ",\n email=" + email + ",\n address="
				+ address + ",\n phone=" + phone + ",\n website=" + website + ",\n company=" + company + "]\n";
	}
	
//	  {
//		    "id": 1,
//		    "name": "Leanne Graham",
//		    "username": "Bret",
//		    "email": "Sincere@april.biz",
//		    "address": {
//		      "street": "Kulas Light",
//		      "suite": "Apt. 556",
//		      "city": "Gwenborough",
//		      "zipcode": "92998-3874",
//		      "geo": {
//		        "lat": "-37.3159",
//		        "lng": "81.1496"
//		      }
//		    },
//		    "phone": "1-770-736-8031 x56442",
//		    "website": "hildegard.org",
//		    "company": {
//		      "name": "Romaguera-Crona",
//		      "catchPhrase": "Multi-layered client-server neural-net",
//		      "bs": "harness real-time e-markets"
//		    }
//		  },
}
