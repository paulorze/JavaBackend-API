package ar.com.desafio5.repository.users;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ar.com.desafio5.domain.users.Address;
import ar.com.desafio5.domain.users.Company;
import ar.com.desafio5.domain.users.User;
import ar.com.desafio5.repository.BaseCrud;

public class UserRepositoryImpl extends BaseCrud<User> implements UserRepository {

	public UserRepositoryImpl() {
		super(User.class, "USERS");
	}

	@Override
	protected String getSaveSQL() {
		return "(name, username, email, address, phone, website, company) values (?,?,?,?,?,?,?)";
	}

	@Override
	protected void saveEntity(User entity, PreparedStatement pst) throws SQLException {
		pst.setString(1, entity.getName());
		pst.setString(2, entity.getUsername());
		pst.setString(3, entity.getEmail());
		pst.setLong(4, entity.getAddress().getId());
		pst.setString(5, entity.getPhone());
		pst.setString(6, entity.getWebsite());
		pst.setLong(7, entity.getCompany().getId());
	}


	@Override
	protected String getUpdateSQL() {
		return "name = ?, username = ?, email = ?, address = ?, phone = ?, website = ?, company = ?";
	}

	@Override
	protected void setUpdateSQL(User entity, PreparedStatement pst) throws SQLException {
		pst.setString(1, entity.getName());
		pst.setString(2, entity.getUsername());
		pst.setString(3, entity.getEmail());
		pst.setLong(4, entity.getAddress().getId());
		pst.setString(5, entity.getPhone());
		pst.setString(6, entity.getWebsite());
		pst.setLong(7, entity.getCompany().getId());
	}
	
	@Override
	protected User fromResultSetToEntity(ResultSet res) throws SQLException {
		Long id = res.getLong(1);
		String name = res.getString(2);
		String username = res.getString(3);
		String email = res.getString(4);
		AddressRepositoryImpl addressRepository = new AddressRepositoryImpl();
		Address address = addressRepository.getById(res.getLong(5));
		String phone = res.getString(6);
		String website = res.getString(7);
		CompanyRepositoryImpl companyRepository = new CompanyRepositoryImpl();
		Company company= companyRepository.getById(res.getLong(8));
		return new User (id, name, username, email, address, phone, website, company);
	}

}
