package three.lv1;

public class Soldier implements FightInterface {
    private int hp = 50;

    @Override
    public void fight(FightInterface fightInterface) {
        if (hp > 0) {
            hp -= 10;
            System.out.println("soldier受到10点伤害");
            if (hp > 0) {

                attack(fightInterface);
            } else {
                System.out.println("soldier\tdie...");
            }
        }
    }

    public void attack(FightInterface fightInterface) {
        System.out.println("soldier\thp=" + hp);
        fightInterface.fight(this);
    }
}
