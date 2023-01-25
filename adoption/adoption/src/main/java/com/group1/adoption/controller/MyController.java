package com.group1.adoption.controller;

import com.group1.adoption.model.Adopter;
import com.group1.adoption.model.Dog;
import com.group1.adoption.service.IAdopterService;
import com.group1.adoption.service.IDogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MyController {
    @Autowired
    private IDogService dogService;

    @Autowired
    private IAdopterService adopterService;

    //Get all records of dogs
    @RequestMapping("/api/dogs")
    public List<Dog> findDogs(){
        return dogService.findAll();
    }
    //Get all records of adopters
    @RequestMapping("/api/adopters")
    public List<Adopter> findAdopters() {return adopterService.findAll(); }

    //Get a single record of a dog
    @RequestMapping("/api/show-dog/{id}")
    public Dog showDog(@PathVariable long id) {
        return dogService.getDog(id);
    }
    //Get a single record of an adopter
    @RequestMapping("/api/show-adopter/{id}")
    public Adopter showAdopter(@PathVariable long id) {return adopterService.getAdopter(id); }

    //Add dog
    @RequestMapping(value = "/api/add-dog", method = RequestMethod.POST)
    public Dog addDogSubmit(@RequestBody Dog dog){
        return dogService.addDog(dog);
    }
    //Add adopter
    @RequestMapping(value = "/api/add-adopter", method = RequestMethod.POST)
    public Adopter addAdopterSubmit(@RequestBody Adopter adopter) {return adopterService.addAdopter(adopter); }

    //Edit dog
    @RequestMapping(value = "/api/update-dog/{id}", method = RequestMethod.PUT)
    public Dog updateDog(@RequestBody Dog dog){
        return dogService.updateDog(dog);
    }
    //Edit adopter
    @RequestMapping(value = "/api/update-adopter/{id}", method = RequestMethod.PUT)
    public Adopter updateAdopter(@RequestBody Adopter adopter) { return adopterService.updateAdopter(adopter); }

    //Delete dog
    @RequestMapping(value = "/api/delete-dog/{id}", method = RequestMethod.DELETE)
    public void deleteDog(@PathVariable("id") long id){
        dogService.deleteDog(id);
    }
    //Delete adopter
    @RequestMapping(value = "/api/delete-adopter/{id}", method = RequestMethod.DELETE)
    public void deleteAdopter(@PathVariable("id") long id) {adopterService.deleteAdopter(id); }
}
