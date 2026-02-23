public class Derived3<T> extends Base<T>{
    private T d;

    public Derived3() {
        d = null;
    }

    public Derived3(T b, T d) {
        super(b);
        this.d = d;
    }

    public T getD() {
        return d;
    }

    public void setD(T d) {
        this.d = d;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("d = " + d);
        System.out.println("-------------------");
    }
}
