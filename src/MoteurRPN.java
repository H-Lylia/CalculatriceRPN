import java.util.Stack;

public class MoteurRPN {
	
	public static Stack<Double> Pile = new Stack<Double>();
	
	public static void ajouterAPile(double d) {
		Pile.push(d);		
	}
	
	public static void calculate (Operation op) throws DivisionParZeroException, OperandeManquanteException {
		
		double res=0;
		
		if (Pile.size()== 1 || Pile.isEmpty()) {
	    	throw new OperandeManquanteException();
	    }
		double top1 = Pile.pop();
	    double top2 = Pile.pop();
	    
		if (top1 == 0 && op.symbol== '/') {
	    	throw new DivisionParZeroException();
	    }
		
		
		switch (op.symbol) {
		case '/' : res = op.DIV.eval(top2, top1); break;
		
		case '+' : res = op.PLUS.eval(top2, top1); break;
		
		case '*' : res = op.MULT.eval(top2, top1); break;
		
		case '-' : res = op.MOINS.eval(top2, top1); break;
		}
		
		ajouterAPile(res);
		
		System.out.println("Le resultat est : " + res);
	}
	
	public static void m () throws DivisionParZeroException, OperandeManquanteException, InferieurAMinException, SuperieurAMaxException {

		System.out.println("Veuillez inserer les operations que vous souhaitez effectuer\n");
		
		MoteurRPN RPNM = new MoteurRPN();
		SaisieRPN SS = new SaisieRPN();
		SS.saisie(RPNM);
	}
	
	public static void AffichePile() {
		Pile.forEach(k-> {System.out.println(""+k);} );
	}
	
}
