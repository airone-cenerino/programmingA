/**
 * Minus
 */
public class Minus extends Expr{
    Expr left;
    Expr right;

    Minus(Expr l, Expr r){
        left = l;
        right = r;
    }

    @Override
    String exprToString() {
        return "(" + left.exprToString() + "-" + right.exprToString() + ")";
    }

    @Override
    int eval() {
        return left.eval() - right.eval();
    }
}