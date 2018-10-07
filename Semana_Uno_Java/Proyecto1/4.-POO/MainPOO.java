

/**
*
*@author Anallely_y_Mario 
*@version 03/10/18
*
**/

//HERENCIA - clase Mayito hereda de clase Prebe
class Mayito extends Prebe 
{
	/**
     * Metodo constructor para la clase Mayito
	 * 
     * @param nombre nombre del prebe
     */

	Mayito (String nombre)
	{
		setNombre(nombre);
	}
	public void carrera()
	{

		System.out.println("Me llamo: "+getNombre());
	}
}


class Anallely extends Prebe //Herencia
{
	/**
     * Metodo constructor para la clase Prebe
	 * 
     * @param nombre nombre del prebe
     */
	Anallely (String nombre)
	{
		setNombre(nombre);
	}
	public void carrera()
	{

		System.out.println("Me llamo: "+getNombre());
	}
}

public class MainPOO {
	public static void main(String[] args) {
			Mayito c = new Mayito("MarioAlberto");
			Anallely m = new Anallely("Anallely");

//POLIMORFISMO
			c.carrera(); 
			m.carrera(); 
	}




}