package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        String option = "yes";
        Scanner console = new Scanner(System.in); 
        System.out.print("Имя первого игрока: ");
        Player player1 = new Player(console.nextLine());
        System.out.print("Имя второго игрока: ");
        Player player2 = new Player(console.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);

        while (!option.equals("no")) {
            do {
                if (option.equals("yes")) {
                    game.start();
                }
                System.out.print("Хотите продолжить игру? [yes/no]:");
                option = console.nextLine();
            } while (!option.equals("no") && !option.equals("yes"));
        }
    } 
}