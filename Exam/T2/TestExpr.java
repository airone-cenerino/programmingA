public class TestExpr {
    public static void main(String args[]) {
	Expr e0 = new Num(3);
	// outputs "e0 is 3"
	System.out.println("e0 is " + e0.exprToString());
	// outputs "e1 is (-2+3)*4"
	Expr e1 = new Times(new Plus(new Num(-2),e0),new Num(4));
	System.out.println("e1 is " + e1.exprToString());
	// outputs "e2 is ((-2+3)*4+99*-101)"
	Expr e2 = new Plus(e1,new Times(new Num(99),new Num(-101)));
	System.out.println("e2 is " + e2.exprToString());
    }
}
