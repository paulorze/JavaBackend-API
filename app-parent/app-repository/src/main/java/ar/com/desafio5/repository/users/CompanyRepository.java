package ar.com.desafio5.repository.users;

import java.util.List;

import ar.com.desafio5.domain.users.Company;
import ar.com.desafio5.repository.IBaseRepository;

public interface CompanyRepository extends IBaseRepository<Company> {
	public List<Company> findByUserId(Long id);
}
