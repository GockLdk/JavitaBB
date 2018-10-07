

/**
*
*@author Anallely_y_Mario 
*@version 04/10/18
*
**/


public class Carnivoros implements Animales{
  String comidaFavorita;
  String tipodeAnimal;


/**
*Metodo constructor de la clase 'Carnivoros'
*@param tipodeAnimal nombre del animal
*@param comidaFavorita comida del animal
*/

public Carnivoros(String tipodeAnimal, String comidaFavorita){
    this.tipodeAnimal = tipodeAnimal;
    this.comidaFavorita = comidaFavorita;
  }
  
/**
*Metodo comer
*/

public void comer(){}

/**
*Metodo comer
*@param animal1 recibe un animal
*/

  public void comer(Animales animal1){
    if (animal1.getClass() == Carnivoros.class) {
      Carnivoros algunAnimal = (Carnivoros) animal1;
      System.out.println("\n\tSoy carnivoro y me estoy comiendo un rico " + algunAnimal.tipodeAnimal + "\n\tYummy :B");
    }else{
      Carnivoros algunAnimal = (Carnivoros) animal1;
      System.out.println("\n\tSoy carnivoro y me estoy comiendo un rico " + algunAnimal.tipodeAnimal + "\n\tYummy :B");
    }
  }

/**
*Metodo jugar
*/

  public void jugar(){
    System.out.println("\n\tSoy carnivoro y me gusta jugar, correr y saltar ");
  }
}