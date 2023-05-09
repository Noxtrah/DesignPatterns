//Doğa Kayra Yılmazarslan
public class Main {
    public static void main(String[] args){
        Server onDemandE2HighCPU2 = new OnDemandE2HighCPU();
        onDemandE2HighCPU2 = new PreEmptiblevCPU(onDemandE2HighCPU2);
        onDemandE2HighCPU2 = new PreEmptiblevCPU(onDemandE2HighCPU2);

        onDemandE2HighCPU2 = new OnDemandMemory(onDemandE2HighCPU2);
        onDemandE2HighCPU2 = new OnDemandMemory(onDemandE2HighCPU2);
        onDemandE2HighCPU2 = new OnDemandMemory(onDemandE2HighCPU2);
        onDemandE2HighCPU2 = new OnDemandMemory(onDemandE2HighCPU2);

        System.out.println(onDemandE2HighCPU2.getDescription());
        System.out.println(onDemandE2HighCPU2.cost());

        Server preEmptibleE2HighCPU2 = new PreEmptibleE2HighCPU2();
        preEmptibleE2HighCPU2 = new OnDemandvCPU(preEmptibleE2HighCPU2);
        preEmptibleE2HighCPU2 = new OnDemandvCPU(preEmptibleE2HighCPU2);

        preEmptibleE2HighCPU2 = new OnDemandMemory(preEmptibleE2HighCPU2);
        preEmptibleE2HighCPU2 = new OnDemandMemory(preEmptibleE2HighCPU2);
        preEmptibleE2HighCPU2 = new PreEmptibleMemory(preEmptibleE2HighCPU2);
        preEmptibleE2HighCPU2 = new PreEmptibleMemory(preEmptibleE2HighCPU2);

        System.out.println(preEmptibleE2HighCPU2.getDescription());
        System.out.println(preEmptibleE2HighCPU2.cost());

    }
}
