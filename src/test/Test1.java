package test;

import modelo.Numero;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testSonPrimos();


	}

	private static void testSonPrimos() {
		Numero num1 = new Numero(8);
		Numero num2 = new Numero(7);
		
		System.out.println(num1.getN() + " primo? " + num1.esPrimo());
		System.out.println(num2.getN() + " primo? " + num2.esPrimo());
		System.out.println("\n");
	}

}
