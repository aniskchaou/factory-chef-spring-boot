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

import com.dev.delta.entities.Offer;
import com.dev.delta.services.OfferService;

@Controller
public class OfferController {
	/**
	 * offerService
	 */
	@Autowired
	private OfferService offerService;

	/**
	 * getCountries
	 * @param model
	 * @return
	 */
	@GetMapping("/offers")
	public String getCountries(Model model) {
		List<Offer> countrries = offerService.getOffers();
		model.addAttribute("countries", countrries);
		return "offer";
	}

	/**
	 * addOffer
	 * @param offer
	 * @param model
	 * @return
	 */
	@PostMapping("/addoffer")
	public String addOffer(Offer offer, Model model) {
		offerService.save(offer);
		return "redirect:/countries";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/offer/{id}")
	public String findById(@PathVariable("id") Long id, Model model) {

		Offer offer = offerService.findById(id).get();
		model.addAttribute("offer", offer);

		return "editOffer";
	}

	/**
	 * updateOffer
	 * @param id
	 * @param offer
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateoffer/{id}")
	public String updateOffer(@PathVariable("id") long id, @Validated Offer offer, 
			BindingResult result,
			Model model) {

		offerService.save(offer);
		return "redirect:/countries";
	}

	/**
	 * deleteOffer
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteoffer/{id}")
	@Transactional
	public String deleteOffer(@PathVariable("id") Long id) {
		offerService.delete(id);
		return "redirect:/countries";
	}
}
