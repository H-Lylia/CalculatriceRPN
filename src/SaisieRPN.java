import java.util.Scanner;
import java.util.*;

public class SaisieRPN {
	
	public final double VALEUR_MAX = 10000;
    public final double VALEUR_MIN = 0;
    
	public SaisieRPN(){
		MoteurRPN RPNM = new MoteurRPN();
	}	
	


	public void saisie (MoteurRPN RPNM) throws DivisionParZeroException, OperandeManquanteException, InferieurAMinException, SuperieurAMaxException{
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
					
					if (d>VALEUR_MAX) {
						throw new SuperieurAMaxException();
					}
						
					else if (d<VALEUR_MIN) {
						throw new InferieurAMinException();
					}
					
					RPNM.ajouterAPile(d);
					
					}
				}
				//System.out.println();
				RPNM.AffichePile();
					
			}
			
			
		}
	}
