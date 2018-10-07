import java.util.ArrayList;
import java.util.Scanner;

/**
*
*@author Anallely_y_Mario 
*@version 04/10/18
*
**/

public class PrebeMartok{
	String ANSI_CLEAR_SEQ = "\u001b[2J";
	private static ArrayList<String> productos = new ArrayList<String>();
	private static ArrayList<Double> precios = new ArrayList<Double>();

	/**
	*Metodo en donde el usuario ingresa nombre del producto y su precio
	**/

	public void IngresarProductoyPrecio(){
		Scanner teclado=new Scanner(System.in);
		int respuesta=0;

		//se imprime doble vez para efectos de diseno
		System.out.print("\n\tNombre del producto -> ");		
		productos.add(teclado.nextLine());
		System.out.println("");
		System.out.print("\tPrecio del producto -> ");		
		precios.add(teclado.nextDouble());
		System.out.print("\n\tDesea registrar otro producto? [s=1,n=2] -> ");
		respuesta=teclado.nextInt();
		int bandera=0;
		if(respuesta==1){
			while(respuesta!=2){
				String k;
				System.out.print("\n\tNombre del producto -> ");
				k=teclado.nextLine();		
				productos.add(teclado.nextLine());
				System.out.print("\n\tPrecio del producto -> ");		
				precios.add(teclado.nextDouble());
				System.out.print("\n\tDesea registrar otro producto? [s=1,n=2] -> ");
				respuesta=teclado.nextInt();
			}
			bandera++;
			MostrarProductos();
		}
		if(respuesta==2){
			if(bandera==0){
			MostrarProductos();
			}
		}
	}

	/**
	*Metodo en donde se le muestra al usuario el encabezado del ticket
	**/

	public void MostrarProductos(){
		
		System.out.println("\n\tEste es tu ticket de compra actual _");
		System.out.println("\t                                    |");
		System.out.println("\t                                    v \n");
		System.out.println("\n\t\t\t************** PREBE-MART ************** ");
		System.out.println("\t\t\t\tMARIO&ANALLELY SA DE CV");
		System.out.println("\t\t\t       ANEXO DE INGENIERIA T-402\n");
		ListaProductos();
		TotalProductos();
		MenuMostrarProductos();
		}

	/**
	*Metodo en donde se le muestra al usuario la lista de productos ingresados
	**/
	
	public void ListaProductos(){
		System.out.println("\n\t\t\t======================================== ");
		System.out.println("\n\t\t\t  PRODUCTOS \n");
		for (int i=0; i<productos.size(); i++) {
		System.out.print( "\t\t\t\t    "+(i+1)+"- "+productos.get(i)+" -> "+precios.get(i));
		System.out.println(" ");
		}
		System.out.println("\n\t\t\t======================================== ");
	}

	/**
	*Metodo en donde se le muestra al usuario el menu una vez ingresada de lista
	**/

	public void MenuMostrarProductos(){
	
		System.out.println("\n\tQue desea hacer ahora? ");
		Scanner tec=new Scanner(System.in);
		System.out.println("\n\t1. Comprar. \n\t2. Dejar productos.\n\t3. Salir.");
		System.out.print("\n\tElige tu opcion -> ");
		int respuesta1=tec.nextInt();
		switch(respuesta1){
			case 1: 
					ComprarProductos();
					break;
			case 2:
					System.out.println("\n\tEsta es tu lista actual            _");
					System.out.println("\t                                    |");
					System.out.println("\t                                    v \n");
					EliminarProductos();
					break;
			case 3: 
	}
}

	/**
    *Método que muestra el monto total
    *@return total 
    *
    **/
	

	public int TotalProductos(){
		int total=0;
		for(int j=0; j<precios.size();j++){
		total+=precios.get(j);
		}
		System.out.println("\n\t\t\t\t\t\t  TOTAL. $ "+total);
		System.out.println();
	return total;
	}

	/**
    *Método para pasar a pagar
    *@return total1 
    *
    **/

	public int ComprarProductos(){
		Scanner tecla=new Scanner(System.in);
		System.out.println("\n\n\t\t\t************** PREBE-MART ************** ");
		System.out.println("\n\t\t\t  Gracias por elegir PREBE-MART");
		//System.out.println("\n\t\tTe recordamos que tu total es de: ");
		int total2=TotalProductos();
		//System.out.println("\n\t\tTe recordamos que tu total es de: "+total2);
		System.out.print("\n\n\tCon cuanto dinero cuentas? ");
		double dinero=tecla.nextDouble();
		int total1=TotalProductos();
		if(total1<=dinero){
			System.out.println("\n\t\tGracias por tu compra");
			System.out.println("\n\t\tVuelve pronto");
		}else{
			System.out.println("\n\tNo se cuenta con fondos suficientes");
			EliminarProductos();
		}
		return total1;
	}

	/**
	*Metodo en donde el usuario elimina productos para alcanzar de dinero
	**/

	public void EliminarProductos(){
		ListaProductos();
		int respel=0;
			if(productos.size()>0){
			while(respel!=2){
				if(productos.size()>0){
				Scanner harta=new Scanner(System.in);
				Scanner esece=new Scanner(System.in);
				System.out.print("\n\tQue producto te gustaria eliminar?");
				int respeliminar= esece.nextInt();
				int respelim=respeliminar-1;
				PrebeMartok.productos.remove(respelim);
				PrebeMartok.precios.remove(respelim);

				System.out.println("\n\tEsta es tu lista actual            _");
				System.out.println("\t                                    |");
				System.out.println("\t                                    v \n");
				ListaProductos();
				TotalProductos();
				System.out.print("\n\tQuieres eliminar otro? [s=1/n=2] -> ");
				respel=harta.nextInt();
				}else{
					System.out.println("\n\tYa no puedes eliminar mas :(");
					respel=2;
				}
			}
			}
		System.out.println("\n\tEsta es tu nueva lista            _");
		System.out.println("\t                                    |");
		System.out.println("\t                                    v \n");
		ListaProductos();
		TotalProductos();
	}

	 /**
	*Main
	*@param args nada
	**/

	public static void main(String[] args) {
		PrebeMartok iniciarPrebeMartok = new PrebeMartok();
		int res=0;
		do{
		System.out.println("\n\t\t\t************** PREBE-MART ************** ");
		System.out.println();
		System.out.println("\n\tEn que te podemos ayudar?");
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\t1. Agregar productos. \n\t2.Mostrar lista de productos. \n\t3.Eliminar productos de la lista. \n\t4.Pagar\n\t5.Salir");
		System.out.print("\n\tElige tu opcion -> ");
		res= sc.nextInt();
		switch(res){
			
			case 1: 
					iniciarPrebeMartok.IngresarProductoyPrecio();
					break;
			case 2: 
					iniciarPrebeMartok.MostrarProductos();
					break;		
			case 3:
					System.out.println("\n\tEsta es tu lista actual            _");
					System.out.println("\t                                    |");
					System.out.println("\t                                    v \n");
					iniciarPrebeMartok.EliminarProductos();
					break;
			case 4: 
					iniciarPrebeMartok.ComprarProductos();
					break;	
			case 5: 
					System.out.println("\n\t\t\t************** PREBE-MART ************** ");
					System.out.println("\n\n\t\t\t\tGracias por tu preferencia");
					break;

			default:
					System.out.println("\n\tOpcion incorrecta");

		}
		}while(res!=5);
	}
}

