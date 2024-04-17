package com.venku.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.venku.DMS.Models.Dog;

/**
 * @author S556110 Venkatesh Mudam
 */

public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);

}
