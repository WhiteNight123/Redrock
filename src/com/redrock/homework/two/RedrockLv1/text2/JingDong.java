package com.redrock.homework.two.RedrockLv1.text2;

public class JingDong implements YInterface{
    private You you;

    public JingDong(You you) {
        this.you = you;
    }

    public JingDong() {
    }


    public void start2(JDInterface jdInterface){
        jdInterface.receiveOrder();
    }
    public void start3(){
        you.expressDelivery();
        you.start4(this);

    }

//    public void start3(JDInterface jdInterface){
//        jdInterface.expressDelivery();
//        jingDong.start4(jdInterface);
//    }
    public void start5(){
        you.receiveOrder();
    }

    @Override
    public void sendOrder() {
        System.out.println("你发送了订单");
    }

    @Override
    public void receiveGoods() {
        System.out.println("你收到了电脑");
    }


}
