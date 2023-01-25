package com.group1.adoption.repository;

import com.group1.adoption.model.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends CrudRepository <Dog, Long> {
    void deleteDogById(long id);
}
