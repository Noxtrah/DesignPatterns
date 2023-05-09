//Doğa Kayra Yılmazarslan
public class PreEmptiblevCPU extends CondimentDecorator {
    public PreEmptiblevCPU(Server server) {
        this.server = server;
    }

    @Override
    public String getDescription() {
        return server.getDescription() + " PE-vCPU";
    }

    @Override
    public double cost() {
        return server.cost() +  0.006867;
    }
}
