import java.util.ArrayList;

/**
*
*@author Anallely_y_Mario 
*@version 04/10/18
*
**/

public class MainAnimales{
	/**
	*Main
	*@param args nada
	**/
  public static void main(String[] args) {
    ArrayList <Animales> prebezoo = new ArrayList<Animales>();
    //anadimos pruebas
    prebezoo.add(new Carnivoros("Puma","conejos"));
    prebezoo.add(new Herbivoros("Jirafa","hojas de arbol"));
    prebezoo.get(0).jugar();
    prebezoo.get(1).jugar();
    Carnivoros leon = (Carnivoros) prebezoo.get(0);
    leon.comer(prebezoo.get(0));
  }
}
