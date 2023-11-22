package ar.com.desafio5.service.users;

import ar.com.desafio5.domain.users.User;
import ar.com.desafio5.service.EntidadBaseService;
import ar.com.desafio5.repository.users.UserRepositoryImpl;

public class UserServiceImpl extends EntidadBaseService<User> implements UserService {

	public UserServiceImpl() {
		super(new UserRepositoryImpl());
	}

}
