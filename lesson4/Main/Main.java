package com.company;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("动物世界吃西瓜大赛开始，请各位选手就位！");

        eatAble[] obj = new eatAble[3];

        obj[0] = (eatAble)new person("人类",27,"小明");
        obj[1] = (eatAble)new Monkey("猴子",2);
        obj[2] = (eatAble)new pig("猪",3);
        animal[] animals = new animal[3];
        animals[0] = (animal)new person("人类",27,"小明");
        animals[1] = (animal)new Monkey("猴子",2);
        animals[2] = (animal)new pig("猪",3);


        System.out.println("动物世界吃西瓜大赛开始，请输入s开始！");
        Scanner scanner;
        String  s;
        do{
            scanner = new Scanner(System.in);
            s =  scanner.next();
        }while(!(s.equals("S") || s.equals("s")));

        for(eatAble ob:obj){
            ob.eat();
        }

        for(int i = 0;i < 3;i++){
            animals[i].time = eatAble.num / obj[i].consumTime();
        }

        Arrays.sort(animals);

        int rank = 1;
        for(int i = 0;i < animals.length;i++,rank++) {
            System.out.println("第" + rank +"名:"+animals[i].getType());
        }
    }
}
