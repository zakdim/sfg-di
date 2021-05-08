package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.PetService;

/**
 * Created by developer on 2021-05-08.
 */
public class PetController {

    private final PetService petService;

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
