package com.springframework.pets;

/**
 * Created by developer on 2021-05-08.
 */
public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
