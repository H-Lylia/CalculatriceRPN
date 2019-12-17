
public enum CalculatriceRPN {
	CALCULATRICE (new MoteurRPN());
	
	private MoteurRPN SRPN;
	
	CalculatriceRPN(MoteurRPN SRPN2){
		this.SRPN = SRPN2;
	}
	
	public void on() throws DivisionParZeroException, OperandeManquanteException, InferieurAMinException, SuperieurAMaxException {
		SRPN.m();
	}
	
	public static void main(String args[]) throws DivisionParZeroException, OperandeManquanteException, InferieurAMinException, SuperieurAMaxException {
		CalculatriceRPN.CALCULATRICE.on();
	}
	
	
	
} 

TRYING TO COMMIT
