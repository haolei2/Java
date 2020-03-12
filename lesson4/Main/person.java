package com.company;

public class person extends animal implements  eatAble {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String  name;

    public person(String type, int age, String name) {
        super(type, age);
        this.name = name;
    }




    @Override
    public int consumTime() {
        return 1;
    }

    @Override
    public void eat() {
        System.out.println("我是" + this.type + ",我的名字是" + this.name+"正在吃!");
    }
}
