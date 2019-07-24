public class Num extends Expr {
    int num;

    Num(int n) {
	    num = n;
    }

    String exprToString() {
	    return String.valueOf(num);
    }

    @Override
    int eval() {
        return num;
    }
}
