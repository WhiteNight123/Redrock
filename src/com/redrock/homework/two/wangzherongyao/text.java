package com.redrock.homework.two.wangzherongyao;

public class text {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.start(); //初始化英雄
        Soldier soldier = new Soldier("小兵",2000,100,100);
        FightInterface fi= (FightInterface) soldier;
        System.out.println("欢迎来到王者荣耀");
        System.out.println("全军出击");

        hero.attack(fi,hero,soldier); //英雄先攻击小兵

        System.out.println("\n游戏结束");
    }
}
