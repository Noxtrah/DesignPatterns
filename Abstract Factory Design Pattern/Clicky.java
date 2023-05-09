public class Clicky extends Switch{
    SwitchComponentFactory switchComponentFactory;
    public Clicky(SwitchComponentFactory switchComponentFactory) {
        this.switchComponentFactory = switchComponentFactory;
    }

    @Override
    void gatherParts() {
        keyCap = switchComponentFactory.createKeyCap();
        stem = switchComponentFactory.createStem();
        coilSpring = switchComponentFactory.createCoilSpring(PressureCN.Heavy);
    }


}
