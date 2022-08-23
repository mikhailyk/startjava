public class MyFirstGame {
    public static void main(String[] args) {
        int num = 37;
        int igrNum = 1;
        boolean isLarge = false;
        while (num != igrNum) {
            if (igrNum < num) {
                System.out.println("Число " + igrNum + " меньше того, что загадал компьютер");
            } else if (igrNum > num) {
                System.out.println("Число " + igrNum + " больше того, что загадал компьютер");
                isLarge = true;
            }
            if (isLarge) {
                igrNum--;
            } else {
                igrNum +=5;
            }
        }
        System.out.println("Число " + igrNum + ". Вы победили!");        
    }
}