package guru.springframework.sfgdi.repositories;

import org.springframework.stereotype.Component;

/**
 * Created by developer on 2021-05-16.
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreeting() {
        return "Hello World - EN";
    }
}
