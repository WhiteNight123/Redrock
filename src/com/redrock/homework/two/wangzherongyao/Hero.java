package com.redrock.homework.two.wangzherongyao;

import java.util.Scanner;

public class Hero extends Character implements FightInterface {
    Scanner sc = new Scanner(System.in);

    private double crit = 1.1; //暴击率

    public void start() {//初始化英雄
        setName();
        setHp();
        setAtk();
        setDef();
    }

    public Hero() {
    }

    @Override
    public void attacked(int damage, FightInterface fi, boolean loop, Character c1, Character c2) {
        if (loop) {
            setDamage(c1, c2); //计算伤害
            modifyHp(getDamage()); //减血
            System.out.println(getName()+"受到了"+getDamage()+"点伤害");
        }
        if (getHp() > 0) {
            System.out.println(getName()+"血量:"+getHp());
            attack(fi, c1, c2); //继续攻击
        }else {
            setHp(0); //英雄死亡
            System.out.println(getName()+"已阵亡");
        }
    }
    //攻击方法
    public void attack(FightInterface fi, Character c1, Character c2) {
        fi.attacked(damage, this, true, c1, c2);
    }
    //计算伤害 伤害= 攻击力 * 爆率 * (敌方防御力/(100+敌方防御力))
    public void setDamage(Character c1,Character c2){ //c1是己方 c2是敌方
        this.damage = (int) (c2.getAtk() * (c1.getDef() / (100 + c1.getDef())));
    }
    //修改血量
    public void modifyHp(int damage){
        this.hp-=damage;
    }

    public void setName() {
        while (true) {
            System.out.print("请输入名称:");
            String name = sc.next();
            if (name.length() <= 20) {
                this.name = name;
                break;
            } else {
                System.out.println("名字不合要求...");
            }
        }
    }

    public void setHp() {
        while (true) {
            System.out.print("请输入血量:");
            int hp = sc.nextInt();
            if (hp > 0 && hp < 10000) {
                this.hp = hp;
                break;
            } else {
                System.out.println("血量不合要求...");
            }
        }
    }


    public void setAtk() {
        while (true) {
            System.out.print("请输入攻击力:");
            double atk = sc.nextInt();
            if (atk > 0 && atk < 1000) {
                this.atk = atk;
                break;
            } else {
                System.out.println("攻击力不合要求...");
            }
        }
    }

    public void setDef() {
        while (true) {
            System.out.print("请输入防御力:");
            int def = sc.nextInt();
            if (def > 0 && def < 1000) {
                this.def = hp;
                break;
            } else {
                System.out.println("防御力不合要求...");
            }
        }
    }

    public double getCrit() {
        return crit;
    }

    public void setCrit(double crit) {
        this.crit = crit;
    }


}
