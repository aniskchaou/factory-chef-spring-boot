package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Offer;

public interface OfferRepository extends JpaRepository<Offer, Long> {

}
