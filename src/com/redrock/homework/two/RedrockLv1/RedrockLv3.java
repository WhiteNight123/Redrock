package com.redrock.homework.two.RedrockLv1;

import java.util.Scanner;

public class RedrockLv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop;

        System.out.print("请输入名称:");
        String name = sc.next();
        System.out.print("请输入生命值(1-9999):");
        int hp = sc.nextInt();
        System.out.print("请输入攻击力(1-999):");
        int atk = sc.nextInt();
        System.out.print("请输入防御力(1-999):");
        int def = sc.nextInt();
        Player player = new Player(name,hp,atk,def);
        Soldier[]soldiers=new Soldier[3];
        Fight fight=new Fight();
        soldiers[0]= new Soldier("近战兵", 1000, 100, 50);
        soldiers[1] = new Soldier("炮车", 3000, 200, 100);
        soldiers[2] = new Soldier("主宰先锋", 6000, 300, 200);

        fight.start();
        soldiers[0].printHp(soldiers);
        do {
            System.out.print("请输入你要打的小兵:");
            int index = sc.nextInt();
            soldiers[index].setHp(player,soldiers,index);
            soldiers[0].printHp(soldiers);
            player.setHp(player,soldiers,index);
            player.printHp(player);
            loop=fight.over(player,soldiers);
        }while (loop);

    }
}
