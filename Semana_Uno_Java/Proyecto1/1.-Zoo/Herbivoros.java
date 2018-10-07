

/**
*
*@author Anallely_y_Mario 
*@version 04/10/18
*
**/

public class Herbivoros implements Animales{
  String comidaFavorita;
  String tipodeAnimal;

/**
*Metodo constructor de la clase 'Herbivoross'
*@param tipodeAnimal nombre del animal
*@param comidaFavorita comida del animal
*/
  public Herbivoros(String tipodeAnimal, String comidaFavorita){
    this.tipodeAnimal = tipodeAnimal;
    this.comidaFavorita = comidaFavorita;
  }

/**
*Metodo comer
*/
  public void comer(){}

/**
*Metodo comer.
@param animal1 recibe un animal
*/
  public void comer(Animales animal1){
    System.out.println("Yo solo como pasto :B");
  }

/**
*Metodo jugar de la clase 'Herbivoros'
*/
  public void jugar(){
    System.out.println("\n\tSoy Herviboro y me gusta correr, saltar y comer pasto :B");
  }
}