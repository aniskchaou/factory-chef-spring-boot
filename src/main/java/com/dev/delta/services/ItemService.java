package com.dev.delta.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Item;
import com.dev.delta.repositories.ItemRepository;
@Service
public class ItemService {
	/**
	 * itemRepository
	 */
	@Autowired
	private ItemRepository itemRepository;
	

	/**
	 * getItems
	 * @return
	 */
	public java.util.List<Item> getItems()
	{
		return itemRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return itemRepository.count();
	}

	/**
	 * save
	 * @param item
	 */
	public void save(Item item)
	{
		itemRepository.save(item);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Item> findById(Long id) {
		return itemRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(Long id) {
		itemRepository.delete(itemRepository.findById(id).get());
	}
}
