package ar.com.desafio5.service.users;

import ar.com.desafio5.domain.users.Company;
import ar.com.desafio5.service.EntidadBaseService;
import ar.com.desafio5.repository.users.CompanyRepositoryImpl;

public class CompanyServiceImpl extends EntidadBaseService<Company> implements CompanyService {

	public CompanyServiceImpl () {
		super (new CompanyRepositoryImpl());
	}

}
