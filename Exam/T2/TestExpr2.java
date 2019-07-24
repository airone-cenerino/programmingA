public class TestExpr2 {
    public static void main(String args[]) {
	Expr e0 = new Num(3);
	// outputs "e0.eval() is 3"
	System.out.println("e0.eval() is " + e0.eval());
	Expr e1 = new Times(new Plus(new Num(-2),e0),new Num(4));
	// outputs "e1.eval() is 4"
	System.out.println("e1.eval() is " + e1.eval());
	Expr e2 = new Plus(e1,new Times(new Num(99),new Num(-101)));
	// outputs "e2.eval() is -9995"
	System.out.println("e2.eval() is " + e2.eval());
	Expr e3 = new Minus(new Num(100),new Num(99));
	// outputs "e3.eval() is 1"
	System.out.println("e3.eval() is " + e3.eval());
	// outputs "e4 is (4*5-(100-99))"
	Expr e4 = new Minus(new Times(new Num(4),new Num(5)),e3);
	// outputs "e4.eval() is 19"
	System.out.println("e4.eval() is " + e4.eval());
    }
}
