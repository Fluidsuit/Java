public class Holder {
    private int data;

    public synchronized void put(int data) {
        this.data = data;
        System.out.println("Put: " + data);
    }

    public synchronized void get() {
        System.out.println("Got: " + data);
    }
}
