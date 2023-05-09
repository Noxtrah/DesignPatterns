import java.util.Random;

public class Ranged implements IHeroAttackType{
    Random random = new Random();
    @Override
    public void attack(Hero target) {
        int successful_hit = random.nextInt(2);
        if(successful_hit == 0) {
            target.setHP(target.getHP() - 40);
            System.out.println(target.getHeroName() + " dealed 40 damage");
        }
        else {
            target.setHP(target.getHP() - 20);
            System.out.println(target.getHeroName() + " dealed 20 damage");
        }
    }
}
