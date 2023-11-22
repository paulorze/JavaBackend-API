package ar.com.desafio5.restapiconnector.connectors.users;

import ar.com.desafio5.restapiconnector.connectors.users.dto.UserJson;

public class APIUserServiceImpl implements APIUserService {

	private APIUserConnector connector;
	
	public APIUserServiceImpl() {
		connector = new APIUserConnector("https://jsonplaceholder.typicode.com/users");
	}
	
	@Override
	public UserJson findById(Long id) {
		return connector.get(Long.toString(id));
	}

}
