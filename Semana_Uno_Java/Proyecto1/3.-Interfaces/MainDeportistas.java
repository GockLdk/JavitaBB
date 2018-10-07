

/**
*
*@author Anallely_y_Mario 
*@version 03/10/18
*
**/

public class MainDeportistas {

	/**
	*Main
	*@param args nada
	**/

	public static void main(String[] args) {
		System.out.println("\n\t========= INTERFACES =========");
		System.out.println("\t\tEsta es la prueba\n");
		Futbolista gerard = new Futbolista("Gerard Picke","Futbol","Defensa Central");
		Voleibolista samantha = new Voleibolista("Samantha Bricio","Voleibol","Banda");
		Basketbolista lebron = new Basketbolista("LeBron James","Basketbol","Alero");

		
		gerard.mellamo();
		gerard.yojuego();
		gerard.miposicion();
		System.out.println();
		samantha.mellamo();
		samantha.yojuego();
		samantha.miposicion();
		System.out.println();
		lebron.mellamo();
		lebron.yojuego();
		lebron.miposicion();

	}
}