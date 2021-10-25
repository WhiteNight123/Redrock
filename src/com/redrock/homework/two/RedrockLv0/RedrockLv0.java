package com.redrock.homework.two.RedrockLv0;

public class RedrockLv0 {
    public static void main(String []args){
        Animal animal = new Animal();
        Animal elephant = new Animal("大象",102,100,100);
        Animal tiger=new Animal("老虎",100,100,100);
        Animal monkey = new Animal("猴子", 100, 100, 100);
        Oven oven=new Oven("烤箱",101,101);
        Washer washer=new Washer("洗衣机",101,101);
        animal.move(elephant,oven);
        animal.move(tiger,washer);
        washer.func(monkey);
    }
}
