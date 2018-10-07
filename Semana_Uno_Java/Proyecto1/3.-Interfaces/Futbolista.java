

/**
*
*@author Anallely_y_Mario 
*@version 03/10/18
*
**/


public class Futbolista extends Deportista implements Acciones
{
	
	 /**
     * Metodo constructor para clase Futbolista
     *@param name nombre
     * @param sport deporte
     * @param position posicion
     */

	public Futbolista(String name,String sport, String position)
	{
		super(name, sport, position);
	}

	@Override
	public void mellamo(){
		System.out.println("Me llamo "+getNombre());
	}

	@Override
	public void yojuego(){
		System.out.println("Yo juego "+getDeporte()+"y le voy al Cruz Azul :B");
	}

	@Override
	public void miposicion(){
		System.out.println("Mi posicion es " +getPosicion());
	}
}