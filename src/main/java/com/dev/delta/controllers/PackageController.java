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

import com.dev.delta.entities.Package;
import com.dev.delta.services.PackageService;

@Controller
public class PackageController {
	/**
	 * packageService
	 */
	@Autowired
	private PackageService packageService;

	/**
	 * getCountries
	 * @param model
	 * @return
	 */
	@GetMapping("/packages")
	public String getCountries(Model model) {
		List<Package> countrries = packageService.getPackages();
		model.addAttribute("countries", countrries);
		return "package";
	}

	/**
	 * addPackage
	 * @param package
	 * @param model
	 * @return
	 */
	@PostMapping("/addpackage")
	public String addPackage(Package packages, Model model) {
		packageService.save(packages);
		return "redirect:/countries";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/package/{id}")
	public String findById(@PathVariable("id") Long id, Model model) {

		Package packages = packageService.findById(id).get();
		model.addAttribute("package", packages);

		return "editPackage";
	}

	/**
	 * updatePackage
	 * @param id
	 * @param package
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatepackage/{id}")
	public String updatePackage(@PathVariable("id") long id, @Validated Package packages, 
			BindingResult result,
			Model model) {

		packageService.save(packages);
		return "redirect:/countries";
	}

	/**
	 * deletePackage
	 * @param id
	 * @return
	 */
	@GetMapping("/deletepackage/{id}")
	@Transactional
	public String deletePackage(@PathVariable("id") Long id) {
		packageService.delete(id);
		return "redirect:/countries";
	}
}
