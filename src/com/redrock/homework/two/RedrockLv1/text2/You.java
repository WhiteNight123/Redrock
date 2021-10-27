package com.redrock.homework.two.RedrockLv1.text2;

public class You implements JDInterface{

    private JingDong jingDong;


    public You(JingDong jingDong) {
        this.jingDong = jingDong;
    }

    public You() {
    }

    public void start1(){
        jingDong.sendOrder();
        jingDong.start2(this);
        //jingDong.start3(this);
    }
    public void start4(YInterface yInterface){
        yInterface.receiveGoods();
    }
//    public void start5(JDInterface jdInterface){
//        jdInterface.receiveOrder();
//    }



    @Override
    public void receiveOrder() {
        System.out.println("京东收到了订单");
    }

    @Override
    public void expressDelivery() {
        System.out.println("京东快递发货");
    }

    @Override
    public void receiveGoods() {
        System.out.println("京东到货通知");
    }


}
