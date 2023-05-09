public class Wizard {
    Target target;
    Command command;
    Command previousSpell;

    public Wizard() {}

    public void castSpell(Command command, Target target){
        command.execute(target);
        previousSpell = command;
    }

    public void undo(){
        previousSpell.undo();
    }
}
