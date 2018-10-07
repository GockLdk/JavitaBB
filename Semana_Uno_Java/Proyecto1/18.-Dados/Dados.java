import java.util.Random;
import java.util.ArrayList;    

import javax.swing.JOptionPane;

/**
*
*@author Anallely_y_Mario 
*@version 03/10/18
*
**/
public class Dados
{
 
 /**
*Main
*Saca la distribucion de n cantidades de tiradas de dados
*por medio del metodo de la Clase DistNorm
*@param args nada
*
**/
	public static void main(String[] args) 
	{
		Random suerte = new	Random();
		ArrayList<Integer> lista = new ArrayList<Integer>();
		ArrayList<Double> list = new ArrayList<Double>();
		DistNorm dis= new DistNorm();
		double disti;
		
		int n= Integer.parseInt (JOptionPane.showInputDialog("Dame las veces que quieres tirar los dado:"));

		for (int i=0;i<n;i++) 
		{
		int dados = 2 + suerte.nextInt(11);
		lista.add(dados);
	
		disti= dis.calculaz(dados);
		list.add(disti);
		}
		JOptionPane.showMessageDialog(null,"Sus resultados son: \n"+lista+"\nLa distribucion es: \n"+list);
	}
}