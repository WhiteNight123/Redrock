package three.lv2;

public class DodgeLv1 extends Dodge {
    @Override
    void dodgeEnemy(Enemy enemy) {
        if (enemy.ATK > 3 * DODGE) {
            System.out.println("王子直接逃跑");
        } else {
            enemy.attack(new DodgeLv2());
        }
    }
}
