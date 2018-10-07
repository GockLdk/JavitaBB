/**
*
*@author Anallely_y_Mario 
*@version 02/10/18
*
**/

public class Prueba extends ClaseInservible //intenta heredar de clase inservible
{
	/**
	*Metodo que intenta usar el metodo constructor de la clase inservible
	*@param n recibe una string
	**/
	public Prueba(String n)
	{
		super(n);
	}

	/**
	*Main
	*Donde se intenta instanciar un objeto de clase inservible
	* y usar el metodo estatico de la clase inservible
	*@param args no recibe nada 
	**/
	public static void main(String[] args) {
		ClaseInservible j = new ClaseInservible();

		System.out.println(j.nosirve());
	}
}