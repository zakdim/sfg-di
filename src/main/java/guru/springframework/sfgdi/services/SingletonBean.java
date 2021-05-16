package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

/**
 * Created by developer on 2021-05-16.
 */
@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creating a Singleton bean!!!");
    }

    public String getMyScope() {
        return "I'm a Singleton";
    }
}
