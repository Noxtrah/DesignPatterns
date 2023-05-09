public class ShrinkSpell implements Command{
    Target target;
    Size prevSize;

    public ShrinkSpell() {
    }

    @Override
    public void execute(Target target) {
        this.target = target;
        prevSize = target.getSize();
        System.out.println("Wizard casts " + getClass().getName() + " at Goblin [Size:" + target.getSize() +", Visibility:" + target.getVisibility() + "]");
        if(target.getSize() == (Size.LARGE)){
            target.setSize(Size.NORMAL);
            System.out.println("Shrink to Normal");
        }
        else if(target.getSize() == (Size.NORMAL)) {
            target.setSize(Size.SMALL);
            System.out.println("Shrink to Small");
        }
        else{
            System.out.println("Target is already small");
        }
        System.out.println("Goblin[Size:" + target.getSize() +", Visibility:" + target.getVisibility() + "]");
    }

    @Override
    public void undo() {
        target.setSize(prevSize);
        System.out.println("New size: " + prevSize);

    }
}
