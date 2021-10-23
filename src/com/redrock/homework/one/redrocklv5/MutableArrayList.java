package com.redrock.homework.one.redrocklv5;

public class MutableArrayList {
    private Object[] elementDate = new Object[0];
    private int size; //实际元素个数

    //添加元素
    public void add(Object obj) {
        autoAdd();
        elementDate[size - 1] = obj;
    }

    //得到索引
    public String get(int index) {
        if (index < size) {
            return "\n第" + index + "个元素是: " + elementDate[index] + "\n";
        } else {
            return "超出范围!";
        }
    }

    //删除元素
    public void remove(int index) {
        if (index <= size) {
            Object[] newElementDate = new Object[elementDate.length - 1];
            System.arraycopy(elementDate, 0, newElementDate, 0, index);
            System.arraycopy(elementDate, index + 1, newElementDate, index, elementDate.length - index - 1);
            size--;
            elementDate = newElementDate;
        } else {
            System.out.println("超出范围!");
        }
    }

    //删除元素
    public void remove(Object obj) {
        for (int i = 0; i < elementDate.length; i++) {
            if (obj.equals(elementDate[i])) {
                remove(i);
                break;
            } else {
                System.out.println("删除的对象不存在!");
            }
        }
    }

    //添加元素到指定位置
    public void add(int index, Object obj) {
        autoAdd();
        Object[] newElementDate = new Object[elementDate.length];
        System.arraycopy(elementDate, 0, newElementDate, 0, index);
        newElementDate[index] = obj;
        System.arraycopy(elementDate, index, newElementDate, index + 1, elementDate.length - index - 1);
        elementDate = newElementDate;

    }

    //自动扩容
    public void autoAdd() {
        if (!isNormal()) {
            Object[] newElementDate = new Object[elementDate.length + 1];
            System.arraycopy(elementDate, 0, newElementDate, 0, size);
            size++;
            elementDate = newElementDate;
        }
    }

    //判断索引是否正常
    public boolean isNormal() {
        //确定实际元素个数
        size = 0;
        for (int i = 0; i < elementDate.length; i++) {
            if (elementDate[i] != null) {
                size++;
            }
        }
        if (size >= elementDate.length) {
            //此时需要扩容
            return false;
        } else {
            return true;
        }
    }
}
