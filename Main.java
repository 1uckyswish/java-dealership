public class Main {
    public static void main(String[] args) {

        Car nissan = new Car("nissan", 10000, 2020, "Green", new String[] {"Tires", "Keys"});
        Car dodge = new Car("Dodge", 11000, 2019, "Blue", new String[] {"Tires", "Keys"});
        Car nissan2 = new Car(nissan);

        nissan2.setColor("Yellow");
        nissan2.drive();
    }
}

