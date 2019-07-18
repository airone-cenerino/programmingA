/**
 * Point
 */
public class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Point a = new Point(100, 10);
        Point b = new Point(-5, 20);
        Point c = new Point(0, 0);

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println("x���W�l�̍��v = " + (a.x + b.x + c.x));
        System.out.println("y���W�l�̍��v = " + (a.y + b.y + c.y));
    }
}