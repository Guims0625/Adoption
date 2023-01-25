package com.group1.adoption.service;

import com.group1.adoption.model.Adopter;
import com.group1.adoption.repository.AdopterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class AdopterService implements IAdopterService{
    @Autowired
    private AdopterRepository repository;

    @Override
    public List<Adopter> findAll() {
        return (List<Adopter>) repository.findAll();
    }

    @Override
    public Adopter addAdopter(Adopter adopter) {
        return repository.save(adopter);
    }

    @Override
    public Adopter updateAdopter(Adopter adopter) {
        return repository.save(adopter);
    }

    @Override
    public void deleteAdopter(long id) {
        repository.deleteAdopterById(id);
    }

    @Override
    public Adopter getAdopter(long id) {
        Optional optional = repository.findById(id);
        if(optional.isEmpty())
            return null;
        else
            return (Adopter) optional.get();
    }
}
