public class TurboEngine extends Engine{
    private int niturs;

    public TurboEngine(int hp, char type, int torque, int niturs) {
        super(hp, type, torque);
        this.niturs = niturs;
    }

    public int getNiturs() {
        return niturs;
    }

    public void setNiturs(int niturs) {
        this.niturs = niturs;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("nitrus: " + niturs);
    }
}
