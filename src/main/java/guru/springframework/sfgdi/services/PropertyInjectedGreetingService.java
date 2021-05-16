package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by dmitri on 2021-05-06.
 */
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
