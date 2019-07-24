public class Plus extends Expr {
    Expr left;
    Expr right;

    Plus(Expr l, Expr r) {
        left = l;
        right = r;
    }
    
    String exprToString() {
	    return "(" + left.exprToString() + "+" + right.exprToString() + ")";
    }

    @Override
    int eval() {
        return left.eval() + right.eval();
    }
}
