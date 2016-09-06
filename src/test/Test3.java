package test;

import modelo.Numero;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		imprimirPrimosHasta(50);

	}

	private static void imprimirPrimosHasta (int n) {
		int 	i;
		Numero	num = new Numero(0);
		System.out.println("Numeros primos hasta " + n + ":");
		for (i = 1; i <= n; i++) {
			num.setN(i);
			if (num.esPrimo()) {
				System.out.println(num.getN());
			}
		}
		System.out.println("\n");
	}

}
