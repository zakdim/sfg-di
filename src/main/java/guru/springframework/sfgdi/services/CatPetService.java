package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by developer on 2021-05-08.
 */
@Service("cat")
public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
