package test;

import modelo.Ceta;
import modelo.Contribuyente;
import modelo.Rodado;
import modelo.Funciones;;

public class testExcepciones {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("Escenario 1 Datos correctos");
			Contribuyente persona = new Contribuyente(1,"Melgarejo","Jose", 94557769, 'M',"20945577690");
			System.out.println(persona.toString());
		}
		catch(Exception e){
			System.out.println("Excepcion " + e.getMessage());
		}
		try{
			System.out.println("Escenario 2");
			Contribuyente persona1 = new Contribuyente(2,"ortega","Jose", 94557769, 'M',"20945577691");
			
			System.out.println(persona1.toString());
		}
		catch(Exception e){
			System.out.println("Excepcion  " + e.getMessage());
		}
		try{
			System.out.println("Escenario 3");
			Contribuyente persona2 = new Contribuyente(1,"Melgarejo","Jose", 94557769, 'R',"20945577690");
			System.out.println(persona2.toString());
		}
		catch(Exception e){
			System.out.println("Excepcion " + e.getMessage());
		}
		try{
			System.out.println("Rodados");
			System.out.println("Escenario 4 Datos Correctos");
			Rodado auto = new Rodado(1, "sfr231", "Audi", 2015);
			System.out.println(auto.toString());
		}
		catch(Exception e){
			System.out.println("Excepcion " + e.getMessage());
		}
		try{
			System.out.println("Escenario 5");
			Rodado auto = new Rodado(1, "1fr231", "Audi", 2015);
			System.out.println(auto.toString());
		}
		catch(Exception e){
			System.out.println("Excepcion " + e.getMessage());
		}
		try{
			System.out.println("Ceta");
			System.out.println("Escenario 6");
			
			Rodado auto = new Rodado(1, "sfr231", "Audi", 2015);
			Contribuyente persona2 = new Contribuyente(1,"Melgarejo","Jose", 94557769, 'm',"20945577690");
			Ceta venta = new Ceta(1, Funciones.traerFecha(2016, 8, 20), persona2, persona2, 0, false);
			System.out.println(venta.toString());
		}
		catch(Exception e){
			System.out.println("Excepcion " + e.getMessage());
		}
	}

}
