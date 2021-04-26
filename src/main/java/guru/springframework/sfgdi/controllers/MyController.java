package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by dmitri on 2021-04-25.
 */
@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hello World!!!");

        return "Hi Folks!";
    }
}
