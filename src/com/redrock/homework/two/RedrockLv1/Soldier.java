package com.redrock.homework.two.RedrockLv1;

import java.util.Scanner;

public class Soldier {
    Scanner sc = new Scanner(System.in);
    private String name;
    private int hp;
    private double atk;
    private double def;


    public Soldier(String name, int hp, double atk, double def) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }
    //伤害机制(怪受到的)
    private int attack(Player player,Soldier[] soldiers,int index){
        int atk;
        //伤害= 攻击力 *爆伤* (敌方防御力/(100+敌方防御力))
        atk=(int)(player.getAtk()*3*(soldiers[index].getDef()/(100+soldiers[index].getDef())));
        return atk;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }



    public void setHp(Player player,Soldier[] soldiers,int index) {
        if(soldiers[index].getHp()==0){
            System.out.println(soldiers[index].getName()+"已死亡,不能被攻击...");
            return;
        }
        this.hp=soldiers[index].getHp()-attack(player,soldiers,index);

    }
    public void setHp(){
        this.hp=0;
    }

    public double getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public double getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
    //展示小兵血量
    public void printHp(Soldier[]soldiers) {
        for (int i = 0; i < soldiers.length; i++) {
            if(soldiers[i].getHp()<0){
                soldiers[i].setHp();
            }
            System.out.println(soldiers[i].getName()+"血量:"+soldiers[i].getHp());
        }
    }
}
