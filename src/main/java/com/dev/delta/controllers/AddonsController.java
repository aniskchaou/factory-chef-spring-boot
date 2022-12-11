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

import com.dev.delta.entities.Addons;
import com.dev.delta.services.AddonsService;

@Controller
public class AddonsController {
	/**
	 * addonsService
	 */
	@Autowired
	private AddonsService addonsService;

	/**
	 * getCountries
	 * @param model
	 * @return
	 */
	@GetMapping("/addonss")
	public String getCountries(Model model) {
		List<Addons> countrries = addonsService.getAddonss();
		model.addAttribute("countries", countrries);
		return "website/addons";
	}

	/**
	 * addAddons
	 * @param addons
	 * @param model
	 * @return
	 */
	@PostMapping("/addaddons")
	public String addAddons(Addons addons, Model model) {
		addonsService.save(addons);
		return "redirect:/countries";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/addons/{id}")
	public String findById(@PathVariable("id") Long id, Model model) {

		Addons addons = addonsService.findById(id).get();
		model.addAttribute("addons", addons);

		return "editAddons";
	}

	/**
	 * updateAddons
	 * @param id
	 * @param addons
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateaddons/{id}")
	public String updateAddons(@PathVariable("id") long id, @Validated Addons addons, 
			BindingResult result,
			Model model) {

		addonsService.save(addons);
		return "redirect:/countries";
	}

	/**
	 * deleteAddons
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteaddons/{id}")
	@Transactional
	public String deleteAddons(@PathVariable("id") Long id) {
		addonsService.delete(id);
		return "redirect:/countries";
	}
}
