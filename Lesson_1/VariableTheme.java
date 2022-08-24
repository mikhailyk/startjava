public class VariableTheme {
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        byte numCpu = 1;
        short numCpuCores = 4;
        int freq = 3000;
        long memory = 16;
        float diskSpace = 2;
        double diskSsdSpace = 256;
        char typeCpu = 'I';
        boolean ht = true;
        System.out.println("Количество процессоров: " + numCpu);
        System.out.println("Количество ядер процессора: " + numCpuCores);
        System.out.println("Частота процессора: " + freq);
        System.out.println("Оперативная память (Гб): " + memory);
        System.out.println("Жесткий диск (Гб): " + diskSpace);
        System.out.println("SSD диск (Мб): " + diskSsdSpace);                                        
        System.out.println("Тип процессора (I - Intel, A - AMD): " + typeCpu);                                        
        System.out.println("HyperThreading: " + ht);  

        System.out.println("\n2. Расчет стоимости товара со скидкой");  
        int penCost = 100;
        int bookCost = 200;
        int discountPercent = 11;
        float discountOverall = (penCost + bookCost) * discountPercent / 100;
        float discountCost = (penCost + bookCost) - discountOverall;
        System.out.println("Скидка (руб): " + discountOverall);                                        
        System.out.println("Общая сумма покупок: " + discountCost);  

        System.out.println("\n3. Вывод на консоль слова Java");   
        System.out.println("    J    a  v     v  a");   
        System.out.println("    J   a a  v   v  a a");   
        System.out.println(" J  J  aaaaa  V V  aaaaa");   
        System.out.println("  JJ  a     a  V  a     a");                                  

        System.out.println("\n4. Отображение min и max значений числовых типов данных");
        byte numByte = 127;
        short numShort = 32767;
        int numInt = 2147483647;
        long numLong = Long.MAX_VALUE; 
        System.out.println("Byte: " + numByte + "\nByte после инкремента: " + (++numByte) + "\nByte после декремента: " + (--numByte));   
        System.out.println("Short: " + numShort + "\nShort после инкремента: " + (++numShort) + "\nShort после декремента: " + (--numShort));   
        System.out.println("Int: " + numInt + "\nInt после инкремента: " + (++numInt) + "\nInt после декремента: " + (--numInt));   
        System.out.println("Long: " + numLong + "\nLong после инкремента: " + (++numLong) + "\nLong после декремента: " + (--numLong));   

        System.out.println("\n5. Перестановка значений переменных");     
        int num1 = 2;
        int num2 = 5;
        int temp;    
        System.out.println("a) c помощью третьей переменной");
        System.out.println("   переменные до перестановки: num1 = " + num1 + ", num2 = " + num2);        
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("   переменные после перестановки: num1 = " + num1 + ", num2 = " + num2);        
        System.out.println("б) c помощью арифметических операций");
        System.out.println("   переменные до перестановки: num1 = " + num1 + ", num2 = " + num2);        
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("   переменные после перестановки: num1 = " + num1 + ", num2 = " + num2);  
        System.out.println("в) c помощью побитовой операции ^");
        System.out.println("   переменные до перестановки: num1 = " + num1 + ", num2 = " + num2);        
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("   переменные после перестановки: num1 = " + num1 + ", num2 = " + num2);    
        
        System.out.println("\n6. Вывод символов и их кодов");         
        char codeChar1 = 35;
        char codeChar2 = 38;
        char codeChar3 = 64;
        char codeChar4 = 94;
        char codeChar5 = 95;
        System.out.println((int) codeChar1 + "   " + codeChar1);         
        System.out.println((int) codeChar2 + "   " + codeChar2);    
        System.out.println((int) codeChar3 + "   " + codeChar3);    
        System.out.println((int) codeChar4 + "   " + codeChar4);    
        System.out.println((int) codeChar5 + "   " + codeChar5);    
        
        System.out.println("\n7. Отображение количества сотен, десятков и единиц числа"); 
        int num = 123;
        System.out.println("Число " + num + " содержит");         
        System.out.println((num / 100) + " сотен\n" + (num / 10 % 10) + " десятков\n" + (num % 10) + " единиц"); 

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка"); 
        char sp = ' ';
        char slash = '/';
        char bslash = '\\';
        char uline = '_';
        char ob = '(';
        char cb = ')';
        System.out.println(sp);
        System.out.println("" + sp + sp + sp + sp + slash + bslash + sp + sp + sp + sp); 
        System.out.println("" + sp + sp + sp + slash + sp + sp + bslash  + sp + sp + sp);  
        System.out.println("" + sp + sp + slash + uline + ob + sp + cb + bslash  + sp + sp);  
        System.out.println("" + sp + slash + sp + sp + sp + sp + sp + sp + bslash + sp);                          
        System.out.println("" + slash + uline + uline + uline + uline + slash + bslash + uline + uline + bslash);  

        System.out.println("\n9. Произведение и сумма цифр числа"); 
        int srcNum = 345;
        int digit1 = num2 / 100;
        int digit2 = num2 / 10 % 10;
        int digit3 = num2 % 10;        
        System.out.println("Сумма цифр числа " +  num2 + ": " + (digit1 + digit2 + digit3)); 
        System.out.println("Произведение цифр числа " +  num2 + ": " + (digit1 * digit2 * digit3));     

        System.out.println("\n10. Преобразование секунд"); 
        int totalSec = 86399;
        int hour = totalSec / 3600;
        int min = totalSec / 60 % 60;
        int sec = totalSec % 60;
        System.out.println(hour + ":" + min + ":" + sec);         
    }
}
