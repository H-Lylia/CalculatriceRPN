import java.util.Stack;

public class MoteurRPN {
	
	public static Stack<Double> Pile = new Stack<Double>();
	
	private static void ajouterAPile(double d) {
		Pile.push(d);
		//System.out.println("zzzzzzzzz");
		
	}
	
	private static void calculate (Operation op) throws DivisionParZeroException, OperandeManquanteException {
		
		if (Pile.size()== 1 || Pile.isEmpty()) {
	    	//System.out.println("llllll");
	    	throw new OperandeManquanteException();
	    }
		double top1 = Pile.pop();
	    double top2 = Pile.pop();
	    
		if (top1 == 0 && op.symbol== '/') {
	    	//System.out.println("cccccccc");
	    	throw new DivisionParZeroException();
	    }

	}
	
	public static void main (String s[]) throws DivisionParZeroException, OperandeManquanteException{
    	Operation op = Operation.DIV;
//		double a,b;
//		a= 10; b = 5;
//		a = op.eval(a, b);
//		System.out.println(a);
		//ajouterAPile(5);
		ajouterAPile(9);
		
		calculate (op);
		
	}

}
