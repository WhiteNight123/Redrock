package com.redrock.homework.two.wangzherongyao;

public class Soldier extends Character implements FightInterface {

    public Soldier(String name, int hp, double atk, double def) {
        super(name, hp, atk, def);
    }

    @Override
    public void attacked(int damage, FightInterface fi, boolean loop, Character c1, Character c2) {
        if (loop) {
            setDamage(c2, c1);
            modifyHp(getDamage());
            System.out.println("-------------");
            System.out.println(getName()+"受到了"+getDamage()+"点伤害");

        }
        if (getHp() > 0) {
            System.out.println(getName()+"血量:"+getHp());
            attack(fi, c1, c2);
        } else {
            setHp(0);
            System.out.println(getName()+"已阵亡");
        }

    }

    //小兵攻击
    private void attack(FightInterface fi, Character c1, Character c2) {
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
    public Soldier() {
    }
}
