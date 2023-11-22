package ar.com.desafio5.console;

import ar.com.desafio5.domain.users.Address;
import ar.com.desafio5.domain.users.Company;
import ar.com.desafio5.domain.users.User;
import ar.com.desafio5.service.ServiceLocator;
import ar.com.desafio5.service.users.AddressService;
import ar.com.desafio5.service.users.CompanyService;
import ar.com.desafio5.service.users.UserService;

public class UsersApp {

	public static void main(String[] args) {
		UserService userService = (UserService) ServiceLocator.getService(UserService.class);
		AddressService addressService = (AddressService) ServiceLocator.getService(AddressService.class);
		CompanyService companyService = (CompanyService) ServiceLocator.getService(CompanyService.class);
		System.out.println(userService.findAll());
		Long idToFind = (long) 2;
		System.out.println(userService.findById(idToFind));
		String name = "Clementine Bauch";
		String username = "Samantha";
		String email = "Nathan@yesenia.net";
		Address address = new Address("Douglas Extension", "Suite 847", "McKenziehaven", "59590-4157", "-68.6102", "-47.0653");
		addressService.save(address);
		String phone = "1-463-123-4447";
		String website = "ramiro.info";
		Company company = new Company("Romaguera-Jacobson", "Face to face bifurcated interface", "e-enable strategic applications");
		companyService.save(company);
		User user = new User(name, username, email, address, phone, website, company);
		userService.save(user);
		System.out.println(userService.findById(user.getId()));
		address.setStreet("SiempreViva 123");
		addressService.update(address);
		company.setName("ACME");
		companyService.update(company);
		user.setName("Juan Merca");
		userService.update(user);
		System.out.println(userService.findById(user.getId()));
		addressService.deleteById(address.getId());
		companyService.deleteById(company.getId());
		userService.deleteById(user.getId());
		System.out.println(userService.findAll());
	}

}
