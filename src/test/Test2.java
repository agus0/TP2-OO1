package test;

import modelo.Numero;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testSonPrimosMellizos();


	}

	private static void testSonPrimosMellizos() {
		Numero num1 = new Numero (5);
		Numero num2 = new Numero (7);
		Numero num3 = new Numero (9);
		Numero num4 = new Numero (2);
		
		System.out.println(num1.getN() + " y " + num2.getN() + " primos mellizos? " + num1.esPrimoMellizo(num2));
		System.out.println(num1.getN() + " y " + num3.getN() + " primos mellizos? " + num1.esPrimoMellizo(num3));
		System.out.println(num1.getN() + " y " + num4.getN() + " primos mellizos? " + num1.esPrimoMellizo(num4));
		System.out.println("\n");
	}

}
