import java.util.Scanner;

public class SaisieRPN {
	public SaisieRPN(){
		MoteurRPN RPNM = new MoteurRPN();
	}


public void saisie (MoteurRPN RPNM) {
	Scanner scan = new Scanner (System.in);
	
	while (scan.hasNextLine()) {
		String s = scan.nextLine();
		
		if (!s.equals("exit"))
		{
			if (s.equals('/')) {
				RPNM.calculate(Operation.DIV);
				
			}
			
		}
		
		
	}
}


  



}
