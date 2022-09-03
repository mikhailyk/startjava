import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private int secretNum;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    private void setSecretNum() {
        this.secretNum = new Random().nextInt(100) + 1;
    }

    public void start() {
        setSecretNum();
        while (true) {
            if (isGuessed(player1.getName())) { 
                break;
            } 
            if (isGuessed(player2.getName())) {
                break;
            }
        }
    }

    private boolean isGuessed(String name) {
        Scanner console = new Scanner(System.in);
        int playerNum;
        System.out.print("Игрок " + name + " введите число: ");
        playerNum = console.nextInt();
        //cons.nextLine();
        if (playerNum < secretNum) {
            System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
        } else if (playerNum > secretNum) {
            System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + playerNum + ". Вы победили!"); 
            return true;                
        }
        return false;
    }

}