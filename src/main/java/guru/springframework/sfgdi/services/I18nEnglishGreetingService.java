package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by developer on 2021-05-08.
 */
public class I18nEnglishGreetingService implements GreetingService {

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return englishGreetingRepository.getGreeting();
    }
}
