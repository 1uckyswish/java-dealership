public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("nissan", 10000, 2020, "Green");
        Car dodge = new Car("Dodge", 11000, 2019, "Blue");

        Car nissan2 = new Car(nissan);
        nissan2.setColor("Yellow");



        nissan.drive();
        nissan2.drive();
        dodge.drive();
    }
}

