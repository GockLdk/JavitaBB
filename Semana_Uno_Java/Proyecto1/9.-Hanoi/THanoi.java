

/**
*
*@author Anallely_y_Mario 
*@version 06/10/18
*
**/

public class THanoi
{

	/**
	*Main
	*@param args nada
	**/


    public static void main(String[]args)
    {
     java.util.Scanner leer = new java.util.Scanner(System.in);
     int movimientos;
     System.out.println("\n\t============= TORRES DE HANOI =============");
     System.out.print("\n\tNumero de discos: ");
     int n=leer.nextInt();
     movimientos = torres.mover(n, 'A', 'B', 'C');
     System.out.println("\n\tMovimientos efectuados: "+movimientos);
    }
 }  
   
