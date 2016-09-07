package modelo;

public class Contribuyente {
	private int idContribuyente;
	private String apellido,nombre;
	private long dni;
	private char sexo;
	private String cuil = new String();
	
	public Contribuyente(int idContribuyente, String apellido, String nombre, long dni, char sexo, String cuil) {
		this.idContribuyente = idContribuyente;
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
		this.sexo = sexo;
		this.cuil = cuil;
	}
	
	public int getIdContribuyente() {
		return idContribuyente;
	}
	
	public void setIdContribuyente(int idContribuyente) {
		this.idContribuyente = idContribuyente;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public long getDni() {
		return dni;
	}
	
	public void setDni(long dni) {
		this.dni = dni;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public void setSexo(char sexo) throws Exception {
		if (validarSexo(sexo)) {
			this.sexo = sexo;
		}else{
			throw new Exception("Error " + sexo + " es un caracter incorrecto. Ingrese F o M");
		}
	}
	
	public String getCuil() {
		return cuil;
	}
	
	public void setCuil(String cuil) throws Exception{
		if (validarCuil(cuil)) {
			this.cuil = cuil;
		}else{
			throw new Exception("Error: cuil invalido.");
		}
	}
	
	@Override
	public String toString() {
		return "idContribuyente=" + idContribuyente + "\nApellido=" + apellido + ",\nNombre=" + nombre
				+ "\nDni=" + dni + "\nSexo=" + sexo + "\nCuil=" + cuil + "\n";
	}
	
	public static boolean validarCuil(String cuil) {
		boolean resultado = true;
		
		return resultado;
	}
	
	public static boolean validarSexo(char sexo) {
		boolean resultado = false;
		
		if (Character.toLowerCase(sexo) == 'f' || Character.toLowerCase(sexo) == 'm') {
			resultado = true;
		}
		return resultado;
	}
}
