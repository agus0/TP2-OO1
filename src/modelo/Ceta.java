package modelo;

import java.util.GregorianCalendar;
import modelo.Funciones;

public class Ceta {
	private int idCeta;
	private GregorianCalendar fecha;
	private Contribuyente vendedor;
	private Contribuyente comprador;
	private double valorDeTranferencia;
	private boolean firmaComprador;
	
	public Ceta(int idCeta, GregorianCalendar fecha, Contribuyente vendedor, Contribuyente comprador,
		double valorDeTranferencia, boolean firmaComprador) throws Exception {

		this.idCeta = idCeta;
		this.setFecha(fecha);
		this.vendedor = vendedor;
		this.setComprador(comprador);
		this.valorDeTranferencia = valorDeTranferencia;
		this.firmaComprador = firmaComprador;
	}
	
	public int getIdCeta() {
		return idCeta;
	}
	
	public void setIdCeta(int idCeta) {
		this.idCeta = idCeta;
	}
	
	public GregorianCalendar getFecha() {
		return fecha;
	}
	
	public void setFecha(GregorianCalendar fecha) throws Exception {
		if(validarFecha(fecha)){
			this.fecha = fecha;
		}else{
			throw new Exception("ERROR: la fecha no puede ser posterior al día de hoy");
		}
	}
	
	public Contribuyente getVendedor() {
		return vendedor;
	}
	
	public void setVendedor(Contribuyente vendedor)  {
		
			this.vendedor = vendedor;
	}
	
	public Contribuyente getComprador() {
		return comprador;
	}
	
	public void setComprador(Contribuyente comprador) throws Exception{
		if (comprador.getCuil() == this.vendedor.getCuil()) {
			throw new Exception("Error: El Comprador y el Vendedor son el mismo.");
		}else{
			this.comprador = comprador;
		}
	}
	
	public double getValorDeTranferencia() {
		return valorDeTranferencia;
	}
	
	public void setValorDeTranferencia(double valorDeTranferencia) {
		this.valorDeTranferencia = valorDeTranferencia;
	}
	
	public boolean isFirmaComprador() {
		return firmaComprador;
	}
	
	public void setFirmaComprador(boolean firmaComprador) {
		this.firmaComprador = firmaComprador;
	}
	
	@Override
	public String toString() {
		return "Ceta \n idCeta=" + idCeta + "\nFECHA" + Funciones.traerFechaCorta(fecha) + "\n\n VENDEDOR\n" + vendedor + "\n COMPRADOR\n" + comprador
				+ "\nvalorDeTranferencia=" + valorDeTranferencia + "\nfirmaComprador=" + firmaComprador ;
	}
	public boolean validarFecha(GregorianCalendar fecha){
		
		boolean resultado = false;	
		GregorianCalendar fechaActual = new GregorianCalendar();
		if(fecha.compareTo(fechaActual) <= 0){
			resultado = true;	
		}
		
		return resultado;
	}
	
}
