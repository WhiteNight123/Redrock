package com.redrock.homework.two.RedrockLv1.text2;

public class test03 {
    public static void main(String[]args){
        JingDong jingDong = new JingDong(new You());
        You you = new You(new JingDong());
        you.start1();
        jingDong.start3();

    }
}
