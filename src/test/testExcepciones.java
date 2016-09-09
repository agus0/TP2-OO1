package test;

import java.util.GregorianCalendar;

import modelo.Ceta;
import modelo.Contribuyente;
import modelo.Rodado;
import modelo.Funciones;

public class testExcepciones {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("\nContribuyente\nEscenario 1 \n");
			Contribuyente persona = new Contribuyente(1,"Melgarejo","Jose", 94557769, 'M',"20945577690");
			System.out.println(persona.toString());
		}
		catch(Exception e){
			System.out.println("Excepcion " + e.getMessage());
		}
		try{
			System.out.println("\nEscenario 2\n");
			Contribuyente persona1 = new Contribuyente(2,"ortega","Jose", 94557769, 'M',"20945577691");
			
			System.out.println(persona1.toString());
		}
		catch(Exception e){
			System.out.println("Excepcion  " + e.getMessage());
		}
		try{
			System.out.println("\nEscenario 3\n");
			Contribuyente persona2 = new Contribuyente(1,"Melgarejo","Jose", 94557769, 'R',"20945577690");
			System.out.println(persona2.toString());
		}
		catch(Exception e){
			System.out.println("Excepcion " + e.getMessage());
		}
		try{
			System.out.println("\nRodados");
			System.out.println("\nEscenario 4 \n");
			Rodado auto = new Rodado(1, "sfr231", "Audi", 2015);
			System.out.println(auto.toString());
		}
		catch(Exception e){
			System.out.println("Excepcion " + e.getMessage());
		}
		try{
			System.out.println("\nEscenario 5\n");
			Rodado auto = new Rodado(1, "1fr231", "Audi", 2015);
			System.out.println(auto.toString());
		}
		catch(Exception e){
			System.out.println("Excepcion " + e.getMessage());
		}
		try{
			System.out.println("\nCeta");
			System.out.println("\nEscenario 6\n");
			
			Contribuyente vendedor = new Contribuyente(1,"Melgarejo","Jose", 94557769, 'm',"20945577690");
			Contribuyente comprador = new Contribuyente(2,"asda","JUAN", 94557769, 'm',"20946189287");
			GregorianCalendar fecha = new GregorianCalendar();
			Ceta venta = new Ceta(1,fecha , vendedor, comprador, 1000.0, true);
			System.out.println(venta.toString());
		}
		catch(Exception e){
			System.out.println("Excepcion " + e.getMessage());
		}
		try{
			System.out.println("\nEscenario 7\n");	
			Contribuyente vendedor = new Contribuyente(1,"Melgarejo","Jose", 94557769, 'm',"20945577690");
			GregorianCalendar fecha = new GregorianCalendar();
			Ceta venta = new Ceta(1,fecha , vendedor, vendedor, 1000.0, true);
			System.out.println(venta.toString());
		}
		catch(Exception e){
			System.out.println("Excepcion " + e.getMessage());
		}
		try{
			System.out.println("\nEscenario 8\n");
			
			Contribuyente vendedor = new Contribuyente(1,"Melgarejo","Jose", 94557769, 'm',"20945577690");
			Contribuyente comprador = new Contribuyente(2,"asda","JUAN", 94557769, 'm',"20946189287");
			Ceta venta = new Ceta(1,Funciones.traerFecha(2016,9,12) , vendedor, comprador, 1000.0, true);
			System.out.println(venta.toString());
		}
		catch(Exception e){
			System.out.println("Excepcion " + e.getMessage());
		}
	}

}
