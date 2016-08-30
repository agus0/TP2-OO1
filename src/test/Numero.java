package test;

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
		int 	contador = 2;
		boolean primo = true;
		
		if (n % 2 != 0 || n == 2) {
			while ((primo) && (contador != n)){
				if (n % contador == 0) {
					primo = false;
			    }
				contador++;  	
			}
		}else{
			primo = false;
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
