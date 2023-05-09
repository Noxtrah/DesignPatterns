
public class Melee implements IHeroAttackType {

    @Override
    public void attack(Hero target) {
        target.setHP(target.getHP() - 30);
        System.out.println(target.getHeroName() + " dealed 30 damage");
    }
}