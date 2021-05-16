package com.springframework.pets;


/**
 * Created by developer on 2021-05-08.
 */
public class DogPetService implements PetService {
    public String getPetType() {
        return "Dogs are the best!";
    }
}
