package com.startjava.lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел"); 
        int count = -10;
        int sumEven = 0; 
        int sumOdd = 0;
        do {
            if (count % 2 == 0) {
                sumEven += count;
            } else {
                sumOdd += count;
            }
            count++;
        } while (count <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания"); 
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max;
        int min;
        if (num1 > num2) { 
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num3 < min) {
            min = num3;
        }          
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sumDigits = 0;
        System.out.print("Исходное число в обратном порядке: ");
        while (num != 0) {
            int digit = num % 10; // остаток от деления на 10;
            sumDigits += digit;      // сумма цифр
            num /= 10;
            System.out.print(digit);
        }
        System.out.println("\nСумма цифр: " + sumDigits);        

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int countInRow = 0;
        for (int i = 1; i <= 24 ; i += 2) {
            System.out.printf("%3d", i);
            countInRow++;
            if (countInRow == 5) {
                System.out.println();                
                countInRow = 0;
            }
        }
        for (int i = countInRow; (5 - i) > 0; i++) {
            System.out.printf("%3d", 0);            
        }

        System.out.println("\n\n5. Проверка количества единиц на четность");
        num = 3141591;
        int copyNum = num;
        int sumOnes = 0;
        while (copyNum != 0) {
            int digit = copyNum % 10; // остаток от деления на 10;
            if (digit == 1) {
                sumOnes++;
            }
            copyNum /= 10;
        } 
        if (sumOnes % 2 == 0) {
            System.out.println("Число " + num +  " содержит " + sumOnes + " (четное) количество единиц");
        } else {
            System.out.println("Число " + num +  " содержит " + sumOnes + " (нечетное) количество единиц");
        }   

        System.out.println("\n6. Отображение фигур в консоли"); 
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int i = 5;  
        while (i > 0) {
            int j = i;
            while (j > 0) {
                System.out.print("#");
                j--;
            }
            System.out.println();
            i--;
        }

        i = 0;
        do {
            i++;
            int j;
            if (i == 4) { 
                j = 2;
            } else if (i == 5) {
                j = 1;
            } else {
                j = i;
            }
            do {
                j--;
                System.out.print("$");
            } while (j > 0);
            System.out.println();
        } while (i < 5);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("Dec Char");
        for (i = 0; i <= 127; i++) {
            if (((i < 48) && (i % 2 != 0)) || ((i > 96) && (i < 123) & (i % 2 == 0))) {
                System.out.printf("%3d %4c\n", (int) (char) i, (char) i);
            }
        }
        
        System.out.println("\n8. Проверка, является ли число палиндромом");
        num = 1234321;
        copyNum = num;
        int reverseNum = 0;
        while (copyNum != 0) {
            int digit = copyNum % 10; // остаток от деления на 10;
            reverseNum = reverseNum * 10 + digit; // обратное число
            copyNum /= 10;
            //System.out.println("Число reverse num  = " + reverseNum);
        }
        if (num == reverseNum) {
            System.out.println("Число " + num + " является палиндромом");
        } else {
            System.out.println("Число " + num + " не является палиндромом");            
        }    

        System.out.println("\n9. Вывод таблицы умножения Пифагора");
        char lineChar = 22;           
        for (i = 1; i < 10; i++) {
            if (i == 1) {
                System.out.print(" ");     
            } else {
                System.out.print(i);
            }
            System.out.printf("|%2d %2d %2d %2d %2d %2d %2d %2d \n",
                            i * 2, i * 3, i * 4, i * 5, i * 6, i * 7, i * 8, i * 9);
            if (i == 1) { 
                for (int j = 0; j < 25; j++) {
                    System.out.print(lineChar);
                }
                System.out.println();
            }
        }

    } 
}
