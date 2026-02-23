public class Derived2 extends Base<String>{
    private int d;

    public Derived2(int d) {
        this.d = d;
    }

    public Derived2(String b, int d) {
        super(b);
        this.d = d;
    }

    public void display() {
        setB("some string");
    }
}
