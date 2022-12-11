package com.dev.delta.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Package;
import com.dev.delta.repositories.PackageRepository;
@Service
public class PackageService {
	/**
	 * packageRepository
	 */
	@Autowired
	private PackageRepository packageRepository;
	

	/**
	 * getPackages
	 * @return
	 */
	public java.util.List<Package> getPackages()
	{
		return packageRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return packageRepository.count();
	}

	/**
	 * save
	 * @param package
	 */
	public void save(Package packages)
	{
		packageRepository.save(packages);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Package> findById(Long id) {
		return packageRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(Long id) {
		packageRepository.delete(packageRepository.findById(id).get());
	}
}
