public class Calculator {
    public static void main(String[] args) {
        int a = 2;
        int b = 7;
        char sign = '^';
        int result = 0;

        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a + b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = a / b;
        } else if (sign == '^') {
            result = a;
            for (int i = 1; i<b; i++) {
                result = result*a;
            }           
        } else if (sign == '%') {
            result = a % b;
        } 
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}
