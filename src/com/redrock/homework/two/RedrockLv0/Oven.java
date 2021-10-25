package com.redrock.homework.two.RedrockLv0;

public class Oven extends Box{
    public Oven(String box, int length, int height) {
        super(box, length, height);
    }
    public void func(Animal animal){
        System.out.println("烤"+animal.getAnimal());
    }
}
