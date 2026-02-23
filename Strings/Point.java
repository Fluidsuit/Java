
public class Point {

    private int x;
    private int y;

    public Point() {
        x = y = 0;
    }

    public Point(int xc, int yc) {
        x = xc;
        y = yc;
    }

    public void setX(int xc) {
        x = xc;
    }

    public int getX() {
        return x;
    }

    public void setY(int yc) {
        y = yc;
    }

    public int getY() {
        return y;
    }

    public void display() {
        System.out.println("x = " + x + " y = " + y);
    }
}
