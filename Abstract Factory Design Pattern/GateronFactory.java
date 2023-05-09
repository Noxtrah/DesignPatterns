public class GateronFactory implements SwitchComponentFactory{
    @Override
    public KeyCap createKeyCap() {
        return new GateronKeyCap();
    }

    @Override
    public Stem createStem() {
        return new GateronLinearStem();
    }

    @Override
    public CoilSpring createCoilSpring(PressureCN pressureCN) {
        if(pressureCN== PressureCN.Light){
            return new GateronCoil(35);
        }
        if(pressureCN== PressureCN.Medium){
            return new GateronCoil(45);
        }
        if(pressureCN== PressureCN.Heavy){
            return new GateronCoil(60);
        }
        if(pressureCN== PressureCN.SuperHeavy){
            return new GateronCoil(80);
        }
        return null;

    }

}
