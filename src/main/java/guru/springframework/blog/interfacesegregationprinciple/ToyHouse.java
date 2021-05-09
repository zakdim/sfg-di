package guru.springframework.blog.interfacesegregationprinciple;

/**
 * Created by developer on 2021-05-09.
 */
public class ToyHouse implements Toy {
    double price;
    String color;

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return "ToyHouse: Toy house- Price: "+price+" Color: "+color;
    }
}
