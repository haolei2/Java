package com.company;

abstract public class animal implements Comparable<animal> {

    String type;
    int age;
    int time;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }


    public animal(String type, int age) {
        this.type = type;
        this.age = age;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(animal o) {
        return this.time - o.time;
    }
}
