import java.util.Random;
import java.util.*;
public class Principal{
	public static void main(String[] args) {
		int aleatorio, salud;
		boolean red = true, green = true;
		Pokemon thyploshion = new Pokemon();
		Pokemon meganium = new Pokemon();
		Pokemon feraligator = new Pokemon(); 		
		Random rand = new Random(System.nanoTime());

		thyploshion.setFisico(150);
		thyploshion.setEspecial(100);
		thyploshion.setNivel(36);
		thyploshion.setNombre("Thyploshion");
		thyploshion.setPp(3);
		thyploshion.setSalud(2000);

		meganium.setFisico(150);
		meganium.setEspecial(100);
		meganium.setNivel(36);
		meganium.setNombre("Meganium");
		meganium.setPp(3);
		meganium.setSalud(2000);

		feraligator.setFisico(150);
		feraligator.setEspecial(100);
		feraligator.setNivel(36);
		feraligator.setNombre("Feraligator");
		feraligator.setPp(3);
		feraligator.setSalud(2000);

		System.out.println(thyploshion.getNombre()+"Sus PS son: "+thyploshion.getSalud());
		System.out.println(meganium.getNombre()+"Sus PS son: "+meganium.getSalud());
		System.out.println(feraligator.getNombre()+"Sus PS son: "+feraligator.getSalud());



		do{
			aleatorio = rand.nextInt(1);
			if(aleatorio == 0){
				salud = thyploshion.ataque_fisico();
			}
			else{
				salud = thyploshion.ataque_especial();
			}
					System.out.println(thyploshion.getNombre()+"Ha realizado un ataque de: "+salud);
					//meganium.salud;

			if(meganium.getSalud() > 0){
			aleatorio = rand.nextInt(1);
			if(aleatorio == 0){
				salud = meganium.ataque_fisico();
			}
			else{
				salud = meganium.ataque_especial();
			}
					System.out.println(thyploshion.getNombre()+"Ha realizado un ataque de: "+salud);
					//thyploshion.salud;
		}
		if(thyploshion.getSalud() <= 0 &&thyploshion.getSalud() <=0){
			red = false;
		}
		else{
			green = false;
		}

		System.out.println(thyploshion.getNombre()+"Sus PS son: "+thyploshion.getSalud());
		System.out.println(meganium.getNombre()+"Sus PS son: "+meganium.getSalud());
		System.out.println();
		System.out.println();
		//System.in.read();

		}while(red && green);







	}
}