package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
