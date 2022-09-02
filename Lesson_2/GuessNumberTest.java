import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {

    public static void main(String[] args) {
        String option = "yes";
        Scanner console = new Scanner(System.in); 
        System.out.print("Имя первого игрока: ");
        Player player1 = new Player(console.nextLine());
        System.out.print("Имя второго игрока: ");
        Player player2 = new Player(console.nextLine());
        int randomNumber = (new Random().nextInt(99) + 1);
        GuessNumber game = new GuessNumber(randomNumber, player1, player2);

        while (!option.equals("no")) {
            do {
                game.beginGame();
                System.out.print("Хотите продолжить игру? [yes/no]:");
                option = console.nextLine();
                if (option.equals("yes")) {
                    game.setSecretNum(new Random().nextInt(99) + 1);    
                } 
            } while (!option.equals("no") && !option.equals("yes"));
        }
    } 
}