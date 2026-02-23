public class Derived1 extends Base {
    private int d;

    public Derived1() {
    }

    public Derived1(Object b, int d) {
        super(b);
        this.d = d;
    }

    public void display() {
        getB();
    }
}
