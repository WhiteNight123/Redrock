package com.redrock.homework.two.RedrockLv1;

import java.util.Scanner;
public class Fight {

    private int round = 5;//5轮结束

    //战斗
    public void game(Player player, Soldier[] soldiers) {
        start();


    }

    //开始界面
    public void start() {
        System.out.println("欢迎来到王者荣耀");
        System.out.println("敌军还有5秒到达战场");
        System.out.println("全军出击");
    }

    //真正战斗
    public void fight(Player player, Soldier[] soldiers){

    }

    //结束
    public boolean over(Player player, Soldier[] soldiers) {
        int count=0;
            if (player.getHp() == 0) {
                System.out.println("Executed\nDefeat");
                return false;
            }

            for (int j = 0; j < soldiers.length; j++) {
                if (soldiers[j].getHp() == 0) {
                    count++;
                }
            }
            if (count == soldiers.length) {
                System.out.println("Victory");
                return false;
            }
            System.out.println("-------------");
            return true;
    }


    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }
}
