//Doğa Kayra Yılmazarslan
public class Main {
    public static void main(String[] args){
        Target goblin = new Goblin();
        Wizard wizard = new Wizard();
        ShrinkSpell shrinkSpell = new ShrinkSpell();
        EnlargementSpell enlargementSpell = new EnlargementSpell();
        wizard.castSpell(enlargementSpell,goblin);
        wizard.castSpell(shrinkSpell,goblin);
        shrinkSpell.undo();
    }
}
