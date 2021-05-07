package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by dmitri on 2021-05-06.
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY Bean";
    }
}
