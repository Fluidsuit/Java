public class Base<T> {
    private T b;

    public Base() {
        b = null;
    }

    public Base(T b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Base{" +
                "bData=" + b +
                '}';
    }

    public T getB() {
        return b;
    }

    public void setB(T bData) {
        this.b = bData;
    }

    public void display() {
        System.out.println("b = " + b);
    }
}
