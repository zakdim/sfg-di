package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;

/**
 * Created by developer on 2021-05-08.
 */
@Profile({"dog", "default"})
public class DogPetService {
    public String getPetType() {
        return "Dogs are the best!";
    }
}
