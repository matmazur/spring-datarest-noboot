package com.matmazur.repositories;

import com.matmazur.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CityRepository extends JpaRepository<City,Long> {
}
