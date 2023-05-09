//Doğa Kayra Yılmazarslan
public class OnDemandvCPU extends CondimentDecorator{

    public OnDemandvCPU(Server server) {
        this.server = server;
    }

    @Override
    public String getDescription() {
        return server.getDescription() + " OD-vCPU";
    }

    @Override
    public double cost() {
        return server.cost() + 0.022890;
    }
}
