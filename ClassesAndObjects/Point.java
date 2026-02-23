public class Point {
    private int x;
    private int y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int xc, int yc) {
        x = xc;
        y = yc;
    }

    public void draw() {
        System.out.println("x = " + x + " y = " + y);
    }
    
}
