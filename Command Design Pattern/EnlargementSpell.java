public class EnlargementSpell implements Command {
    Target target;
    Size prevSize;

    public EnlargementSpell() {

    }

    @Override
    public void execute(Target target) {
        this.target = target;
        prevSize = target.getSize();
        System.out.println("Wizard casts " + getClass().getName() + " at Goblin [Size:" + target.getSize() +", Visibility:" + target.getVisibility() + "]");

        if(target.getSize() == (Size.SMALL)){
            target.setSize(Size.NORMAL);
            System.out.println("Enlarged to Normal");
        }
        else if(target.getSize() == (Size.NORMAL)) {
            target.setSize(Size.LARGE);
            System.out.println("Enlarged to Large");
        }
        else{
            System.out.println("Target is already large");
        }
        System.out.println("Goblin[Size:" + target.getSize() +", " + target.getVisibility() + "]");
    }

    @Override
    public void undo() {
        target.setSize(prevSize);
        System.out.println("New size: " + prevSize);

    }
}
