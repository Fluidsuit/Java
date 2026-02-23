public class Derived1 extends Base{
    private String d;

    public Derived1(Number b, String d) {
        super(b);
        this.d = d;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public void display() {
        super.display();
        System.out.println("d = " + d);
    }
}
