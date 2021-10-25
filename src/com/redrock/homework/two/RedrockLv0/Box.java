package com.redrock.homework.two.RedrockLv0;

public class Box {
    private String box;
    private int length;
    private int height;

    public Box(String box, int length, int height) {
        this.box = box;
        this.length = length;
        this.height = height;
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
