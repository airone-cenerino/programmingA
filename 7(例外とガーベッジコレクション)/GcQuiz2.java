class X {
    String info = null;
    X x = null;
    X(String s) {
        info = s;
    }
}

class Y extends X {
    static Y last = null;
    Y(String s, X newXX) {
        super(s);
        x = newXX;
        last = this;
    }
}

public class GcQuiz2 {
    static X x = new X("あ");
    Y y = new Y("い", x);
    public static void main(String[] args) {
        X[] a = new X[3];
        a[0] = new X("う");
        a[1] = new Y("え", a[0]);
        a[2] = new Y("お", new X("か"));
        
        if(new X("き") == new X("き")) {
            // 入らない
            a[2] = new X("く");
        } else {
            // 入る
            a[2] = a[1];
        }
        if(new Y("け", x) instanceof X) {
            // 入る
            a[0] = new X("こ");
        }
        a[1] = null;
        System.gc();
        // ※この時点
    }
}
