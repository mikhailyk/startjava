import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String continueCalc = "yes";
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        while (!continueCalc.equals("no")) {
            System.out.print("Введите первое число: ");
            calc.setA(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Введите знак математической операции: ");
            calc.setSign(scanner.next().charAt(0));
            System.out.print("Введите второе число: ");
            calc.setB(scanner.nextInt());
            scanner.nextLine();
            calc.getResult();

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]:");
                continueCalc = scanner.nextLine();
            } while (!(continueCalc.equals("no") || continueCalc.equals("yes"))); 
        }
    }
}