package three.lv2;

public class Enemy {
    public final int ATK;

    public Enemy(int atk) {
        ATK = atk;
    }

    public void attack(Dodge dodge) {
        dodge.dodgeEnemy(this);
    }

    public void attacked() {
        System.out.println("反击成功");
    }
}
