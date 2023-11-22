package ar.com.desafio5.service.users;

import ar.com.desafio5.domain.users.Address;
import ar.com.desafio5.service.EntidadBaseService;
import ar.com.desafio5.repository.users.AddressRepositoryImpl;


public class AddressServiceImpl extends EntidadBaseService<Address> implements AddressService {

	public AddressServiceImpl () {
		super(new AddressRepositoryImpl());
	}

}
