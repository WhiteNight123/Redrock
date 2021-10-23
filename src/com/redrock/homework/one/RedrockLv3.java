package com.redrock.homework.one;

import java.util.Random;
import java.util.Scanner;

public class RedrockLv3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("请输入行数(行==列)");
        int a = myScanner.nextInt();
        int[][] arrA = new int[a][a];
        int[][] arrB = new int[a][a];

        //创建一半矩阵
        for (int i = 0; i < arrA.length; i++) {
            for (int j = i; j < arrA[i].length; j++) {
                int b = random.nextInt(10);
                int c = random.nextInt(10);
                arrA[i][j] = b;
                arrB[i][j] = c;
            }
        }
        //对称另一半矩阵
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                arrA[j][i] = arrA[i][j];
                arrB[j][i] = arrB[i][j];
            }
        }
        //输出这两个随机产生的矩阵
        System.out.println("矩阵A:");
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                System.out.print(arrA[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("矩阵B:");
        for (int i = 0; i < arrB.length; i++) {
            for (int j = 0; j < arrB[i].length; j++) {
                System.out.print(arrB[i][j] + "\t");
            }
            System.out.println();
        }
        //矩阵相乘
        int[][] newArr = new int[a][a];
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA.length; j++) {
                for (int k = 0; k < arrA.length; k++) {
                    newArr[j][i] += arrA[j][k] * arrB[k][i];
                }
            }
        }
        //输出相乘后的矩阵
        System.out.println("相乘后的矩阵:");
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                System.out.print(newArr[i][j] + "\t");
            }
            System.out.println();
        }
        //输出最后相乘后的矩阵对角线元素之和
        int sum = 0;
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr.length; j++) {
                if (i == j) {
                    sum += newArr[i][j];
                }
            }
        }
        System.out.println("相乘后的矩阵对角线元素之和:" + sum);
    }
}
