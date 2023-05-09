public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        Pizza pizza;
        if(item.equals("cheese")){
            pizza = new ChicagoStyleCheesePizza();
            return pizza;
        }

        return null;
    }
}
