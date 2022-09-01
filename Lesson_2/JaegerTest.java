public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Tacit Ronin");
        jaeger1.setMark("Mark-1");
        jaeger1.setHeight(74.37f);
        jaeger1.setWeight(7450f);
        jaeger1.setWeapon("Fangblades");

        Jaeger jaeger2 = new Jaeger("Saber Athena", "Mark-7", 76.91f, 1628f, "Ionic Twinblades");

        jaeger1.drift();
        jaeger2.useBlades();
        System.out.println("Оружие у "+ jaeger1.getModelName() + ": " + jaeger1.getWeapon());
    }
}