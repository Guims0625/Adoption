package com.group1.adoption.service;

import com.group1.adoption.model.Adopter;
import java.util.List;

public interface IAdopterService {
    List<Adopter> findAll();

    Adopter addAdopter(Adopter adopter);

    Adopter updateAdopter(Adopter adopter);

    Adopter getAdopter(long id);

    void deleteAdopter(long id);
}
