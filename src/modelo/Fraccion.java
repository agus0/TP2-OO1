package modelo;

public class Fraccion {
	private int numerador , denominador;
	public Fraccion ( int numerador , int denominador ) throws Exception {
	this . numerador = numerador;
	this . setDenominador ( denominador ); ;
	}
	
	public int getNumerador () {
	return numerador;
	}
	public void setNumerador ( int numerador ) {
	this . numerador = numerador;
	}
	public int getDenominador () {
	return denominador;
	}
	public void setDenominador ( int denominador ) throws Exception {
	if ( denominador == 0 ) throw new Exception ( "Error: Objeto Fracci�n inv�lido, el denominador NO puede ser cero" );
	else this . denominador = denominador;
	}
	public String toString (){
	return "(" + numerador + "/" + denominador + ")" ;
	}
	public Fraccion dividir ( Fraccion f ) throws Exception{
	if ( f . convertirAReal ()== 0 ) throw new Exception ( "Error: Divisi�n por cero: " + f );
	return new Fraccion ( numerador * f . getDenominador (),
	denominador * f . getNumerador ());
	}
	public double convertirAReal () throws Exception {
	return ( Funciones . convertirDoble( numerador ) /
	Funciones . convertirDoble( denominador ));
	}
	public double raizCuadrada () throws Exception{
	if ( numerador * denominador < 0 ) throw new Exception ( "Error: el radicando es negativo");
			return Math . pow( this . convertirAReal (), 0.5 );
	}
}
