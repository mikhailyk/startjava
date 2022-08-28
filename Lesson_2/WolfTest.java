public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        wolf1.sex = "Male";
        wolf1.nickname = "klax";
        wolf1.age = 7;
        wolf1.weight = 85.5f;
        wolf1.color = "gray";

        System.out.println("Sex = " + wolf1.sex);
        System.out.println("Nickname = " + wolf1.nickname);
        System.out.println("Age = " + wolf1.age);
        System.out.println("Weight = " + wolf1.weight);
        System.out.println("Color = " + wolf1.color);

        wolf1.move();
        wolf1.sit();
        wolf1.run();
        wolf1.howl();
        wolf1.hunt();
    }
}