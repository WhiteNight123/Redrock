package com.redrock.homework.two.RedrockLv1.text;

public class text {
    public static void main(String[] args)
    {
        IndoorsMan man = new IndoorsMan();
        GasCompany company = new GasCompany();

        company.advertiseTo(man);
        man.prepareCook();
    }
}

