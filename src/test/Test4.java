package test;

import modelo.Numero;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		imprimirMellizosHasta(50);
	}

	public static void imprimirMellizosHasta(int n) {
		Numero 	num1 = new Numero(0);
		Numero 	num2 = new Numero(0);
		int		x = 1;
		
		System.out.println("Lista de primos mellizos hasta " + n + ":");
		while(x <= n) {
			num1.setN(x);
			num2.setN(x + 2);
			if (num1.esPrimoMellizo(num2)) {
				System.out.println(num1.getN() + " y " + num2.getN());
			}
			x++;
		}
		System.out.println("\n");
	}

}
