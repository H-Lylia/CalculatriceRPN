import java.util.Scanner;

public class SaisieRPN {
	public SaisieRPN(){
		MoteurRPN RPNM = new MoteurRPN();
	}


public void saisie (MoteurRPN RPNM) throws DivisionParZeroException, OperandeManquanteException{
	Scanner scan = new Scanner (System.in);
	
	while (scan.hasNextLine()) {
		String s = scan.nextLine();
		
		if (!s.equals("exit"))
		{
			if (s.equals("/")) {
				RPNM.calculate(Operation.DIV);
			}
			
			else if (s.equals("*")) {
				RPNM.calculate(Operation.MULT);
			}
			
			else if (s.equals("+")) {
				RPNM.calculate(Operation.PLUS);
			}
			
			else if (s.equals("-")) {
				RPNM.calculate(Operation.MOINS);
			}
			
			else {
				double d = Double.parseDouble(s);
				RPNM.ajouterAPile(d);
			}
			//System.out.println();
			RPNM.AffichePile();
				
		}
		
		
	}
}


  



}
