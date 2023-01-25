package com.group1.adoption.service;

import com.group1.adoption.model.Dog;
import java.util.List;

public interface IDogService {
    List<Dog> findAll();

    Dog addDog(Dog dog);

    Dog updateDog(Dog dog);

    Dog getDog(long id);

    void deleteDog(long id);

}