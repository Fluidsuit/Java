public class Holder {
    private int data;
    private boolean flag = false;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public synchronized void put(int data) {
        this.data = data;
        System.out.println("Put: " + data);
    }

    public synchronized void get() {
        System.out.println("Got: " + data);
    }
}
