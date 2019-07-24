public class TestExpr1 {
    public static void main(String args[]) {
	// outputs "e3 is (100-99)"
	Expr e3 = new Minus(new Num(100),new Num(99));
	System.out.println("e3 is " + e3.exprToString());
	// outputs "e4 is (4*5-(100-99))"
	Expr e4 = new Minus(new Times(new Num(4),new Num(5)),e3);
	System.out.println("e4 is " + e4.exprToString());
    }
}
