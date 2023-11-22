package ar.com.desafio5.service.pokedex;

import ar.com.desafio5.domain.pokedex.Item;
import ar.com.desafio5.service.EntidadBaseServiceMTM;
import ar.com.desafio5.repository.pokedex.ItemRepositoryImpl;

public class ItemServiceImpl extends EntidadBaseServiceMTM<Item> implements ItemService {

	public ItemServiceImpl() {
		super(new ItemRepositoryImpl());
	}

}
