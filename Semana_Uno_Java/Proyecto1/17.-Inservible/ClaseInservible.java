/**
*
*@author Anallely_y_Mario 
*@version 02/10/18
*
**/

public class ClaseInservible
{
	private String n="No sirve";  //Atributo no heredable

	/**
	* Metodo Constructor exclusivo de la clase Inservible
	*@param n recibe una string
	**/
	private ClaseInservible (String n)
	{
		this.n = n;
	}

	/**
	* Metodo exclusivo de la clase Inservible
	**/
	private static String nosirve()
	{
		return "NO SIRVE";
	}
}