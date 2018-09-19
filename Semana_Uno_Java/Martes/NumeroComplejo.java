
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
  public NumeroComplejo multiplicar(NumeroComplejo a, NumeroComplejo b){
    NumeroComplejo multiplicacion = new NumeroComplejo();
    multiplicacion.parte_real =a.parte_real*b.parte_real-a.parte_imaginaria*b.parte_imaginaria;
    multiplicacion.parte_imaginaria = a.parte_real*b.parte_imaginaria+a.parte_imaginaria*b.parte_real;
    return multiplicacion;
  }
  public NumeroComplejo dividir(NumeroComplejo a, NumeroComplejo b){
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
 
  public double ang(NumeroComplejo a)
  {
    double angulo = Math.atan2(a.parte_imaginaria,a.parte_real);  
    if(angulo<0){   
      angulo=2*Math.PI+angulo;
      }
      angulo=angulo*180/Math.PI;

  return angulo;
  }
  
  public void cambiarNumeros(NumeroComplejo a, NumeroComplejo b){
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
    //Calculadora prebeCalculadora = new Calculadora(uno,dos);
    ax=NumeroComplejo.sumar(uno,dos);
    System.out.println(ax.parte_real + " + " + ax.parte_imaginaria);
    System.out.println(NumeroComplejo.restar(uno,dos));

  }
}
