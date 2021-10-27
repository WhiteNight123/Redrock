package com.redrock.homework.two.wangzherongyao;
//父类
public class Character {
    protected String name;
    protected int hp;
    protected double atk;
    protected double def;
    protected int damage;


    public Character(String name, int hp, double atk, double def) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }


    public int getDamage(){
        return damage;
    }
    public Character() {
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

    public void setHp(int hp) {
        this.hp = hp;
    }


    public double getAtk() {
        return atk;
    }

    public void setAtk(double atk) {
        this.atk = atk;
    }

    public double getDef() {
        return def;
    }

    public void setDef(double def) {
        this.def = def;
    }
}
