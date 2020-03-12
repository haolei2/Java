package com.company;

public class Monkey extends animal implements eatAble{

    public Monkey(String type, int age) {
        super(type, age);
    }

    @Override
    public int consumTime() {
        return 10;
    }

    @Override
    public void eat() {
        System.out.println("我是" + this.type  +"正在吃!");
    }
}
