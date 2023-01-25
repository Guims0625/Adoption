package com.group1.adoption.service;

import com.group1.adoption.model.Dog;
import com.group1.adoption.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class DogService implements IDogService {
    @Autowired
    private DogRepository repository;

    @Override
    public List<Dog> findAll() {
        return (List<Dog>) repository.findAll();
    }

    @Override
    public Dog addDog(Dog dog) {
        return repository.save(dog);
    }

    @Override
    public Dog updateDog(Dog dog) {
        return repository.save(dog);
    }

    @Override
    public void deleteDog(long id) {
        repository.deleteDogById(id);
    }

    @Override
    public Dog getDog(long id) {
        Optional optional = repository.findById(id);
        if(optional.isEmpty())
            return null;
        else
            return (Dog) optional.get();
    }

}