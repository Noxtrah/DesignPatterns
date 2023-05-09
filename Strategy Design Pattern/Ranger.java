public class Ranger extends Hero{
    public Ranger(String heroName) {
        super(new Ranged());
        setHeroName(heroName);
    }

    @Override
    public void display() {
        System.out.println("Hero name: " + getHeroName());
        System.out.println("Hero class: Ranger");
        System.out.println("Attack Type: " + getHeroAttackType().getClass().getName());
        System.out.println("Current HP: " + getHP());
        System.out.println();
    }


}
