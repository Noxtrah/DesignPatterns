public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Deep Dish Cheese Pizza";
        System.out.println(name);
        dough = "Extra Thick Crust Dough";
        System.out.println(dough);
        sauce = "Plum Tomato Sauce";
        System.out.println(sauce);
        toppings.add("Shredded Mozzarella Cheese");
    }

    void cutting(){
        System.out.println("Cutting the pizza into square slices.");
    }
}
