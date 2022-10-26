package com.startjava.lesson_2_3.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    //private String origin;
    private float height;
    private float weight;
    private String weapon;
    //private int armor;

    public Jaeger() {
        
    }

    public Jaeger(String modelName, String mark, float height, float weight, String weapon) {
        this.modelName = modelName;
        this.mark = mark;
        this.height = height;
        this.weight = weight;
        this.weapon = weapon;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    } 

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }  
    
    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }       

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }  

    public boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    public void move() {
        System.out.println("Вы прошли 5 шагов");        
    }

    public String scanKaiju() {
        return "nothing";
    }

    public void useBlades() {
        System.out.println("Вы использовали оружие");
    }

    public String toString() {
        return "modelName = " + modelName + "mark = " + mark;
    }

}