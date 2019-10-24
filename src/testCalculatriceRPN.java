import static org.junit.Assert.*;

import org.junit.Test;


public class testCalculatriceRPN {
 
	
	
///////////////////////////////////////////
/////    *Tests d'instanciation*    //////
//////////////////////////////////////////

	@Test
	public void testInstPlus(){
		Operation op = Operation.PLUS;
		assertNotNull(op);
	}
	
	@Test
	public void testInstMoins(){
		Operation op = Operation.MOINS;
		assertNotNull(op);
	}
	
	@Test
	public void testInstMult(){
		Operation op = Operation.MULT;
		assertNotNull(op);
	}

	@Test
	public void testInstDiv(){
		Operation op = Operation.DIV;
		assertNotNull(op);
	}
	
	@Test
	public void testInstMoteurRPN() {
		MoteurRPN RPNM = new MoteurRPN();
		assertNotNull(RPNM);
	}

	@Test
	public void testInstSaisie() {
		SaisieRPN RPNS = new SaisieRPN();
		assertNotNull(RPNS);
	}

	@Test
	public void testInstCalculatriceRPN() {
		CalculatriceRPN RPNC = CalculatriceRPN.CALCULATRICE;
		assertNotNull(RPNC);
	}
		
	
	
///////////////////////////////////////////
/////*Tests des opérations de base *//////
//////////////////////////////////////////
	
	
	@Test
	public void testMult () {
		Operation op = Operation.MULT;
		assertEquals (9, op.eval(3,3), 0);
	}

	@Test
	public void testDiv() {
		Operation op = Operation.DIV;
		assertEquals (3, op.eval(9,3), 0);
	}
	
	@Test
	public void testPlus () {
		Operation op = Operation.PLUS;
		assertEquals (10, op.eval(5,5), 0);
	}

	@Test
	public void testMoins () {
		Operation op = Operation.MOINS;
		assertEquals (15, op.eval(45,30), 0);

	}
	
	
		
	
	
///////////////////////////////////////////
/////     *Tests des exceptions*    //////
//////////////////////////////////////////
	

	@Test
	public void testExceptionZero() throws DivisionParZeroException, OperandeManquanteException, InferieurAMinException, SuperieurAMaxException {
		MoteurRPN RPNM = new MoteurRPN();
		try{
			RPNM.ajouterAPile(15);
			RPNM.ajouterAPile(0);
			RPNM.calculate(Operation.DIV);
			
		}
		catch(OperandeManquanteException | DivisionParZeroException  e)
		{
			assertFalse(!e.getMessage().equals("Impossible de diviser par zéro")) ;
		}	
	}
	
	
	
	@Test 
	public void testOperandeManquante ()throws DivisionParZeroException, OperandeManquanteException, InferieurAMinException, SuperieurAMaxException {
		MoteurRPN RPNM = new MoteurRPN();
		try{
			RPNM.ajouterAPile(15);
			RPNM.calculate(Operation.PLUS);
			
		}
		catch(OperandeManquanteException | DivisionParZeroException  e)
		{
			assertFalse(!e.getMessage().equals("Operation impossible (il faut deux opérandes)")) ;
		}	
	}
	
}
	