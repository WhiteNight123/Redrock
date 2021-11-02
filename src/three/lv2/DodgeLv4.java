package three.lv2;

public class DodgeLv4 extends Dodge {
    @Override
    void dodgeEnemy(Enemy enemy) {
        if (enemy.ATK <= DODGE) {
            System.out.println("王子直接反击");
            enemy.attacked();
        }
    }
}
