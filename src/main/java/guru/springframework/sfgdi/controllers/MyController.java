package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by dmitri on 2021-04-25.
 */
@Controller
public class MyController {

    private final GreetingService greetingService;

    // No need for qualifier if @Primary service bean exists
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
