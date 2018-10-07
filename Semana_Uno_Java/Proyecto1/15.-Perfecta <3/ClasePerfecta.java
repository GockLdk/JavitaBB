/**
Clase Generica llamada ClasePerfecta.
*@author Anallely_y_Mario
*@version 05/10/18
*/
public class ClasePerfecta<T> extends Object{
  public int atributo1;
  public T generico;

/**
 * Metodo Generico.
 * @return un Objeto.
**/
  public Object metodoGenerico(){
    return new Object();
  }

/**
*Metodo clone.
*Sobrescritura del metodo clone en object.
*@return un Objeto.
**/
  protected Object clone(){
    return new Object();
  }

/**
*Metodo equals.
*Sobrescritura del metodo equals en object.
*@return un booleano.
*/
  public boolean equals(){
    return true;
  }

/**
*Metodo finalize.
*Sobrescritura del metodo finalize en object.
**/
  protected void finalize(){

  }

  //FIRMA
  //public Class<?> getClass(); --- Nos regresa que tipo de clase es

/**
*Metodo hashCode.
*Sobrescritura del metodo hashCode en object.
*@return un int.
**/
  public int hashCode(){
    return 1;
  }

  //FIRMAS
  //public void notify(); --- Despierta un solo hilo que está esperando en el monitor de ese objeto.
  //public void notifyAll(); --- Despierta todos los hilos que están esperando en el monitor de ese objeto.

/**
*Metodo toString.
*Sobrescritura del metodo toString en object.
*@return un String.
**/
  public String toString(){
    return "Hola";
  }

  //FIRMAS
  //public void wait(); --- Hace que el subproceso actual espere hasta que otro subproceso invoque el método notify () o el método notifyAll () para este objeto.
  //public void wait(long timeout); --- Hace que el subproceso actual espere hasta que otro subproceso invoque el método notify () o el método notifyAll () para este objeto, o que haya transcurrido una cantidad de tiempo especificada.
  //public void wait(long timeout, int nanos) --- Hace que el subproceso actual espere hasta que otro subproceso invoque el método notify () o el método notifyAll () para este objeto, o que otro subproceso interrumpa el subproceso actual, o que haya transcurrido cierta cantidad de tiempo real.
}
