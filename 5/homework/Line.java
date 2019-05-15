/**
 * Line
 */
public class Line {
    double p1x;
    double p1y;
    double p2x;
    double p2y;

    Line(double x1, double y1, double x2, double y2) {
        p1x = x1;
        p1y = y1;
        p2x = x2;
        p2y = y2;
    }

    public String toString() {
        return "(" + p1x + "," + p1y + ")-(" + p2x + "," + p2y + ")";
    }

    public double getLength() {
        return Math.sqrt((p1x - p2x) * (p1x - p2x) + (p1y - p2y) * (p1y - p2y));
    }

    public static void main(String[] args) {
        Line line1 = new Line(10.5, 20.1, 100.0, 50.0);
        Line line2 = new Line(-1.0, 0.0, 0.0, 1.0);
        System.out.println(line1);
        System.out.println(line1.getLength());
        System.out.println(line2);
        System.out.println(line2.getLength());
    }
}