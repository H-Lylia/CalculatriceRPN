import java.util.Scanner;

public class SaisieRPN {
MoteurRPN RPNM;

public void saisie (MoteurRPN RPNM) {
	Scanner scan = new Scanner (System.in);
	
	while (scan.hasNextLine()) {
		String s = scan.nextLine();
		
		if (s.equals("exit"))
		{
			
			
		}
		//else if (isNumeric(s)) {
	}
}
/*
public static boolean isNumeric(String strNum) throws PasUnNombreException{
	double d;
	if (d != Double.parseDouble(strNum)) {
		throw new PasUnNombreException ();
		return false;
	}
	return true;
        		   
	}
*/
  



}
