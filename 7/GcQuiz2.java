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
    static X x = new X("��");
    Y y = new Y("��", x);
    public static void main(String[] args) {
        X[] a = new X[3];
        a[0] = new X("��");
        a[1] = new Y("��", a[0]);
        a[2] = new Y("��", new X("��"));
        
        if(new X("��") == new X("��")) {
            // ����Ȃ�
            a[2] = new X("��");
        } else {
            // ����
            a[2] = a[1];
        }
        if(new Y("��", x) instanceof X) {
            // ����
            a[0] = new X("��");
        }
        a[1] = null;
        System.gc();
        // �����̎��_
    }
}
