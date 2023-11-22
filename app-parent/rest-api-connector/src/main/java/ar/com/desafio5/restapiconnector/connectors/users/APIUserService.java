package ar.com.desafio5.restapiconnector.connectors.users;

import ar.com.desafio5.restapiconnector.connectors.users.dto.UserJson;

public interface APIUserService {
	public UserJson findById(Long id);
}
