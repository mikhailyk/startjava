package com.startjava.lesson_1.base;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 18; 
        if (age > 20) {
            System.out.println("Юность прошла");             
        } else {    
            System.out.println("Да ты еще салага");    
        }

        boolean isMale = true; 
        if (!isMale) {
            System.out.println("Женщина...");             
        } else {    
            System.out.println("Мужчина...");    
        } 

        float height = 1.74f; 
        if (height < 1.80) {
            System.out.println("Ты лилипут");             
        } else {    
            System.out.println("Ты великан");    
        } 

        char firstLetterName = "Mikhail".charAt(0); 
        if (firstLetterName == 'M') {
            System.out.println("Возможно ты Михаил или Маша");             
        } else if (firstLetterName == 'I') {   
            System.out.println("Возможно ты Иван или Ирина");    
        } else {
            System.out.println("Я не знаю как тебя могут звать");   
        }
        
        System.out.println("\n2. Поиск max и min числа");
        int num1 = 153;
        int num2 = 345;
        if (num1 > num2) {
            System.out.println("Числа: max" + num1 + ", min " + num2);             
        } else if (num1 < num2) {
            System.out.println("Числа: max" + num2 + ", min " + num1);             
        } else {
            System.out.println("Числа равны между собой (" + num2 + ")");             
        }

        System.out.println("\n3. Работа с числом");
        int num3 = 2983;
        if (num3 == 0) {
            System.out.println("Число является нулем");        
        } else {
            System.out.print("Число " + num3 + " является ");                   
            if (num3 % 2 > 0) { 
                System.out.print("нечётным ");                 
            } else {
                System.out.print("чётным ");                  
            }
            if (num3 > 0) {
                System.out.println("и положительным.");                  
            } else {
                System.out.println("и отрицательным."); 
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");        
        int num4 = 635;
        int num5 = 625;
        System.out.println("Числа " + num4 + " и " + num5 + " ");        
        if ((num4 / 100) == (num5 / 100)) {
            System.out.println("имеют одинаковые цифры ("+ num4 / 100 + ") в третьем разряде");              
        }
        if ((num4 / 10 % 10) == (num5 / 10 % 10)) {
            System.out.println("имеют одинаковые цифры ("+ num5 / 10 % 10 + ") во втором разряде");              
        }
        if ((num4 % 10) == (num5 % 10)) {
            System.out.println("имеют одинаковые цифры ("+ num4 % 10 + ") в первом разряде");              
        }                

        System.out.println("\n5. Определение буквы, числа или символа по их коду");   
        char someChar = '\u0057';
        System.out.println(someChar);
        if ((someChar >= 48) && (someChar <= 57)) {
            System.out.println("Число");     
        } else if ((someChar >= 65) && (someChar <= 90)) {
            System.out.println("Большая буква");  
        } else if ((someChar >= 97) && (someChar <= 122)) {
            System.out.println("Маленькая буква>");   
        } else {
            System.out.println("Не буква и не число");             
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        double deposit = 300000;
        double percent;
        if (deposit < 100000) {
            percent = 5;
        } else if (deposit <= 300000) {
            percent = 7;
        } else {
            percent = 10;
        }
        System.out.println("Сумма вклада: " + deposit + ", процент по вкладу: " + percent + 
                            "%, Итоговая сумма: " + (deposit + (deposit * percent) / 100));

        System.out.println("\n7. Определение оценки по предметам");
        double historyPercent = 59;
        double programmingPercent = 91;
        int historyScore;
        int programmingScore;
        if (historyPercent <= 60) {
            historyScore = 2;
        } else if ((historyPercent > 60) && (historyPercent <= 73)) {
            historyScore = 3;
        } else if ((historyPercent > 73) && (historyPercent <= 91)) {
            historyScore = 4;
        } else {
            historyScore = 5;
        }
        if (programmingPercent <= 60) {
            programmingScore = 2;
        } else if ((programmingPercent > 60) && (programmingPercent <= 73)) {
            programmingScore = 3;
        } else if ((programmingPercent > 73) && (programmingPercent <= 91)) {
            programmingScore = 4;
        } else {
            programmingScore = 5;
        }
        System.out.println("Оценка: " + historyScore + ", предмет: История");
        System.out.println("Оценка: " + programmingScore + ", предмет: Программирование");
        System.out.println("Средняя оценка по предметам: " + ((programmingScore + historyScore) / 2));
        System.out.println("Средний процент по предметам: " + ((programmingPercent + historyPercent) / 2) + "%");

        System.out.println("\n8. Расчет прибыли");
        int rent = 5000;
        int revenue = 13000;
        int cost = 9000;
        // Если в себестоимости не учтена аренда
        int yearIncome = (revenue - cost - rent) * 12;
        // Если в себестоимости учтена аренда
        //int yearIncome = (revenue - cost) * 12;
        if (yearIncome > 0) {
            System.out.println("Прибыль за год: +" + yearIncome + " руб.");            
        } else {
            System.out.println("Прибыль за год: " + yearIncome + " руб.");  
        }

        System.out.println("\n9. Подсчет количества банкнот"); 
        int num = 567; 
        int nom100 = num / 100;
        int nom10 = num / 10 % 10;
        int nom1 = num % 10;
        if (nom10 > 5) {
            int temp = nom10 - 5;
            nom10 -= temp;
            nom1 = nom1 + temp * 10; 
        } 
        int sum = nom100 * 100 + nom10 * 10 + nom1;
        int quantity = nom1 + nom10 + nom100;
        System.out.println("Номиналы банкнот: 100 - " + nom100 + "шт., 10 - " + nom10 + " шт., 1 - " + nom1 + "шт.");
        System.out.println("Количество банкнот: " + quantity);
        System.out.println("Исходная сумма: " + sum + " USD");
    }
}