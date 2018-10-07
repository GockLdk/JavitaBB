/**
*Probamos la ClasePerfecta.
*@author Anallely_y_Mario
*@version 05/10/18
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Testeo{
	/**
	*Main 
	*@param args nada
	**/
  public static void main(String[] args) {
  	/**
	*Instanciamos un objeto de ClasePerfecta
	**/
    ClasePerfecta<Object> perfectaComoMayito = new ClasePerfecta<Object>(); 
    /**
	*Probamos sus metodos
	**/
    perfectaComoMayito.metodoGenerico();
    perfectaComoMayito.clone();
    perfectaComoMayito.equals();
    perfectaComoMayito.finalize();
    perfectaComoMayito.hashCode();
    perfectaComoMayito.toString();

    /**
	*Creamos una lista de tipo ClasePerfecta
	**/
    ArrayList<ClasePerfecta> arreglo = new ArrayList<ClasePerfecta>();

    /**
	*Agregamos 5 objetos a la lista de ClasePerfecta 
	**/
    int tamanio = arreglo.size();
    //System.out.println(tamanio); Se imprime el tamaño de la lista
    for(int i=0;i<5;i++){
      arreglo.add(new ClasePerfecta());
    }
    tamanio = arreglo.size();
    //System.out.println(tamanio); Se imprime el tamaño de la lista

    /**
	*Modificamos el atributo1 de cada elemento de la lista
	**/
    arreglo.get(0).atributo1 = 5;
    arreglo.get(1).atributo1 = 6;
    arreglo.get(2).atributo1 = 8;
    arreglo.get(3).atributo1 = 1;
    arreglo.get(4).atributo1 = 5;

    /**
	*Creamos un arreglo de enteros
	**/
    int [] enteros = new int[tamanio];

    /**
	*Guardamos en el arreglo el valor de atributo1 de cada elemento de la lista
	**/
    int i = 0;
    for (ClasePerfecta a: arreglo) {
      enteros[i] = a.atributo1;
      i++;
    }

    /**
	*Se imprime el arreglo para comprobar que se guardaron
	**/
    for (int b = 0;b<5;b++) {
      System.out.print(enteros[b]+",");
    }
    System.out.println("");
    /**
	*Se ordena el arreglo
	**/
    Arrays.sort(enteros);
    /**
	*Se imprime el arreglo para comprobar que se ordeno
	**/
    for (int b = 0;b<5;b++) {
      System.out.print(enteros[b]+",");
    }
    System.out.println("");

    /**
	*Se cre una lista de tipo ClasePerfecta secundaria
	**/
    ArrayList<ClasePerfecta> arreglo2 = new ArrayList<ClasePerfecta>();

    /**
	*Vamos comparando los atributos1 de cada elemento con los
	*del arreglo y si coinciden se guarda el objeto en la lista secundaria 
	*y se elimina de la principal, asi se creara una lista de objetos ordenada.
	**/
    for (int m = 0;m<5;m++){
      for (int j = 0;j<arreglo.size();j++){
        if(arreglo.get(j).atributo1 == enteros[m]){
          arreglo2.add(arreglo.get(j));
          arreglo.remove(j);
        }
      }
    }

    /**
	*Se imprime los atributos1 de la lista secundaria para comprobar que se guardaron en orden
	**/
    System.out.println("");
    System.out.println("Lista Ordenada:");
    for (ClasePerfecta a : arreglo2) {
      System.out.print(a.atributo1 + ",");
    }
    System.out.println("");
  }
}
