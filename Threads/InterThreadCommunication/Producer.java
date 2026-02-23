public class Producer extends Thread{
    private Holder holder;

    public Producer(Holder holder) {
        this.holder = holder;
    }

    @Override
    public void run() {
        int i = 0;
        synchronized (holder) {
            while (true) {
                holder.put(i++);
                holder.notify();
                try {
                    holder.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
