import java.util.Comparator;

public class Pixel {
    private int x, y;

    public Pixel() {
        x = y = 0;
    }

    public Pixel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Pixel{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class PixelComparator implements Comparator<Pixel> {
    @Override
    public int compare(Pixel o1, Pixel o2) {
        if(o1.getX() == o2.getX()) {
            return o1.getY() - o2.getY();
        }
        return o1.getX() - o2.getX();
    }
}
