public class CherryMXFactory implements SwitchComponentFactory{

    @Override
    public KeyCap createKeyCap() {
        return new CherryMXKeyCap();
    }

    @Override
    public Stem createStem() {
        return new CherryMXLinearStem();
    }

    @Override
    public CoilSpring createCoilSpring(PressureCN pressureCN) {
        if(pressureCN== PressureCN.Light){
            return new CherryMXCoil(35);
        }
        if(pressureCN== PressureCN.Medium){
            return new CherryMXCoil(45);
        }
        if(pressureCN== PressureCN.Heavy){
            return new CherryMXCoil(60);
        }
        if(pressureCN== PressureCN.SuperHeavy){
            return new CherryMXCoil(80);
        }
        return null;

    }
}
