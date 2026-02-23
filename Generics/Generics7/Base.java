public class Base<T extends Number> {
    private T b;

    public Base() {
        b = null;
    }

    public Base(T b) {
        this.b = b;
    }

    public T getB() {
        return b;
    }

    public void setB(T b) {
        this.b = b;
    }

    public void display() {
        System.out.println("b = " + b);
    }
}
