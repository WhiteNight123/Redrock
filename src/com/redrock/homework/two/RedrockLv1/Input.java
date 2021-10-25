package com.redrock.homework.two.RedrockLv1;
import java.util.Scanner;
public class Input {
    //初始化玩家信息
    public static void initialize(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入名称:");
        String name = sc.next();
        System.out.print("请输入生命值(1-9999):");
        int hp = sc.nextInt();
        System.out.print("请输入攻击力(1-999):");
        int atk = sc.nextInt();
        System.out.print("请输入防御力(1-999):");
        int def = sc.nextInt();

    }
}
