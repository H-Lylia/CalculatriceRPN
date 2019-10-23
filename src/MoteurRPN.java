import java.util.Stack;

public class MoteurRPN {
	
	public static Stack<Double> Pile = new Stack<Double>();
	
	private static void ajouterAPile(double d) {
		Pile.push(d);
		//System.out.println("zzzzzzzzz");
		
	}
	
	private static void calculate (Operation op) throws DivisionParZeroException, OperandeManquanteException {
		
		double res=0;
		
		if (Pile.size()== 1 || Pile.isEmpty()) {
	    	/*/System.out.println("llllll");*/
	    	throw new OperandeManquanteException();
	    }
		double top1 = Pile.pop();
	    double top2 = Pile.pop();
	    
		if (top1 == 0 && op.symbol== '/') {
	    	//System.out.println("cccccccc");
	    	throw new DivisionParZeroException();
	    }
		
		
//		if (op.symbol == '+') {
//			res = op.PLUS.eval(top2, top1);
//		}
		
		switch (op.symbol) {
		case '/' : res = op.DIV.eval(top2, top1); break;
		
		case '+' : res = op.PLUS.eval(top2, top1); break;
		
		case '*' : res = op.MULT.eval(top2, top1); break;
		
		case '-' : res = op.MOINS.eval(top2, top1); break;
		}
		
		ajouterAPile(res);
		
		System.out.println("the result is : " + res);

	}
	
	public static void main (String s[]) throws DivisionParZeroException, OperandeManquanteException{
    	Operation op = Operation.MOINS;
    	Operation op2 = Operation.MULT;
//		double a,b;
//		a= 10; b = 5;
//		a = op.eval(a, b);
//		System.out.println(a);
//		ajouterAPile(5);
		ajouterAPile(9);
		ajouterAPile(6);
		
		calculate (op);
		
		ajouterAPile(4);
		
		calculate (op2);
	}
	
}
