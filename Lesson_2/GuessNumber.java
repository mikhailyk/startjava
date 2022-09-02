import java.util.Scanner;

public class GuessNumber {
    private int secretNum;
    private Player player1;
    private Player player2;

    public GuessNumber(int secretNum, Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.secretNum = secretNum;
    }

    public void setSecretNum(int secretNum) {
        this.secretNum = secretNum;
    }

    public void beginGame() {
        boolean isThisNumber = false;
        while (!isThisNumber) {
            isThisNumber = checkNumber(player1.getName());
            if (!isThisNumber) {
                isThisNumber = checkNumber(player2.getName());
            }
        }
    }

    private boolean checkNumber(String name) {
        Scanner cons = new Scanner(System.in);
        int playerNum;
        System.out.print("Игрок " + name + " введите число: ");
        playerNum = cons.nextInt();
        //cons.nextLine();
        if (playerNum < this.secretNum) {
            System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
            return false;
        } else if (playerNum > this.secretNum) {
            System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
            return false;
        } else {
            System.out.println("Число " + playerNum + ". Вы победили!"); 
            return true;                
        }
    }

}