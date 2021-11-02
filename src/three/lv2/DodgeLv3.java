package three.lv2;

public class DodgeLv3 extends Dodge {
    @Override
    void dodgeEnemy(Enemy enemy) {
        if (enemy.ATK > DODGE) {
            System.out.println("王子躲避此次攻击并对对方执行反击");
            enemy.attacked();
        } else {
            enemy.attack(new DodgeLv4());
        }
    }
}
