public class Derived4<BT, DT> extends Base<BT> {
    private DT d;

    public Derived4() {
        d = null;
    }

    public Derived4(BT b, DT d) {
        super(b);
        this.d = d;
    }

    public DT getD() {
        return d;
    }

    public void setD(DT d) {
        this.d = d;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("d = " + d);
        System.out.println("----------------------");
    }
}
