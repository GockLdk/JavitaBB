import java.util.Scanner;
import java.util.ArrayList;

/**
*
*@author Anallely_y_Mario 
*@version 06/10/18
*
**/


public class Binario{
	ArrayList<Integer> numauxdeunos = new ArrayList<Integer>();
	ArrayList<Integer> num = new ArrayList<Integer>();
	ArrayList<String> bin = new ArrayList<String>();


/**
*
*Metodo para contar unos
*@return Un entero 
*/
	public static Integer numauxDeUnos(String palabra){
		int cont1 = 0;
		int cont = 0;
		String uno = "1";
		while (cont < palabra.length()) {
			if (palabra.charAt(cont) == uno.charAt(0)){
				cont1++;
			}
			cont++;
		}
		return cont1;
	}

/**
*EL metodo para saber maximo de valores
*@return 
*/
	public static Integer Maximo(ArrayList<Integer> arraylist){
		int max= 0;
        for (int i = 0; i < arraylist.size(); i++) {
            if (arraylist.get(i) > max) {
                max= arraylist.get(i);
            }
        }
        return max;
	}

	/**
	*Main
	*@param args nada
	**/

	public static void main(String[] args) {
		Boolean salida = true;
		Binario pruebaBinario = new Binario();
		System.out.println("De que tamano quieres tu arreglo?");
		Scanner sc = new Scanner(System.in);
		int numaux =1;
		int longitud = sc.nextInt();
		while (numaux < longitud) {
			System.out.println("Dame el numero -> "+numaux);
			pruebaBinario.num.add(sc.nextInt());
			numaux++;
		}

		for (Integer i : pruebaBinario.num) {
			pruebaBinario.bin.add(Integer.toBinaryString(i));
		}

		int help= 0;
		while(help< pruebaBinario.bin.size()){
			pruebaBinario.numauxdeunos.add(numauxDeUnos(pruebaBinario.bin.get(help)));
			help++;
		}
		
		help= Maximo(pruebaBinario.numauxdeunos);

		System.out.println("Tus numeros en binario son: ");
		System.out.println(pruebaBinario.bin);

		int auxiliar = 1;

		while (auxiliar<=help) {
			System.out.println("numeros en binario  con la siguiente cantidad de unos: "+auxiliar);
			for (int i = 0; i<pruebaBinario.bin.size();i++) {
				if (pruebaBinario.numauxdeunos.get(i) == auxiliar) {
					System.out.print(": ");
					System.out.println(pruebaBinario.bin.get(i));	
				}
			}
			System.out.println("\n");
			auxiliar++;
		}
	}
}