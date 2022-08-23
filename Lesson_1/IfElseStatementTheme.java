public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age=18; 
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
        char ch = '\u0057';
        System.out.println(ch);
        if ((ch >= 48) && (ch <= 57 )) {
            System.out.println("Число");     
        } else if ((ch >= 65) && (ch <= 90 )) {
            System.out.println("Большая буква");  
        } else if ((ch >= 97) && (ch <= 122 )) {
            System.out.println("Маленькая буква>");   
        } else {
            System.out.println("Не буква и не число");             
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        double vklad = 300000;
        double proc;
        if (vklad < 100000) {
            proc = 5;
        } else if (vklad <=300000) {
            proc = 7;
        } else {
            proc = 10;
        }
        System.out.println("Сумма вклада: " + vklad + ", процент по вкладу: " + proc + "%, Итоговая сумма: " + (vklad + (vklad * proc) / 100));

        System.out.println("\n7. Определение оценки по предметам");
        double hist = 59;
        double prog = 91 ;
        int histScore;
        int progScore;
        if (hist <= 60) {
            histScore = 2;
        } else if ((hist > 60) && (hist <= 73 )) {
            histScore = 3;
        } else if ((hist > 73) && (hist <= 91 )) {
            histScore = 4;
        } else {
            histScore = 5;
        }
        if (prog <= 60) {
            progScore = 2;
        } else if ((prog > 60) && (prog <= 73 )) {
            progScore = 3;
        } else if ((prog > 73) && (prog <= 91 )) {
            progScore = 4;
        } else {
            progScore = 5;
        }
        System.out.println("Оценка: " + histScore + ", предмет: История");
        System.out.println("Оценка: " + progScore + ", предмет: Программирование");
        System.out.println("Средняя оценка по предметам: " + ((progScore + histScore) / 2) );
        System.out.println("Средний процент по предметам: " + ((prog + hist) / 2) + "%");

        System.out.println("\n8. Расчет прибыли");
        int arenda = 5000;
        int revenue = 13000;
        int cost = 9000;
        // Если в себестоимости не учтена аренда
        int yearIncome = (revenue - cost - arenda) * 12;
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