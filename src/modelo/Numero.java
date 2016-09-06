package modelo;

public class Numero {
	private int	n;

	public Numero(int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public boolean esPrimo() {
		int 	i;
		boolean primo = true;
		
		if (n % 2 != 0 ) {
			for(i=3; (primo) && (i<= (int)Math.sqrt(n));i+=2){
				if (n % i == 0) {
					primo = false;
			    }	
			}
		}else{
			if(n==2){
				primo = true;
			}else{
			primo = false;
			}
		}
		return primo;
	}
	
	public boolean esPrimoMellizo(Numero n) {
		boolean resultado = false;
		if (this.esPrimo() && n.esPrimo() && Math.abs(this.getN() - n.getN()) == 2) {
			resultado = true;
		}
		return resultado;
	}
}
