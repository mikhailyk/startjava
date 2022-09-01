public class Calculator {

    private int a;
    private int b;
    private char sign;
    private int result;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void getResult() {
        calc();
    }

    private void calc() {
        switch (sign) {
            case ('+'):
                result = a + b;
                break;
            case ('-'):
                result = a - b;
                break;  
            case ('*'):
                result = a * b;
                break; 
            case ('/'):
                result = a / b;
                break;
            case ('^'):
                result = 1;
                for (int i = 0; i < b; i++) {
                    result *= a;
                }
                break;
            case ('%'):
                result = a % b;
                break; 
            default: 
                break;                
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }        
}
