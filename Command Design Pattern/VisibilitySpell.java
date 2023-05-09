public class VisibilitySpell implements Command {
    Target target;
    Size prevVis;

    public VisibilitySpell() {

    }

    @Override
    public void execute(Target target) {
        this.target = target;
        prevVis = target.getSize();
        System.out.println("Wizard casts " + getClass().getName() + " at Goblin [Size:" + target.getSize() +", Visibility:" + target.getVisibility() + "]");

        if(target.getVisibility() == Visibility.INVISIBLE){
            target.setVisibility(Visibility.VISIBLE);
        }
        else{
            System.out.println("Target is already visible");
        }
        System.out.println("Goblin[Size:" + target.getSize() +", " + target.getVisibility() + "]");
    }

    @Override
    public void undo() {
        target.setSize(prevVis);
        System.out.println("New visibility: " + prevVis);

    }
}
