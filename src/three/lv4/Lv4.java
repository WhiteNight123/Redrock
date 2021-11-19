package three.lv4;

import java.util.Scanner;

public class Lv4 {
    public static void main(String[] args) {
        Level4();
    }


    public static void Level4() {


        Enemy enemy = new Enemy(getAtk());
        Dodge dodge = new Dodge.Builder()
                .add(new Dodge() {
                    @Override
                    void dodgeEnemy(Enemy enemy) {
                        if (enemy.getATK() > DODGE * 3)
                            System.out.println("王子逃跑");
                        else
                            getNext().dodgeEnemy(enemy);
                    }
                })
                .add(new Dodge() {
                    @Override
                    void dodgeEnemy(Enemy enemy) {
                        if (enemy.getATK() > DODGE * 2)
                            System.out.println("王子挡下一击后逃跑");
                        else
                            getNext().dodgeEnemy(enemy);
                    }
                })
                .add(new Dodge() {
                    @Override
                    void dodgeEnemy(Enemy enemy) {
                        if (enemy.getATK() > DODGE) {
                            System.out.println("王子躲避了此次攻击");
                            enemy.attacked();
                        } else
                            getNext().dodgeEnemy(enemy);
                    }
                })
                .add(new Dodge() {
                    @Override
                    void dodgeEnemy(Enemy enemy) {
                        if (enemy.getATK() < DODGE)
                            enemy.attacked();
                        else
                            getNext().dodgeEnemy(enemy);
                    }
                }).build();

        enemy.attack(dodge);
    }
    //判断是否atk是否正常
    public static int getAtk(){
        Scanner scanner = new Scanner(System.in);
        int atk;
        while (true) {
            System.out.println("请输入攻击力:");
            String atkStr = scanner.next();
            try {
                atk=Integer.parseInt(atkStr);
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是整数...");
            }
        }
        return atk;
    }
}
