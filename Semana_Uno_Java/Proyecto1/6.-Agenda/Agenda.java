import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
*
*@author Anallely_y_Mario 
*@version 03/10/18
*
**/

public class Agenda
{	
	/**
	*Main
	*@param args nada
	**/
	public static void main(String[] args) 
	{
		ArrayList<Persona> agenda = new ArrayList<Persona>(); //Lista
		int opc =0;
		String nom ="";
		Mascota m;

		while(opc!=6) //Menu ciclico
		{
		opc= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese:\n1.-Para agregar contacto\n2.-Para borrar un contacto\n3.-Buscar\n4.-Borrar Agenda\n5.-Ver Agenda\n6.-Salir","Menu",JOptionPane.INFORMATION_MESSAGE));
		switch(opc)
		{
			case 1: //Opcion de agregar contacto
			String nombre = JOptionPane.showInputDialog(null,"Dame el nombre del Contacto:","Contacto",JOptionPane.PLAIN_MESSAGE);
			int tel = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame el telefono del Contacto:","Telefono",JOptionPane.PLAIN_MESSAGE));
			int mAs = Integer.parseInt(JOptionPane.showInputDialog(null,"Tu contacto tiene mascota?\n0.-No\n1.-Si","Mascota",JOptionPane.PLAIN_MESSAGE));
			if(mAs!=0)
			{
				String mas = JOptionPane.showInputDialog(null,"Dame el nombre de la mascota del Contacto:","Mascota",JOptionPane.PLAIN_MESSAGE);
				 m=new Mascota(mas);
			}else{
				 m = new Mascota();
			}
			Persona p = new Persona(nombre,tel,m);

			agenda.add(p);
			break;
			case 2: //Opcion de borrar contacto 
		    nom = JOptionPane.showInputDialog(null,"Dame el nombre del contacto a borrar:","Busqueda",JOptionPane.PLAIN_MESSAGE);
			for (int i = 0; i < agenda.size(); i++) {
			 if(agenda.get(i).getNombre().equals(nom)){
			 JOptionPane.showMessageDialog(null,agenda.get(i).toString(),"Contacto Eliminado",JOptionPane.WARNING_MESSAGE);
			 agenda.remove(i);
			 }
			 }
			break;
			case 3: //Opcion de buscar contacto
			nom = JOptionPane.showInputDialog(null,"Dame el nombre del contacto a buscar:","Busqueda",JOptionPane.PLAIN_MESSAGE);
			for (int i = 0; i < agenda.size(); i++) {
			 if(agenda.get(i).getNombre().equals(nom)){
			 JOptionPane.showMessageDialog(null,agenda.get(i).toString(),"Contacto Encontrado",JOptionPane.PLAIN_MESSAGE);
			 }
			 }
			break;
			case 4: //Opcion de borrar agenda
			agenda.clear();
			JOptionPane.showMessageDialog(null,"Agenda totalmente borrada","Limpieza",JOptionPane.WARNING_MESSAGE); 
			break;
			case 5:
			for (int i = 0; i < agenda.size(); i++) 
			{
			 JOptionPane.showMessageDialog(null,agenda.get(i).toString(),"Contacto "+i,JOptionPane.PLAIN_MESSAGE);
			}
			//MOSTRAR TODA LA AGENDA EN PANTALLA
			/*for(int i=0;i<agenda.size();i++)
			{
				System.out.println("\n"+agenda.get(i).toString());
			}*/
			break;
			case 6: //Opcion para salir
			JOptionPane.showMessageDialog(null,"Nos vemos pronto :)","ADIOS",JOptionPane.PLAIN_MESSAGE); 
			break;
			default: //Opcion por si no se eligio una opcion valida
			JOptionPane.showMessageDialog(null,"Opcion Invalida :(","Lo arruinaste :(",JOptionPane.WARNING_MESSAGE); 
			break;
		}
		}
		//INICIO DE TODO :')
		/*
		String nombre = JOptionPane.showInputDialog(null,"Dame el nombre de la Persona:","Persona",JOptionPane.PLAIN_MESSAGE);
		int tel = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame el telefono de la Persona:","Telefono",JOptionPane.PLAIN_MESSAGE));
		String mas = JOptionPane.showInputDialog(null,"Dame el nombre de la mascota de la Persona:","Mascota",JOptionPane.PLAIN_MESSAGE);
		Mascota m = new Mascota(mas);
		Persona p = new Persona(nombre,tel,m);
		
		JOptionPane.showMessageDialog(null,p.toString(),"Contacto",JOptionPane.PLAIN_MESSAGE);
		*/
	}
}