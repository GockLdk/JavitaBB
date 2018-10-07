/**
*
*@author Anallely_y_Mario
*@version 03/10/18
*
**/

import javax.swing.JOptionPane;

public class Fraccion{
  
  /**
  *Simplifica el denominador y numerador (por separado)
  *@param numerador
  *@param denominador
  **/
  void mostrarFraccionSimplificada(int numerador, int denominador)
  {
    int div=0;
    if((numerador % denominador)==0)
    {
      div=numerador/denominador;
      JOptionPane.showMessageDialog(null,""+div,"Fraccion Simplificada",JOptionPane.INFORMATION_MESSAGE);
    }
    else if((denominador % numerador)==0)
    {
      div=denominador/numerador;
      JOptionPane.showMessageDialog(null,"1/"+div,"Fraccion Simplificada",JOptionPane.INFORMATION_MESSAGE);
    }
    else
      JOptionPane.showMessageDialog(null,""+numerador+"/"+denominador,"Fraccion Simplificada",JOptionPane.INFORMATION_MESSAGE);
    
    
  }

  /**
  *Pide el denominador y numerador de la fraccion
  *Y los envia a la funcion mostrarFraccionSimplificada
  **/
  void ingresaFraccion()
  {
    int numerador=0, denominador=0;
    String cadena;
    numerador =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Numerador : ","Numerador",JOptionPane.INFORMATION_MESSAGE));
    denominador =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Denominador : ","Denominador",JOptionPane.INFORMATION_MESSAGE));
    mostrarFraccionSimplificada(numerador,denominador);
  }

  /**
  *Main
  *con ciclo para reducir fracciones o salir
  *@param args nada
  **/
  public static void main(String[] args)
  {
    String cadena;
    int opcion=0;
    Fraccion fraccional = new Fraccion();

    do 
    {
    opcion= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese 1 para simplificar \nIngrese 0 para salir","Simplificador kawai :3",JOptionPane.INFORMATION_MESSAGE));
    if (opcion!=0)
      fraccional.ingresaFraccion();
    else
      JOptionPane.showMessageDialog(null,"Hasta Luego","Nos vemos guapurita :3",JOptionPane.INFORMATION_MESSAGE);
    }while (opcion!=0);
  }
}
