/**
 * Point
 */
public class Point extends Figure {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    String draw() {
        return "(" + x + "," + y + ")";
    }

    @Override
    void move(int mx, int my) {
        x += mx;
        y += my;
    }
}