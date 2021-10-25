package com.redrock.homework.two.RedrockLv1;

import java.util.Scanner;
//玩家
public class Player {
    Scanner sc = new Scanner(System.in);
    private String name;
    private int hp;
    private int atk;
    private double def;

    //初始化玩家信息
    {
        //没啥用

    }

    public Player() {
    }

    public Player(String name, int hp, int atk, double def) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }
    //伤害机制(人受到的)
    private int attack(Player player,Soldier[] soldiers) {
        int atk = 0;
        int a = 0;
        for (int i = 0; i < soldiers.length; i++) {
            if (soldiers[i].getHp() > 0) {
                //伤害= 攻击力 * (敌方防御力/(100+敌方防御力))
                atk = (int) (soldiers[i].getAtk() * (player.getDef() / (100 + player.getDef())));
                a=atk;
            }
        }
        return a;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() <= 20) {
            this.name = name;
        } else {
            System.out.println("名字不合要求...");
        }
    }

    public int getHp() {
        return hp;
    }
    public void printHp(Player player){
        if(player.getHp()<0){
            player.setHp();
        }
        System.out.println(player.getName()+"血量:"+player.getHp());
    }

    public void setHp(int hp) {
        if (atk < 10000 && atk > 0) {
            this.hp = hp;
        } else {
            System.out.println("生命值超出范围");
        }
    }
    public void setHp(){
        this.hp=0;
    }
    public void setHp(Player player,Soldier[] soldiers,int index) {
        if(soldiers[index].getHp()==0){
            return;
        }
        this.hp=player.getHp()-attack(player,soldiers);

    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        if (atk < 1000 && atk > 0) {
            this.atk = atk;
        } else {
            System.out.println("攻击力超出范围");
        }
    }

    public double getDef() {
        return def;
    }

    public void setDef(int def) {
        if (def < 1000 && def > 0) {
            this.def = def;
        } else {
            System.out.println("防御力超出范围");
        }
    }
}