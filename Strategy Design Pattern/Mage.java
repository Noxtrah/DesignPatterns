public class Mage extends Hero {

    public Mage(String heroName) {
        super(new Magic());
        setHeroName(heroName);
    }

    @Override
    public void display() {
        System.out.println("Hero name: " + getHeroName());
        System.out.println("Hero class: Mage");
        System.out.println("Attack Type: " + getHeroAttackType().getClass().getName());
        System.out.println("Current HP: " + getHP());
        System.out.println();
    }


}
