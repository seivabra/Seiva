/**
 * 
 */
package br.com.motivo.sga.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.motivo.sga.model.Item;
import br.com.motivo.sga.repository.ItemRepository;

/**
 * @author ferrete
 * 
 */
@Service
public class ItemService {

	@Autowired
	ItemRepository itemRepository;

	public void createItem(final Item item) {

		itemRepository.save(item);
	}

	public void deleteItem(final Item item) {

		itemRepository.delete(item);
	}

}
