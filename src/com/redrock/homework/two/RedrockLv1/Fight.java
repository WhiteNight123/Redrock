package com.redrock.homework.two.RedrockLv1;

import java.util.Scanner;

public class Fight {
    public void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎来到王者荣耀");
        Hero hero = new Hero();
        hero.start(); //初始化英雄
        //装备
        Equipment[] equipments = new Equipment[6];
        equipments[0] = new Sword("无尽之刃", 100, 0, 1.5, 0);
        equipments[1] = new Sword("破军 ", 200, 0, 1, 0);
        equipments[2] = new Sword("破魔刀", 100, 50, 1, 0);
        equipments[3] = new Armor("不祥征兆", 0, 200, 1, 2000);
        equipments[4] = new Armor("反伤刺甲", 50, 300, 1, 0);
        equipments[5] = new Armor("霸者重装", 0, 50, 1, 2000);
        //小兵
        Soldier[] soldiers = new Soldier[3];
        soldiers[0] = new Soldier("近战兵", 1000, 100, 50);
        soldiers[1] = new Soldier("炮车", 3000, 200, 100);
        soldiers[2] = new Soldier("主宰先锋", 5000, 400, 150);

        System.out.println("请选择你的装备:");
        equipments[0].print(equipments); //展示装备
        int index = sc.nextInt();
        FightInterface eq = equipments[index];
        equipments[index].equip(eq, hero); //穿上装备

        System.out.println("全军出击...");
        FightInterface fi = soldiers[0]; //随便引用一下
        hero.attack(fi, hero, soldiers); //英雄先攻击小兵

    }
}
