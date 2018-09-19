
public class NumeroComplejo
{
  private double parte_real;
  private double parte_imaginaria;

  NumeroComplejo(){}

  public NumeroComplejo(double real, double imag){
     this.parte_real=real;
     this.parte_imaginaria=imag;
  }

  public double modulo(){
    return Math.sqrt(parte_real*parte_real+parte_imaginaria*parte_imaginaria);
  }

  public static NumeroComplejo sumar(NumeroComplejo a, NumeroComplejo b){
    NumeroComplejo suma = new NumeroComplejo();
    suma.parte_real = a.parte_real + b.parte_real;
    suma.parte_imaginaria = a.parte_imaginaria + b.parte_imaginaria;
    return suma;
  }
  public static NumeroComplejo restar(NumeroComplejo a, NumeroComplejo b){
    NumeroComplejo resta = new NumeroComplejo();
    resta.parte_real = a.parte_real - b.parte_real;
    resta.parte_imaginaria = a.parte_imaginaria - b.parte_imaginaria;
    return resta;
  }
  public static NumeroComplejo multiplicar(NumeroComplejo a, NumeroComplejo b){
    NumeroComplejo multiplicacion = new NumeroComplejo();
    multiplicacion.parte_real =a.parte_real*b.parte_real-a.parte_imaginaria*b.parte_imaginaria;
    multiplicacion.parte_imaginaria = a.parte_real*b.parte_imaginaria+a.parte_imaginaria*b.parte_real;
    return multiplicacion;
  }
  public static NumeroComplejo dividir(NumeroComplejo a, NumeroComplejo b){
    NumeroComplejo division = new NumeroComplejo();
    double aux;
     if(b.modulo()==0.0)
     {
          System.out.println("Division entre cero no existe");
     }
     else
     {
          aux=b.parte_real*b.parte_real+b.parte_imaginaria*b.parte_imaginaria;
          division.parte_real=(a.parte_real*b.parte_real+a.parte_imaginaria*b.parte_imaginaria)/aux;
          division.parte_imaginaria=(a.parte_imaginaria*b.parte_real-a.parte_real*b.parte_imaginaria)/aux;
     }
    return division;
  }
 
  public static double ang(NumeroComplejo a)
  {
    double angulo = Math.atan2(a.parte_imaginaria,a.parte_real);  
    if(angulo<0){   
      angulo=2*Math.PI+angulo;
      }
      angulo=angulo*180/Math.PI;

  return angulo;
  }
  
  public static double magnitud(NumeroComplejo a)
  {
    double mag=Math.sqrt(Math.pow(a.parte_real,2)+Math.pow(a.parte_imaginaria,2));
    return mag;
  }

  public static void cambiarNumeros(NumeroComplejo a, NumeroComplejo b){
    NumeroComplejo aux = new NumeroComplejo();
    aux.parte_real = a.parte_real;
    a.parte_real = b.parte_real;
    b.parte_real = aux.parte_real;
    aux.parte_imaginaria = a.parte_imaginaria;
    a.parte_imaginaria = b.parte_imaginaria;
    b.parte_imaginaria = aux.parte_imaginaria;
  }



  public static void main(String[] args) 
  {
    NumeroComplejo uno = new NumeroComplejo(1,3);
    NumeroComplejo dos = new NumeroComplejo(5,8);
    NumeroComplejo ax = new NumeroComplejo();
    
    System.out.println("Numero uno: 1+3i");
    System.out.println("Numero dos: 5+8i");
    ax=NumeroComplejo.sumar(uno,dos);
    System.out.println("La suma es " +ax.parte_real + " + " + ax.parte_imaginaria+"i");
    ax = NumeroComplejo.restar(uno,dos);
    System.out.println("La resta es " + ax.parte_real  + ax.parte_imaginaria+"i");
    ax = NumeroComplejo.multiplicar(uno,dos);
    System.out.println("La multiplicacion es " + ax.parte_real + " + " + ax.parte_imaginaria+"i");
    ax = NumeroComplejo.dividir(uno,dos);
    System.out.println("La division es " + ax.parte_real + " + " + ax.parte_imaginaria+"i");
    System.out.println("El angulo de 1+3i es: "+NumeroComplejo.ang(uno)+"°");
    System.out.println("El angulo de 5+8i es: "+NumeroComplejo.ang(dos)+"°");
    System.out.println("La magnitud del numero uno es: "+(int)NumeroComplejo.magnitud(uno));
    System.out.println("La magnitud del numero dos es: "+(int)NumeroComplejo.magnitud(dos));
    NumeroComplejo.cambiarNumeros(uno,dos);
    System.out.println("Ahora uno es: " +uno.parte_real + " + " + uno.parte_imaginaria+"i");
    System.out.println("Ahora dos es: " +dos.parte_real + " + " + dos.parte_imaginaria+"i");
  }
}
