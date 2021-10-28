package com.redrock.homework.two.wangzherongyao;

public class Equipment implements FightInterface {
    protected String name;
    protected double atk;
    protected double def;
    protected double crit;
    protected int hp;

    public Equipment(String name, double atk, double def, double crit, int hp) {
        this.name = name;
        this.atk = atk;
        this.def = def;
        this.crit = crit;
        this.hp = hp;
    }

    public void print1(Equipment eq, int i) {

        System.out.print(i + "." + eq.name);
        if (eq.atk != 0) {
            System.out.print("\t攻击力=" + (int) eq.atk);
        }
        if (eq.def != 0) {
            System.out.print("\t防御力=" + (int) eq.def);
        }
        if (eq.crit != 1) {
            System.out.print("\t暴击率=" + eq.crit);
        }
        if (eq.hp != 0) {
            System.out.print("\t生命值=" + eq.hp);
        }
    }

    public void print(Equipment[] eq) {//打印装备
        for (int i = 0; i < eq.length; i++) {
            print1(eq[i], i);
            System.out.println();
        }
    }

    @Override
    public void attacked(int damage, FightInterface fi, boolean loop, Character c1, Character[] c2, int index) {

    }

    @Override
    public void skill(Character c1) {

    }

    @Override

    public void equip(FightInterface fi, Hero hero) {
        hero.atk += this.atk;
        hero.def += this.def;
        hero.crit *= this.crit;
        hero.hp += this.hp;
        System.out.println(hero.getName() + "装备了" + this.name);
    }

    public Equipment() {
    }
}

class Sword extends Equipment {
    public Sword(String name, double atk, double def, double crit, int hp) {
        super(name, atk, def, crit, hp);
    }

}

class Armor extends Equipment {
    public Armor(String name, double atk, double def, double crit, int hp) {
        super(name, atk, def, crit, hp);
    }

}
