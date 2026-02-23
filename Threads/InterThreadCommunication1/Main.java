public class Main {
    public static void main(String[] args) {
        Holder holder = new Holder();

        Producer producer = new Producer(holder);
        producer.start();

        Consumer consumer = new Consumer(holder);
        consumer.start();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        producer.setSignal(false);
        consumer.setSignal(false);

    }
}
