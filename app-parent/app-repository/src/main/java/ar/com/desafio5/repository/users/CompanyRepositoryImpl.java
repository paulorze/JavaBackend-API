package ar.com.desafio5.repository.users;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import ar.com.desafio5.domain.users.Company;
import ar.com.desafio5.repository.BaseCrud;

public class CompanyRepositoryImpl extends BaseCrud<Company> implements CompanyRepository {

	public CompanyRepositoryImpl() {
		super(Company.class, "COMPANIES");
	}
	
	@Override
	public List<Company> findByUserId(Long id) {
		String sql = "SELECT E.* FROM ARTICULO A\r\n"
				+ "JOIN EDITORIAL E ON A.EDITORIAL_ID = E.ID\r\n"
				+ "WHERE A.ID =" + id;
		return super.getBySQL(sql);
	}
	
	@Override
	protected String getSaveSQL () {
		return "(name, catchPhrase, bs) values (?,?,?)";
	}
	
	@Override
	protected void saveEntity (Company entity, PreparedStatement pst) throws SQLException {
		pst.setString(1, entity.getName());
		pst.setString(2, entity.getCatchPhrase());
		pst.setString(3, entity.getBs());
	}

	@Override
	protected String getUpdateSQL() {
		return "name = ?, catchPhrase = ?, bs = ?";
	}

	@Override
	protected void setUpdateSQL(Company entity, PreparedStatement pst) throws SQLException {
		pst.setString(1, entity.getName());
		pst.setString(2, entity.getCatchPhrase());
		pst.setString(3, entity.getBs());
	}
	
	@Override
	protected Company fromResultSetToEntity(ResultSet res) throws SQLException {
		Long id = res.getLong(1);
		String name = res.getString(2);
		String catchPhrase = res.getString(3);
		String bs = res.getString(4);
		return new Company(id, name, catchPhrase, bs);
	}
}
