import java.util.Random;

public class Printer implements Printable {
    //methods and data members here


    @Override
    public void print(String filePath) {
        System.out.println("Printed the file: " + filePath);
    }

    @Override
    public boolean status() {
        return new Random().nextBoolean();
    }
}
