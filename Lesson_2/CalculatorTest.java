import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String option = "yes";
        Scanner console = new Scanner(System.in);
        Calculator calc = new Calculator();
        while (!option.equals("no")) {
            System.out.print("Введите первое число: ");
            calc.setA(console.nextInt());
            console.nextLine();
            System.out.print("Введите знак математической операции: ");
            calc.setSign(console.next().charAt(0));
            System.out.print("Введите второе число: ");
            calc.setB(console.nextInt());
            console.nextLine();
            calc.calc();

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]:");
                option = console.nextLine();
            } while (!option.equals("no") && !option.equals("yes")); 
        }
    }
}