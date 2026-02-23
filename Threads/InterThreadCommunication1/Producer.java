public class Producer extends Thread{
    private Holder holder;
    private boolean signal = true;

    public void setSignal(boolean signal) {
        this.signal = signal;
    }

    public Producer(Holder holder) {
        this.holder = holder;
    }

    @Override
    public void run() {
        int i = 0;
        synchronized (holder) {
            while (signal) {
                if(!holder.isFlag()) {
                    holder.put(i++);
                    holder.setFlag(true);
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
