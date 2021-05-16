package com.springframework.pets;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by developer on 2021-05-08.
 */
@Profile({"dog", "default"})
@Service
public class DogPetService implements PetService {
    public String getPetType() {
        return "Dogs are the best!";
    }
}
