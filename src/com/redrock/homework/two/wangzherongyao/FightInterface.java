package com.redrock.homework.two.wangzherongyao;

public interface FightInterface {
    //被攻击
    void attacked(int damage,FightInterface fi,boolean loop,Character c1,Character c2);
}
