public class Main {
    public static void main(String[] args) {
        Holder holder = new Holder();

        Consumer consumer = new Consumer(holder);
        consumer.start();
        Producer producer = new Producer(holder);
        producer.start();

    }
}
