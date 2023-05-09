public class CherryMXBrand extends SwitchMaker{
    @Override
    Switch createSwitch(String type) {
        Switch s = null;
        SwitchComponentFactory switchComponentFactory = new CherryMXFactory();
        if (type.equals("linear")) {

            s = new Linear(switchComponentFactory);
            s.setName("CherryMX");


        } else if (type.equals("clicky")) {

            s = new Clicky(switchComponentFactory);
            s.setName("CherryMX");


        } else if (type.equals("clam")) {

            s = new Tactile(switchComponentFactory);
            s.setName("CherryMX");


        }
        return s;
    }

    @Override
    Switch assembleSwitch(String type) {
        Switch s = createSwitch(type);
        s.gatherParts();
        s.placeCoilSpring();
        s.placeStem();
        s.placeKeyCap();
        return s;
    }
}
