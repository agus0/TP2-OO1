package test;
import java.util.GregorianCalendar;


public class Test {

	private static void testBisiesto() {
		System.out.println("2005 es bisiesto?: " + Funciones.esBisiesto(2005));
		System.out.println("2004 es bisiesto?: " + Funciones.esBisiesto(2004));
		System.out.println("\n");
	}
	
	private static void testTraerAnio(){
		GregorianCalendar fecha = new GregorianCalendar();
		
		System.out.println("Año actual: " + Funciones.traerAnio(fecha));
		System.out.println("\n");
	}
	
	private static void testTraerMes(){
		GregorianCalendar fecha = new GregorianCalendar();
		
		System.out.println("Mes actual: " + Funciones.traerMes(fecha));
		System.out.println("\n");
	}
	
	private static void testTraerDia(){
		GregorianCalendar fecha = new GregorianCalendar();
		
		System.out.println("Dia actual: " + Funciones.traerDia(fecha));
		System.out.println("\n");
	}
	
	private static void testEsFechaValida(){
		System.out.println("26/06/1994 es valida?: " + Funciones.esFechaValida(1994, 6, 26));
		System.out.println("29/02/2016 es valida?: " + Funciones.esFechaValida(2016, 2, 29));
		System.out.println("29/02/2015 es valida?: " + Funciones.esFechaValida(2015, 2, 29));
		System.out.println("35/06/2012 es valida?: " + Funciones.esFechaValida(2012, 6, 35));
		System.out.println("1/15/2010 es valida?: " + Funciones.esFechaValida(2010, 15, 1));
		System.out.println("cantidad de dias de Febrero de 2016: " + Funciones.traerCantDiasDeUnMes(2016, 02));
		System.out.println("cantidad de dias de Febrero de 2015: " + Funciones.traerCantDiasDeUnMes(2015, 02));
		System.out.println("\n");
	}
	
	private static void testTraerFecha() {
		System.out.println("Dia en 26/06/1994: " + Funciones.traerDia(Funciones.traerFecha(1994, 06, 26)));
		System.out.println("Mes en 15/04/2005: " + Funciones.traerMes(Funciones.traerFecha("15/04/2005")));
		System.out.print("\n");
	}
	
	private static void testTraerFechaCorta () {
		System.out.println(Funciones.traerFechaCorta(new GregorianCalendar ()));
		System.out.println(Funciones.traerFechaCortaHora(new GregorianCalendar ()));
		System.out.println("En 10 dias sera: " + Funciones.traerFechaCorta(Funciones.traerFechaProximo(new GregorianCalendar(), 10)));
		System.out.println("\n");
	}
	
	private static void testEsDiaHabil () {
		String fecha = "26/06/1994";
		
		System.out.println("Hoy es dia habil?: " + Funciones.esDiaHabil(new GregorianCalendar()));
		System.out.println(fecha + " es dia habil?: " + Funciones.esDiaHabil(Funciones.traerFecha(fecha)));
		System.out.println("\n");
	}
	
	private static void testTraerDiaDeLaSemana(){
		System.out.println("Hoy es " + Funciones.traerDiaDeLaSemana(new GregorianCalendar()) + " - " + Funciones.traerMesEnLetras(new GregorianCalendar()));
		System.out.print("\nHoy es:\n");
		System.out.println(Funciones.traerFechaLarga(new GregorianCalendar()));
		System.out.println("\n");
	}
	
	private static void testCompara() {
		String fecha1 = "14/06/1954";
		String fecha2 = "26/06/1994";
		String f_hoy  = "23/08/2016";
				
		System.out.println(fecha1 + " = " + fecha2 + "? " + Funciones.sonFechasIguales(Funciones.traerFecha(fecha1), Funciones.traerFecha(fecha2)));
		System.out.println(f_hoy + " = " + f_hoy + "? " + Funciones.sonFechasIguales(Funciones.traerFecha(f_hoy), Funciones.traerFecha(f_hoy)));
		System.out.println("\n");
	}
	
	private static void testCadenas( ){
		String		nro = "12312";
		String 		nonro = "123rsa";
		String		letra = "hola";
		String 		noletra = "hola1";		
		
		System.out.println(nro + " es numero? " + Funciones.esCadenaNros(nro));
		System.out.println(nonro + " es numero? " + Funciones.esCadenaNros(nonro));
		System.out.println(letra + " es letra? " + Funciones.esCadenaLetras(letra));
		System.out.println(noletra + " es letra? " + Funciones.esCadenaLetras(noletra));
		System.out.println("\n");
	}
	
	private static void testSonPrimos() {
		Numero num1 = new Numero(8);
		Numero num2 = new Numero(7);
		
		System.out.println(num1.getN() + " primo? " + num1.esPrimo());
		System.out.println(num2.getN() + " primo? " + num2.esPrimo());
		System.out.println("\n");
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
	
	private static void imprimirPrimosHasta (int n) {
		int 	i;
		Numero	num = new Numero(0);
		System.out.println("Numeros primos hasta " + n + ":");
		for (i = 0; i < n; i++) {
			num.setN(i);
			if (num.esPrimo()) {
				System.out.println(num.getN());
			}
		}
		System.out.println("\n");
	}
	
	public static void imprimirMellizosHasta(int n) {
		Numero 	num1 = new Numero(0);
		Numero 	num2 = new Numero(0);
		int		x = 0;
		
		System.out.println("Lista de primos mellizos hasta " + n + ":");
		while(x < n) {
			num1.setN(x);
			num2.setN(x + 2);
			if (num1.esPrimoMellizo(num2)) {
				System.out.println(num1.getN() + " y " + num2.getN());
			}
			x++;
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		testBisiesto();
		testTraerAnio();
		testTraerMes();
		testTraerDia();
		testEsFechaValida();
		testTraerFecha();
		testTraerFechaCorta();
		testEsDiaHabil();
		testTraerDiaDeLaSemana();
		testCompara();
		testCadenas();
		testSonPrimos();
		testSonPrimosMellizos();
		imprimirPrimosHasta(20);
		imprimirMellizosHasta(20);
	}
}
