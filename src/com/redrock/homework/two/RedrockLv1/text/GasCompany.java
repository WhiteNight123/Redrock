package com.redrock.homework.two.RedrockLv1.text;

public class GasCompany implements GasListener
{
    public void advertiseTo(IndoorsMan man)
    {
        System.out.println("煤气公司：这是我们的联系方式，欢迎来电！");
        man.setListener(this);
    }
    @Override
    public void offerGas(String msg)
    {
        System.out.println("煤气公司接收的订单："+msg);
    }
}
