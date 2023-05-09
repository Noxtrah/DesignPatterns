

public class Warrior extends Hero{

    public Warrior(String heroName) {
        super(new Melee());
        setHeroName(heroName);
    }

    @Override
    public void display() {
        System.out.println("Hero name: " + getHeroName());
        System.out.println("Hero class: " + getClass().getName());
        System.out.println("Attack Type: " + getHeroAttackType().getClass().getName());
        System.out.println("Current HP: " + getHP());
        System.out.println();
    }


}
