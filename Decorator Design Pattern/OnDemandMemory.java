//Doğa Kayra Yılmazarslan
public class OnDemandMemory extends CondimentDecorator {
    public OnDemandMemory(Server server) {
        this.server = server;
    }

    @Override
    public String getDescription() {
        return server.getDescription() + " OD-Memory";
    }

    @Override
    public double cost() {
        return server.cost() + 0.003067;
    }
}
