package test;

import modelo.Contribuyente;

public class testExcepciones {

	private static void testCuil(){
		Contribuyente persona = new Contribuyente(1,"Melgarejo","Jose", 94557769, 'M',"20945577690");
		System.out.println(persona.toString());
		Contribuyente persona1 = new Contribuyente(1,"Vescio","Javier", 94557769, 'M',"20945577692");
		System.out.println(persona1.toString());
	}
	
	private static void testSexo(){
		
	}
	
	private static void testDominio(){
		
	}
	
	private static void testMismoContribuyente(){
		
	}
	
	private static void testFecha(){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testCuil();
		testSexo();
		testDominio();
		testMismoContribuyente();
		testFecha();
	}

}
