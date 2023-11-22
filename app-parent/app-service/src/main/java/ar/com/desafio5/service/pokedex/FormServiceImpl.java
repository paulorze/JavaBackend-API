package ar.com.desafio5.service.pokedex;

import ar.com.desafio5.domain.pokedex.Form;
import ar.com.desafio5.service.EntidadBaseServiceMTM;
import ar.com.desafio5.repository.pokedex.FormRepositoryImpl;

public class FormServiceImpl extends EntidadBaseServiceMTM<Form> implements FormService {

	public FormServiceImpl() {
		super(new FormRepositoryImpl());
	}

}
