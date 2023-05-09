public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza(){
        name = "NY Style Sauce and Cheese Pizza";
        System.out.println(name);
        dough = "Thin Crust Dough";
        System.out.println(dough);
        sauce = "Marinara Sauce";
        System.out.println(sauce);

        toppings.add("Grated Reggiano Cheese");
    }
    void cutting(){
        System.out.println("Cutting the pizza into diagonal slices.");
    }
}
