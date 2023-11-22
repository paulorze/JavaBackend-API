package ar.com.desafio5.repository.users;

import java.util.List;

import ar.com.desafio5.domain.users.Address;
import ar.com.desafio5.repository.IBaseRepository;

public interface AddressRepository extends IBaseRepository<Address> {
	public List<Address> findByUserId(Long id);
}
