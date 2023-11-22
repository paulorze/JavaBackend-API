package ar.com.desafio5.controllers.parsers.users;

import java.io.IOException;
import java.util.Collection;

import com.fasterxml.jackson.databind.ObjectMapper;

import ar.com.desafio5.domain.ErrorResponse;
import ar.com.desafio5.domain.users.Address;
import ar.com.desafio5.domain.users.Company;
import ar.com.desafio5.domain.users.User;
import ar.com.desafio5.restapiconnector.connectors.users.APIUserServiceImpl;
import ar.com.desafio5.restapiconnector.connectors.users.dto.AddressJson;
import ar.com.desafio5.restapiconnector.connectors.users.dto.CompanyJson;
import ar.com.desafio5.restapiconnector.connectors.users.dto.GeoJson;
import ar.com.desafio5.restapiconnector.connectors.users.dto.UserJson;
import ar.com.desafio5.service.ServiceLocator;
import ar.com.desafio5.service.users.AddressService;
import ar.com.desafio5.service.users.CompanyService;
import ar.com.desafio5.service.users.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/api/users")
public class UsersController extends HttpServlet {

	private static final long serialVersionUID = -3449058469138223915L;
	private UserService service = (UserService) ServiceLocator.getService(UserService.class);
	private CompanyService companyService = (CompanyService) ServiceLocator.getService(CompanyService.class);
	private AddressService addressService = (AddressService) ServiceLocator.getService(AddressService.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (req.getParameter("id") == null || req.getParameter("id").isEmpty()) {
			Collection<User> objects = service.findAll();
			ObjectMapper mapper = new ObjectMapper();
			String json = mapper.writeValueAsString(objects);
			resp.getWriter().print(json);
		} else {			
			Long id = Long.parseLong(req.getParameter("id"));
			User object = service.findById(id);
			if (object == null) {
				APIUserServiceImpl apiConnector = new APIUserServiceImpl();
				try {
					UserJson objectJson = apiConnector.findById(id);
					object = createUser(objectJson);
				} catch (RuntimeException e) {
				    ErrorResponse error = new ErrorResponse(HttpServletResponse.SC_NOT_FOUND, "No data found for ID " + id);
				    ObjectMapper mapper = new ObjectMapper();
				    resp.getWriter().print(mapper.writeValueAsString(error));
				    return;
				} catch (Exception e) {
				    ErrorResponse error = new ErrorResponse(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "There was an unexpected error while trying to save the object.");
				    ObjectMapper mapper = new ObjectMapper();
				    resp.getWriter().print(mapper.writeValueAsString(error));
				    return;
				}
			}
			ObjectMapper mapper = new ObjectMapper();
			String json = mapper.writeValueAsString(object);
			resp.getWriter().print(json);
		}
	}

	private User createUser(UserJson objectJson) {
		User object;
		CompanyJson companyJson = objectJson.company;
		AddressJson addressJson = objectJson.address;
		GeoJson geoJson = addressJson.geo;
		Company company = new Company (companyJson.name, companyJson.catchPhrase, companyJson.bs);
		companyService.save(company);
		Address address = new Address(addressJson.street, addressJson.suite, addressJson.city, addressJson.zipcode, geoJson.lat, geoJson.lng);
		addressService.save(address);
		object = new User(objectJson.name, objectJson.username, objectJson.email, address, objectJson.phone, objectJson.website, company);
		service.save(object);
		return object;
	}
	
}
