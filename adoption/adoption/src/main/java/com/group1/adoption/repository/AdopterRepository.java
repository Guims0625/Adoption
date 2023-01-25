package com.group1.adoption.repository;

import com.group1.adoption.model.Adopter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdopterRepository extends CrudRepository <Adopter, Long> {
    void deleteAdopterById(long id);
}
