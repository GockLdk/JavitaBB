/**
*
*@author Anallely_y_Mario 
*@version 03/10/18
*
**/

public class Mascota 
{
	/**
	* Atributo
	**/
	private String mascota;

	/**
	*Constructor sin argumentos
	**/
	public Mascota()
	{
		this.mascota="NA";
	}

	/**
	*Constructor
	*@param mas nombre de la mascota
	**/
	public Mascota(String mas)
	{
		this.mascota = mas;
	} 

	/**
	*Sobreescritura de toString para devolver
	*el nombre de la mascota
	*@return regresa a la mascota
	**/
	public String toString()
	{
		return this.mascota;
	}
}