package com.dev.delta.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.delta.entities.Item;
import com.dev.delta.services.ItemService;

@Controller
public class ItemController {
	/**
	 * itemService
	 */
	@Autowired
	private ItemService itemService;

	/**
	 * getCountries
	 * @param model
	 * @return
	 */
	@GetMapping("/items")
	public String getCountries(Model model) {
		List<Item> countrries = itemService.getItems();
		model.addAttribute("countries", countrries);
		return "item";
	}

	/**
	 * addItem
	 * @param item
	 * @param model
	 * @return
	 */
	@PostMapping("/additem")
	public String addItem(Item item, Model model) {
		itemService.save(item);
		return "redirect:/countries";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/item/{id}")
	public String findById(@PathVariable("id") Long id, Model model) {

		Item item = itemService.findById(id).get();
		model.addAttribute("item", item);

		return "editItem";
	}

	/**
	 * updateItem
	 * @param id
	 * @param item
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateitem/{id}")
	public String updateItem(@PathVariable("id") long id, @Validated Item item, 
			BindingResult result,
			Model model) {

		itemService.save(item);
		return "redirect:/countries";
	}

	/**
	 * deleteItem
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteitem/{id}")
	@Transactional
	public String deleteItem(@PathVariable("id") Long id) {
		itemService.delete(id);
		return "redirect:/countries";
	}
}
