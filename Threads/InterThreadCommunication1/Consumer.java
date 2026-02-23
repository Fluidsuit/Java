public class Consumer extends Thread{
    private Holder holder;
    private boolean signal = true;

    public void setSignal(boolean signal) {
        this.signal = signal;
    }

    public Consumer(Holder holder) {
        this.holder = holder;
    }

    @Override
    public void run() {
        synchronized (holder) {
            while (signal) {
                if(holder.isFlag()) {
                    holder.get();
                    holder.setFlag(false);
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
}
