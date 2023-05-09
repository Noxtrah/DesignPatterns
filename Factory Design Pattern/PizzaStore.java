public abstract class PizzaStore {


    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.preparing();
        pizza.cooking();
        pizza.cutting();
        pizza.boxing();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
