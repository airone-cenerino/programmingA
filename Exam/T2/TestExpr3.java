import java.util.*;

public class TestExpr3 {
    public static void main(String args[]) {
	Expr e0 = new Num(3);
	Expr e1 = new Times(new Plus(new Num(-2),e0),new Num(4));
	Expr e2 = new Plus(e1,new Times(new Num(99),new Num(-101)));
	Expr e3 = new Minus(new Num(100),new Num(99));
	Expr e4 = new Minus(new Times(new Num(4),new Num(5)),e3);

	ArrayList<Expr> elist = new ArrayList<Expr>();
	elist.add(e0);
	elist.add(e1);
	elist.add(e2);
	elist.add(e3);
	elist.add(e4);

	ExprSort.sortExpr(elist);

	/*
	  outputs:
            -9995 = ((-2+3)*4+99*-101)
            1 = (100-99)
            3 = 3
            4 = (-2+3)*4
            19 = (4*5-(100-99))
	 */
	for (Expr e : elist) {
	    System.out.println(e.eval() + " = " + e.exprToString());
	}
    }
}
