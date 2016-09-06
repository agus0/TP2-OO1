package modelo;

public class Rodado {
	private int idRodado;
	private String dominio, marca;
	private int modelo;
	public Rodado(int idRodado, String dominio, String marca, int modelo) {
		super();
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
	public void setDominio(String dominio) {
		this.dominio = dominio;
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
		return "[idRodado=" + idRodado + ", dominio=" + dominio + ", marca=" + marca + ", modelo=" + modelo
				+ "]";
	}
	
}
