package modelo;

public class Contribuyente {
	private int idContribuyente;
	private String apellido,nombre;
	private long dni;
	private char sexo;
	private String cuil = new String();
	
	public Contribuyente(int idContribuyente, String apellido, String nombre, long dni, char sexo, String cuil) throws Exception {
		this.idContribuyente = idContribuyente;
		this.setApellido(apellido);
		this.setNombre(nombre);
		this.setDni(dni);
		this.setSexo(sexo);
		this.setCuil(cuil);
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
			this.sexo = Character.toLowerCase(sexo);
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
	
	public boolean validarCuil(String cuil) {
		boolean resultado = false;
		int 	valor1 = 0;
		int		valor2 = 0;
		int 	valor3 = 0;
		
		if (cuil.length() == 11) {
			if ((((this.getSexo() == 'f') && (cuil.substring(0, 1)) == "27"))
			|| (((this.getSexo() == 'm') && (cuil.substring(0, 1)) == "20"))) {
				valor1 =  (Integer.parseInt(""+cuil.charAt(0)) * 5)
						 +(Integer.parseInt(""+cuil.charAt(1)) * 4) 
						 +(Integer.parseInt(""+cuil.charAt(2)) * 3) 
						 +(Integer.parseInt(""+cuil.charAt(3)) * 2) 
						 +(Integer.parseInt(""+cuil.charAt(4)) * 7) 
						 +(Integer.parseInt(""+cuil.charAt(5)) * 6) 
						 +(Integer.parseInt(""+cuil.charAt(6)) * 5) 
						 +(Integer.parseInt(""+cuil.charAt(7)) * 4) 
						 +(Integer.parseInt(""+cuil.charAt(8)) * 3) 
						 +(Integer.parseInt(""+cuil.charAt(9)) * 2);
				valor2 = valor1 % 11;
				valor3 = 11 - valor2;
				if ( ((valor3 == 11) && (Integer.parseInt(""+cuil.charAt(11)) == 0))
				|| ((valor3 == 10) && (Integer.parseInt(""+cuil.charAt(11)) == 9))
				|| (valor3 == Integer.parseInt(""+cuil.charAt(11))) ) {
					resultado = true;
				}
			}
		}
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
