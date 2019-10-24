
public enum Operation {
	
	PLUS('+'){
		@Override
		public double eval(double a, double b){
			System.out.println("Addition \n");
			return a+b;
		}
	},
	
	MOINS('-'){
		@Override
		public double eval(double a, double b){
			System.out.println("Soustraction \n");
			return a-b;
		}
	},
	MULT('*'){
		@Override
		public double eval(double a, double b){
			System.out.println("Multiplication \n");
			return a*b;
		}
	},
	DIV('/'){
		@Override
		public double eval(double a, double b){
			System.out.println("Division \n");
			return a/b;
		}
	};
	
	public char symbol;
		
		Operation(char symbol){
			this.symbol=symbol;
		}
	
	
	
	public abstract double eval(double a, double b);
	

}
 
