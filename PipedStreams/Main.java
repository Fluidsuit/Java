import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {

            PipedOutputStream pout = new PipedOutputStream();
            PipedInputStream pin = new PipedInputStream(pout);

            new Reader(pin).start();
            new Writer(pout).start();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

class Writer extends Thread {
    private PipedOutputStream pout;

    public Writer(PipedOutputStream pout) {
        this.pout = pout;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            try {
                pout.write( scanner.nextLine().getBytes());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}



class Reader extends Thread{
    private PipedInputStream pin;

    public Reader(PipedInputStream pin) {
        this.pin = pin;
    }

    @Override
    public void run() {
        byte [] data = new byte[100];
        int count;

        while(true) {
            try {
                if(pin.available() > 0) {
                    count = pin.read(data);
                    System.out.println("Reader got: " + new String(data, 0, count));
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}