package ar.com.desafio5.repository.users;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import ar.com.desafio5.domain.users.Address;
import ar.com.desafio5.repository.BaseCrud;

public class AddressRepositoryImpl extends BaseCrud<Address> implements AddressRepository {

	public AddressRepositoryImpl() {
		super(Address.class, "ADDRESSES");
	}
	
	@Override
	public List<Address> findByUserId(Long id) {
		String sql = "SELECT E.* FROM ARTICULO A\r\n"
				+ "JOIN EDITORIAL E ON A.EDITORIAL_ID = E.ID\r\n"
				+ "WHERE A.ID =" + id;
		return super.getBySQL(sql);
	}
	
	@Override
	protected String getSaveSQL() {
		return "(street, suite, city, zipcode, lat, lng) values (?,?,?,?,?,?)";
	}
	
	@Override
	protected void saveEntity (Address entity, PreparedStatement pst) throws SQLException {
		pst.setString(1, entity.getStreet());
		pst.setString(2, entity.getSuite());
		pst.setString(3, entity.getCity());
		pst.setString(4, entity.getZipcode());
		pst.setString(5, entity.getLat());
		pst.setString(6, entity.getLng());
	}
	
	@Override
	protected String getUpdateSQL() {
		return "street = ?, suite = ?, city = ?, zipcode = ?, lat = ?, lng = ?";
	}
	
	@Override
	protected void setUpdateSQL(Address entity, PreparedStatement pst) throws SQLException {
		pst.setString(1, entity.getStreet());
		pst.setString(2, entity.getSuite());
		pst.setString(3, entity.getCity());
		pst.setString(4, entity.getZipcode());
		pst.setString(5, entity.getLat());
		pst.setString(6, entity.getLng());
	}
	
	@Override
	protected Address fromResultSetToEntity (ResultSet res) throws SQLException {
		Long id = res.getLong(1);
		String street = res.getString(2);
		String suite = res.getString(3);
		String city = res.getString(4);
		String zipcode = res.getString(5);
		String lat = res.getString(6);
		String lng = res.getString(7);
		return new Address (id, street, suite, city, zipcode, lat, lng);
	}
}
