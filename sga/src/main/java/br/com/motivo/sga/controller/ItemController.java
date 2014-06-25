/**
 * 
 */
package br.com.motivo.sga.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.motivo.sga.model.Item;
import br.com.motivo.sga.service.ItemService;

/**
 * @author ferrete
 * 
 */
@Controller
@RequestMapping(value = "/protected/item")
public class ItemController {

	@Autowired
	ItemService itemService;

	@RequestMapping(value = "/create")
	public void createItem(@ModelAttribute("item") Item item) {

		itemService.createItem(item);
	}

	@RequestMapping(value = "/delete")
	public void deleteItem(@ModelAttribute("item") Item item) {

		itemService.deleteItem(item);
	}

}
