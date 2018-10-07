

/**
*
*@author Anallely_y_Mario 
*@version 03/10/18
*
**/

public class Deportista
{
	private String nombre;
	private String deporte;
	private String posicion;
	private String horario;

	  /**
     * Metodo constructor para clase Futbolista
     * @param nombre nombre
     * @param deporte deporte
     * @param posicion posicion
     */

	public Deportista (String nombre, String deporte, String posicion)

	{
		this.nombre = nombre;
		this.deporte = deporte;
		this.posicion = posicion;
	}

	/**
     * Metodo para devolver nombre
     *@return nombre
     */

	public String getNombre(){
	return nombre;
	}


	/**
     * Metodo para devolver deporte
     *@return deporte
     */

	public String getDeporte(){
	return deporte;
	}

	/**
     * Metodo para devolver posicion
     *@return posicion
     */

	public String getPosicion(){
	return posicion;
	}

	
	
}