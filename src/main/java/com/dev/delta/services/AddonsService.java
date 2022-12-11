package com.dev.delta.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Addons;
import com.dev.delta.repositories.AddonsRepository;

@Service
public class AddonsService {
	/**
	 * addonsRepository
	 */
	@Autowired
	private AddonsRepository addonsRepository;
	

	/**
	 * getAddonss
	 * @return
	 */
	public java.util.List<Addons> getAddonss()
	{
		return addonsRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return addonsRepository.count();
	}

	/**
	 * save
	 * @param addons
	 */
	public void save(Addons addons)
	{
		addonsRepository.save(addons);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Addons> findById(Long id) {
		return addonsRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(Long id) {
		addonsRepository.delete(addonsRepository.findById(id).get());
	}
}
