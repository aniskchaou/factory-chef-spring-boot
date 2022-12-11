package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Package;

public interface PackageRepository extends JpaRepository<Package,Long> {

}
