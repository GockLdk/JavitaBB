

/**
*
*@author Anallely_y_Mario 
*@version 03/10/18
*
**/

//ABSTRACCION - abstraemos atributos del objeto prebe
public class Prebe
{

//ENCAPSULAMIENTO - hacemos privados los atributos 	
	private String nombre; 

	/**
     * Metodo constructor de Prebe
	 * 
     * @param nombre nombre del Prebe
     */

	public void setNombre(String nombre){
		this.nombre = nombre;
		
	}


	 
    /**
     * Metodo que para obtener carrera del prebe 
	 *
     * 
     */	
	
	public void carrera(){} // Metodo Abstracto


	 /**
     * Metodo que para obtener nombre del prebe 
	 *
     * @return nombre 
     */	

	public String getNombre(){
		return nombre;
	}


}