package modelo;

public class Rodado {
	private int idRodado;
	private String dominio, marca;
	private int modelo;
	
	public Rodado(int idRodado, String dominio, String marca, int modelo) {
		this.idRodado = idRodado;
		this.dominio = dominio;
		this.marca = marca;
		this.modelo = modelo;
	}
	public int getIdRodado() {
		return idRodado;
	}
	
	public void setIdRodado(int idRodado) {
		this.idRodado = idRodado;
	}
	
	public String getDominio() {
		return dominio;
	}
	
	public void setDominio(String dominio) throws Exception{
		if (validarDominio(dominio)) {
			this.dominio = dominio;
		}else{
			throw new Exception("Error: Dominio invalido.");
		}
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public int getModelo() {
		return modelo;
	}
	
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
		return "[idRodado=" + idRodado + ", dominio=" + dominio + ", marca=" + marca + ", modelo=" + modelo	+ "]";
	}
	
	public static boolean validarDominio(String dominio) {
		boolean resultado = true;
		
		return resultado;
	}
	
}
