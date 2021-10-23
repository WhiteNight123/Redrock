package com.redrock.homework.one.redrocklv4;

import java.util.Scanner;

public class Restaurant {

    private String name;
    Scanner scanner = new Scanner(System.in);

    public Restaurant(String name) {
        this.name = name;
    }

    //欢迎功能
    public void welcome(Food[] foods) {

        System.out.println("欢迎来到" + name + "重邮饭店,这是今天的菜单:");
        for (int i = 0; i < foods.length; i++) {
            System.out.println(foods[i].toString1());
        }
        System.out.print("请输入你想点的菜的序号(空格键分割):");
        String id1 = scanner.nextLine();
        int sum = 0;
        String[] id2 = id1.split(" ");
        Food[] newFood = new Food[id2.length];
        for (int i = 0; i < id2.length; i++) {
            newFood[i] = foods[Integer.parseInt(id2[i]) - 1];
        }
        System.out.println("你点了这些菜:");
        for (int i = 0; i < newFood.length; i++) {
            System.out.println(newFood[i].toString2());
            sum += newFood[i].getPrice();
        }
        System.out.println("共计" + sum + "元\n还有需要点的菜吗?(y/n)");

        String key = scanner.next();
        if (key.equals("y")) {
            //重复上面的过程
            for (int i = 0; i < foods.length; i++) {
                System.out.println(foods[i].toString1());
            }
            System.out.print("请输入你想点的菜的序号(空格键分割):");

            String id3 = scanner.next();
            String[] id4 = id3.split(" ");
            System.out.println(id2.length + id4.length);
            Food[] newFood2 = new Food[id2.length + id4.length];
            for (int i = 0; i < id2.length; i++) {
                newFood2[i] = newFood[i];
            }
            for (int i = 0; i < id4.length; i++) {
                newFood2[id2.length + i] = foods[Integer.parseInt(id4[i]) - 1];
                sum += newFood2[id2.length + i].getPrice();
            }
            System.out.println("你点了这些菜:");
            for (int i = 0; i < newFood2.length; i++) {
                System.out.println(newFood2[i].toString2());
            }
            System.out.println("共计" + sum + "元");
        }

    }

    //支付功能
    public void pay() {
        System.out.println("支付方法:\n1.支付宝/微信支付\n2.校园卡\n3.人脸支付");
        boolean loop = true;
        do {
            int key = scanner.nextInt();
            switch (key) {
                case 1:
                    System.out.println("请出示付款码...");
                    loop = false;
                    break;
                case 2:
                    System.out.println("请刷卡...");
                    loop = false;
                    break;
                case 3:
                    System.out.println("请正对相机...");
                    loop = false;
                    break;
                default:
                    System.out.println("请选择正确的支付方式");
                    break;
            }
        } while (loop);
    }

}
