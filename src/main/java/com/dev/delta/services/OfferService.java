package com.dev.delta.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Offer;
import com.dev.delta.repositories.OfferRepository;
@Service
public class OfferService {
	/**
	 * offerRepository
	 */
	@Autowired
	private OfferRepository offerRepository;
	

	/**
	 * getOffers
	 * @return
	 */
	public java.util.List<Offer> getOffers()
	{
		return offerRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return offerRepository.count();
	}

	/**
	 * save
	 * @param offer
	 */
	public void save(Offer offer)
	{
		offerRepository.save(offer);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Offer> findById(Long id) {
		return offerRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(Long id) {
		offerRepository.delete(offerRepository.findById(id).get());
	}
}
