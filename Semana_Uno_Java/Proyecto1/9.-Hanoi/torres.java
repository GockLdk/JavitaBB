

/**
*
*@author Anallely_y_Mario 
*@version 06/10/18
*
**/


public class torres{
private static int movimientos=0;

    /**
    *Metodo para mover discos de una torre a otra
    *@param n numero
    *@param a torre a
    *@param b torre b
    *@param c torre c
    *
    *@return movimientos
    **/

        public static int mover(int n, char a,char b, char c){
                if(n>0){
                        mover(n-1, a,c,b);
                        System.out.println("mover disco "+a+" a "+c);
                        movimientos++;
                        mover(n-1,b,a,c);
                 }
            return movimientos;
         }
}