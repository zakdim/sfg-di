package guru.springframework.sfgdi.services;

/**
 * Created by dmitri on 2021-04-25.
 */
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
