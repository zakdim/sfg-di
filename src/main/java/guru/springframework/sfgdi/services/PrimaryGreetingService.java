package guru.springframework.sfgdi.services;


/**
 * Created by dmitri on 2021-05-06.
 */
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY Bean";
    }
}
