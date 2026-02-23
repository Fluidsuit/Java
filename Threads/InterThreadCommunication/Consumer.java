public class Consumer extends Thread{
    private Holder holder;

    public Consumer(Holder holder) {
        this.holder = holder;
    }

    @Override
    public void run() {
        synchronized (holder) {
            while (true) {
                try {
                    holder.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                holder.get();
                holder.notify();
            }
        }
    }
}
