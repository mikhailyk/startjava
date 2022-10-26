package com.startjava.lesson_1.final;

public class MyFirstGame {
    public static void main(String[] args) {
        int secretNum = 37;
        int playerNum = 1;
        while (secretNum != playerNum) {
            if (playerNum < secretNum) {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
                playerNum += 5;
            } else if (playerNum > secretNum) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
                playerNum--;
            }
        }
        System.out.println("Число " + playerNum + ". Вы победили!");        
    }
}