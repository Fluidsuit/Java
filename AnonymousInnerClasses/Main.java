import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Pixel> tree = new TreeSet<>(
                new Comparator<Pixel>() {
                    @Override
                    public int compare(Pixel o1, Pixel o2) {
                        return 0;
                    }
                }
        );


        ArrayList<Pixel> pixels = new ArrayList<>();
        pixels.add(new Pixel(55, 78));
        pixels.add(new Pixel(12, 34));
        pixels.add(new Pixel(98, 67));
        pixels.add(new Pixel(23, 45));
        pixels.add(new Pixel(76, 89));
        pixels.add(new Pixel(45, 12));
        pixels.add(new Pixel(67, 23));
        pixels.add(new Pixel(89, 56));
        pixels.add(new Pixel(34, 90));
        pixels.add(new Pixel(10, 15));
        pixels.add(new Pixel(120, 60));

        //Collections.sort(pixels, new PixelComparator());
        Collections.sort(
                pixels,
                new Comparator<Pixel>() {
                    @Override
                    public int compare(Pixel o1, Pixel o2) {
                        if(o1.getX() == o2.getX()) {
                            return o1.getY() - o2.getY();
                        }
                        return o1.getX() - o2.getX();
                    }
                }
        );

        for(Pixel p : pixels) {
            System.out.println(p);
        }


        System.out.println();

        //
        /*Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i <= 10; i++) {
                    try {
                        Thread.sleep(1000);
                        System.out.println(i);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        new Thread(runnable).start();*/

        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for(int i = 1; i <= 10; i++) {
                            try {
                                Thread.sleep(1000);
                                System.out.println(i);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
        ).start();

        Pixel p1 = new Pixel() {
            @Override
            public String toString() {
                return "x = " + getX()  + " y = " + getY();
            }
        };
        System.out.println(p1);
        System.out.println(p1.getClass().getName());


        Shape s = new Shape() {
            @Override
            public void draw() {
                System.out.println("Shape's draw: x = "+ getX() + " y = " + getY());
            }
        };
        s.draw();



        /*Printable printable = new Printable() {
            @Override
            public void print(String filePath) {
                System.out.println("** printing " + filePath + " **");
            }

            @Override
            public boolean status() {
                return false;
            }
        };
        printable.print("java.doc");
        System.out.println(printable.status());*/

        /*class MyPrinter implements Printable {
            @Override
            public void print(String filePath) {
                System.out.println("MyPrint: " + filePath);
            }

            @Override
            public boolean status() {
                return false;
            }
        }

        MyPrinter myPrinter = new MyPrinter();
        myPrinter.print("data.bin");
        System.out.println( myPrinter.status() );
        */



        /*Printer printer = new Printer();
        printer.print("somefile.txt");
        System.out.println(printer.status());*/


    }
}
