package ar.com.desafio5.restapiconnector.connectors.users;

import java.util.List;

import ar.com.desafio5.restapiconnector.connectors.RestClientConnector;
import ar.com.desafio5.restapiconnector.connectors.users.dto.UserJson;
import jakarta.ws.rs.core.GenericType;

public class APIUserConnector extends RestClientConnector<UserJson> {

	public APIUserConnector(String url) {
		super(url, UserJson.class, new GenericType<List<UserJson>>() {});
	}

}
