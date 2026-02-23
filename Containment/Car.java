public class Car {
    private String passingNo;
    private int colorCode;
    private Engine engine;

    public Car(String passingNo, int colorCode, Engine engine) {
        this.passingNo = passingNo;
        this.colorCode = colorCode;
        /*this.engine = new Engine(12, 'D', 3000);*/
        this.engine = engine;
    }

    public void display() {
        System.out.println(passingNo + " " + colorCode + " ");
        engine.display();
        System.out.println();
    }
}
