import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();

    public String getName(){
        return name;
    }

    void preparing(){
        System.out.println("Preparing");
    }

    void cooking(){
        System.out.println("Bake for 25 minutes at 350");
    }

    abstract void cutting();
    void boxing(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough... " + dough);
        System.out.println("Adding sauce... " + sauce);
        System.out.println("Adding toppings: ");
        for(String topping : toppings){
            System.out.println("   " + topping);
        }
    }
}
