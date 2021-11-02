package three.lv2;

public class Lv2 {
    public static void main(String[] args) {
        Enemy[] enemies = new Enemy[4];
        enemies[0] = new Enemy(301);
        enemies[1] = new Enemy(201);
        enemies[2] = new Enemy(101);
        enemies[3] = new Enemy(99);
        for (int i = 0; i < enemies.length; i++) {
            System.out.println("test" + (i + 1) + ":");
            enemies[i].attack(new DodgeLv1());
        }

    }
}
