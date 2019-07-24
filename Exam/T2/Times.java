public class Times extends Expr {
    Expr left;
    Expr right;

    Times(Expr l, Expr r) {
	left = l;
	right = r;
    }
    
    String exprToString() {
	return left.exprToString() + "*" + right.exprToString();
    }

    @Override
    int eval() {
        return left.eval() * right.eval();
    }
}
