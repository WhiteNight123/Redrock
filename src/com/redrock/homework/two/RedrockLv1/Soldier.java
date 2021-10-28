package com.redrock.homework.two.RedrockLv1;

import java.util.Scanner;

public class Soldier extends Character {
    Scanner sc = new Scanner(System.in);
    private Hero hero;

    public Soldier(String name, int hp, double atk, double def) {
        super(name, hp, atk, def);
    }

    @Override
    public void attacked(int damage, FightInterface fi, boolean loop, Character c1, Character[] c2, int index) {
        if (loop) {
            setDamage(c2[index], c1);
            modifyHp(getDamage());
            System.out.println(getName() + "受到了" + getDamage() + "点伤害");
        }
        if (c2[index].getHp() <= 0) {
            c2[index].setHp(0);
            System.out.println(c2[index].getName() + "已阵亡");
        }
        if (ifExist(c2)) {
            System.out.println("你成功清了一波线...");
            System.out.println("\nVictory");
            return;
        } else {
            attack(fi, c1, c2);
        }
    }

    //小兵是否全部阵亡
    public boolean ifExist(Character[] c2) {
        int count = c2.length;
        for (int i = 0; i < c2.length; i++) {
            if (c2[i].getHp() == 0) {
                count--;
            }
        }
        if (count == 0) {
            return true;
        }
        return false;
    }

    //小兵攻击
    public void attack(FightInterface fi, Character c1, Character[] c2) {
        fi.attacked(damage, this, true, c1, c2, hp); //hp没有任何意义
    }

    //计算伤害 伤害= 攻击力 * 爆率 * (1-(敌方防御力/(100+敌方防御力)))  (英雄对小兵的伤害*2)
    public void setDamage(Character c1, Character c2) { //c1是己方 c2是敌方
        int s = (int) (Math.random() * 10);//生成随机数
        this.damage = (int) (s + c2.getAtk() * 2 * (1.0 - c1.getDef() / (100 + c1.getDef())));
    }

    //修改血量
    public void modifyHp(int damage) {
        this.hp -= damage;
    }

    //无用
    @Override
    public void skill(Character c1) {
    }

    //无用
    @Override
    public void equip(FightInterface fi, Hero hero) {
    }
}
