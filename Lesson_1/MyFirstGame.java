public class MyFirstGame {
    public static void main(String[] args) {
        int num = 37;
        int gamerNum = 1;
        boolean isLarge = false;
        while (num != gamerNum) {
            if (gamerNum < num) {
                System.out.println("Число " + gamerNum + " меньше того, что загадал компьютер");
            } else if (gamerNum > num) {
                System.out.println("Число " + gamerNum + " больше того, что загадал компьютер");
                isLarge = true;
            }
            if (isLarge) {
                gamerNum--;
            } else {
                gamerNum +=5;
            }
        }
        System.out.println("Число " + gamerNum + ". Вы победили!");        
    }
}