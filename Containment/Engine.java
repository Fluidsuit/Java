public class Engine {
    private int hp;
    private char type;
    private int torque;

    public Engine(int hp, char type, int torque) {
        this.hp = hp;
        this.type = type;
        this.torque = torque;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public void display() {
        System.out.println(hp + " " + type + " " + torque);
    }
}
