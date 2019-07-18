/**
 * Line
 */
public class Line extends Figure {
    Point p1;
    Point p2;

    Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    String draw() {
        return "(" + p1.draw() + "," + p2.draw() + ")";
    }

    @Override
    void move(int mx, int my) {
        p1.move(mx, my);
        p2.move(mx, my);
    }
}