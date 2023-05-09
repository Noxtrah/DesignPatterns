public class InvisibilitySpell implements Command {
    Target target;
    Size prevVis;

    public InvisibilitySpell() {

    }

    @Override
    public void execute(Target target) {
        this.target = target;
        prevVis = target.getSize();
        System.out.println("Wizard casts " + getClass().getName() + " at Goblin [Size:" + target.getSize() +", Visibility:" + target.getVisibility() + "]");

        if(target.getVisibility() == Visibility.VISIBLE){
            target.setVisibility(Visibility.INVISIBLE);
        }
        else{
            System.out.println("Target is already invisible");
        }
        System.out.println("Goblin[Size:" + target.getSize() +", " + target.getVisibility() + "]");
    }

    @Override
    public void undo() {
        target.setSize(prevVis);
        System.out.println("New visibility: " + prevVis);

    }
}
