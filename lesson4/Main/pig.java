package com.company;

public class pig extends animal implements eatAble{

    public pig(String type, int age) {
        super(type, age);
    }

    @Override
    public int consumTime() {
        return 5;
    }

    @Override
    public void eat() {
        System.out.println("我是" + this.type  +"正在吃!");
    }
}
