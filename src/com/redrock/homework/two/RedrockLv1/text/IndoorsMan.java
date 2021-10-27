package com.redrock.homework.two.RedrockLv1.text;

public class IndoorsMan
{
    GasListener gListener;
    public void prepareCook()
    {
        System.out.println("宅男：准备下厨做几个花式大菜！");
        System.out.println("宅男：进厨房，烧菜...");
        System.out.println("宅男：刚开火，就发现煤气不足，没办法，只能打电话叫煤气。");
        gListener.offerGas("宅男：送一瓶煤气过来!");
    }
    public void setListener(GasListener gListener)
    {
        this.gListener = gListener;
    }
}