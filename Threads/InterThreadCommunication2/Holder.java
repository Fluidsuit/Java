public class Holder {
    private int data;
    private boolean flag = false;

    public synchronized void put(int data) {
        if(flag == false) {
            this.data = data;
            System.out.println("Put: " + data);
            flag = true;
            notify();
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void get() {
        if(flag) {
            System.out.println("Got: " + data);
            flag = false;
            notify();
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
