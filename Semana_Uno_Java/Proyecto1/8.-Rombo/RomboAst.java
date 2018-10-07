import java.util.Scanner;

/**
*
*@author Anallely_y_Mario 
*@version 04/10/18
*
**/

public class RomboAst {

    /**
    *Main
    *@param args nada
    **/

    public static void main(String[] args){
    int bandera=0;
    int tfilas;
    char c = 241;
    int tcol;
    int max=4;
    int i=0,j=0,k=0;

        System.out.println("\n\t\t====== VAMOS A DIBUJAR UN ROMBO ======");

        //Solo recibe numeros enteros
        do{
        try{
        Scanner teclado=new Scanner(System.in);
        System.out.print("\n\tDame el tama"+c+"o maximo :B -> ");
        max= teclado.nextInt();
        bandera=0;
        } catch(Exception e){
        System.out.println("\n\tPorfavor ingresa un numero entero :(");
        bandera=1;
        }
        }while(bandera!=0);
        System.out.println("\n");

        /*Si se recibe un numero par, automaticamente se le suma uno para poder 
        dibujar el rombo correctamente*/

        if(max%2==0){
            max++;
        }

        // parte superior del rombo
        for(i=1;i<=max;i=i+2){

            // Se imprimen espacios delante de cada fila
            for(k=max+1;k>=i;k=k-2){
                    System.out.print(" ");
            }

            // Se imprimen asteriscos en los lugares correspondientes

            for(j=0;j<i;j++){
                System.out.print("*");
            }

            System.out.println();

        }

        //parte inferior del rombo

        for(i=max;i>=1;i=i-2){

            // Se imprimen espacios delante de cada fila
            for(k=i;k<=max+2;k=k+2){

                System.out.print(" ");

            }

            // Se imprimen asteriscos en los lugares correspondientes
            for(j=i-2;j>0;j--){

                System.out.print("*");

            }

            System.out.println();

        }

    }

}
