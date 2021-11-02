package three.lv2;

public class DodgeLv2 extends Dodge {
    @Override
    void dodgeEnemy(Enemy enemy) {
        if (enemy.ATK > DODGE * 2) {
            System.out.println("王子挡下一击后再逃跑");
        } else {
            enemy.attack(new DodgeLv3());
        }
    }
}
