import java.util.Scanner;

public class SaisieRPN {
MoteurRPN RPNM;

public void saisie (MoteurRPN RPNM) {
	Scanner scan = new Scanner (System.in);
	
	while (scan.hasNextLine()) {
		String s = scan.nextLine();
		
		if (!s.equals("exit"))
		{
			if (s.equals('/')) {
				Operation op = Operation.DIV;
				op.symbol='/';
				RPNM.calculate(op);
				
			}
			
		}
		
		
	}
}


  



}
