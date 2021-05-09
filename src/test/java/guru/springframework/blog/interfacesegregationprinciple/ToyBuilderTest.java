package guru.springframework.blog.interfacesegregationprinciple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToyBuilderTest {

    @Test
    void buildToyHouse() {
        ToyHouse toyHouse=ToyBuilder.buildToyHouse();
        System.out.println(toyHouse);
    }

    @Test
    void buildToyCar() {
        ToyCar toyCar=ToyBuilder.buildToyCar();;
        System.out.println(toyCar);
    }

    @Test
    void buildToyPlane() {
        ToyPlane toyPlane=ToyBuilder.buildToyPlane();
        System.out.println(toyPlane);
    }
}
