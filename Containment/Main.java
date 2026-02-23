public class Main {
    public static void main(String[] args) {
        /*Employee e1 =
                new Employee(
                        101,
                        "XYZ",
                        10000,
                        12,
                        12,
                        2000
                );
        e1.display();

        System.out.println();

        e1.setDob(12, 11, 2024);
        e1.display();

        System.out.println();
        Date d = e1.getDob();
        d.setDay(12);
        d.setMonth(11);
        d.setYear(2024);

        e1.display();*/


        Car cityCar = new Car(
                "Mh12 123",
                34590,
                new Engine(200, 'P', 2300)
        );
        cityCar.display();

        Car sportsCar = new Car(
                "MH12890",
                34456,
                new TurboEngine(400, 'D', 5000, 1200)
        );
        sportsCar.display();

    }
}
