package com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();

        wolf1.setSex("Male");
        wolf1.setNickname("klax");
        wolf1.setAge(10);
        wolf1.setAge(5);
        wolf1.setWeight(59.8f);
        wolf1.setColor("grey");        
        
        System.out.println(wolf1.getSex());
        System.out.println(wolf1.getNickname());
        System.out.println(wolf1.getAge());
        System.out.println(wolf1.getWeight());
        System.out.println(wolf1.getColor());

        // wolf1.move();
        // wolf1.sit();
        // wolf1.run();
        // wolf1.howl();
        // wolf1.hunt();
    }
}