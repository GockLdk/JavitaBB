import java.util.Scanner;

/**
*
*@author Anallely_y_Mario 
*@version 30/09/18
*
**/


public class BloquesAgua{

	/**
	*Main
	*@param args nada
	**/
	
	public static void main(String[] args){
	int total=0;
	char b = 182;
	char c = 61;

	//Pedimos los datos
	Scanner teclado=new Scanner(System.in);
	System.out.print("\n\tDe que altura maxima quieres el mapa?: ");
	int altura= teclado.nextInt();
	System.out.print("\n\tLos datos de tu arreglo podran ir de 0 a " +altura+ "\n");

	System.out.print("\n\tDe que longitud?: ");
	int longitud= teclado.nextInt();

	//Declaramos arreglo con datos introducidos por el usuario
	char[][] arr=new char[altura][longitud]; 

	//Declaramos arreglo auxiliar
	int[]datos= new int [longitud];

	//Pedimos al usuario que ingrese las alturas deseadas en el mapa y guardamos en arreglo auxiliar
	System.out.print("\n\tIngresa la altura en la posicion: \n" );
 
	for(int i=0; i<longitud; i++){
		int j=i+1;
		System.out.print("\n\t " +j+ ": ");
		datos[i] = teclado.nextInt();
	
	//restriccion para que no acepte altura mayor a la establecida inicialmente
		do{
		if (datos[i]>altura){
			System.out.println("\n\tNo puedes introducir valores mayores a: " +altura+ " intenta otravez");
			System.out.print("\n\t " +j+ ": ");
			datos[i]=0;
			datos[i] = teclado.nextInt();
		} 
		}while(datos[i]>altura);
	}

	//Llenamos espacios en el arreglo donde hay bloques de metal
	for(int s=0;s<longitud;s++){
		for(int r=0;r<altura;r++){
			if(datos[s]<altura-r){
			arr[r][s]=' ';
			}
			else{
			arr[r][s]=b;
			}
		}
	}
	System.out.println("\n\t");
	

	//Iteradores para reconocer donde podemos poner los bloques de agua
	
	//Recorremos columnas
	for(int t=1; t<longitud; t++){ 
		//Recorremos filas
		for(int u=0;u<altura;u++){ 

			//Si nos encontramos en la primera columna del arreglo no acciona
			if(t!=1){ 

				//Al momento de toparnos con un bloque de metal rastrea para atras
				if(arr[u][t]==b){ 
					
					int bandera=0;
					for(int g=t-1;g>=0;g--){
					
						if(bandera==0){
							if(arr[u][g]==b){
								for(int f=g+1; f<t;f++){
								
								arr[u][f]=c;
								total++;
								}
							bandera=bandera+1;
							}
						}
					}
				}
			}
		}
	}

System.out.print("\t^");

//Imprimimos arreglo ya graficado

	for(int k=0;k<altura;k++){
		System.out.print("\n\t|");
		for(int m=0;m<longitud;m++){
			if(m==0){
					System.out.print("   "+arr[k][m]+" ");
			} else{
			System.out.print(arr[k][m]+" ");
		}
	}
	System.out.print("\n");
	}
	System.out.println("\t--------------------------->");
	if(total==1){
		System.out.println("\n\tUsted puede almacenar: "+total+" bloque de agua");
	}else{
	System.out.println("\n\tUsted puede almacenar: "+total+" bloques de agua");
	}
	System.out.println("\n\tBloques de metal: "+b);
	System.out.println("\tBloques de agua: "+c+"\n");
}
}

