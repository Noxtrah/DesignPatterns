//Doğa Kayra Yılmazarslan
public class PreEmptibleMemory extends CondimentDecorator{
    public PreEmptibleMemory(Server server) {
        this.server = server;
    }

    @Override
    public String getDescription() {
        return server.getDescription() + " PE-Memory";
    }

    @Override
    public double cost() {
        return server.cost() +  0.000920;
    }
}
