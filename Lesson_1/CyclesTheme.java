public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел"); 
        int i = -10;
        int even = 0; 
        int odd = 0;
        do {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
            i++;
        } while (i <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + even + ", а нечетных = " + odd);

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
        for (int k = max; k >= min; k--) {
            System.out.print(k + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sumDigit = 0;
        int reverseNum = 0;
        while (num != 0) {
            int digit = num % 10; // остато от деления на 10;
            sumDigit += digit;      // сумма цифр
            reverseNum = reverseNum * 10 + digit; // обратное число
            num = num / 10;
        }
        System.out.println("Исходное число в обратном порядке: " + reverseNum);
        System.out.println("Сумма цифр: " + sumDigit);        

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int countInRow = 0;
        for (i = 1; i <=24 ; i += 2) {
            System.out.printf("%3d",i);
            countInRow++;
            if (countInRow == 5) {
                System.out.println("");                
                countInRow = 0;
            }
        }
        for (i = countInRow; (i > 0) & (i <= 5); i++) {
            System.out.printf("%3d",0);            
        }

        System.out.println("\n\n5. Проверка количества единиц на четность");
        num = 3141591;
        num2 = num;
        int sumOnes = 0;
        while (num2 != 0) {
            int digit = num2 % 10; // остато от деления на 10;
            if (digit == 1) {
                sumOnes += 1;
            }
            num2 /= 10;
        } 
        if (sumOnes % 2 == 0) {
            System.out.println("Число " + num +  " содержит " + sumOnes + " (четное) количество единиц");
        } else {
            System.out.println("Число " + num +  " содержит " + sumOnes + " (нечетное) количество единиц");
        }   

        System.out.println("\n6. Отображение фигур в консоли"); 
        char anyChar = '*';
        for (i = 1; i <= 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(anyChar);
            }
            System.out.println("");
        }

        anyChar = '#';
        i = 5;  
        while (i > 0) {
            int j = i;
            while (j > 0) {
                System.out.print(anyChar);
                j--;
            }
            System.out.println("");
            i--;
        }

        anyChar = '$';
        i = 1;
        boolean isTop = false;
        do {
            int j = 0;
            do {
                System.out.print(anyChar);
                j++;
            } while (j < i);
            System.out.println("");
            if (i == 3) {
                isTop = true;
            }           
            if (isTop) {
                i--;
            } else {
                i++;
            }
        } while (i > 0);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("Dec Char");
        char someChar;
        for (i = 0; i <= 127; i++) {
            if (((i < 48) & (i % 2 != 0)) | ((i > 96) & (i < 123) & (i % 2 == 0))) {
                someChar = (char) i;
                System.out.printf("%3d %4c",(int) someChar, someChar);
                System.out.println();
            }
        }
        
        System.out.println("\n8. Проверка, является ли число палиндромом");
        num = 1234321;
        num2 = num;
        reverseNum = 0;
        while (num2 != 0) {
            int digit = num2 % 10; // остато от деления на 10;
            reverseNum = reverseNum * 10 + digit; // обратное число
            num2 = num2 / 10;
            System.out.println("Число reverse num  = " + reverseNum);
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
