//CLIENTE TIPO ORIENTADO A OBJETO
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.*;
import java.io.*;

public class Cliente{
	private PrintStream ps;  //Atributos
	private Socket algunNombre;
	private BufferedReader entrada = null;
	private String servidorAlQueMeQuieroConectar;
	private int puertoAlQueMeQuieroConectar;
	public String nombre;

	public void setHost(String servidorAlQueMeQuieroConectar){  //Metodos de set
		this.servidorAlQueMeQuieroConectar = servidorAlQueMeQuieroConectar;
	}

	public void setPort(int puertoAlQueMeQuieroConectar){
		this.puertoAlQueMeQuieroConectar = puertoAlQueMeQuieroConectar;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public void conectar() throws IOException{
		algunNombre = new Socket(servidorAlQueMeQuieroConectar,puertoAlQueMeQuieroConectar);
		ps = new PrintStream(algunNombre.getOutputStream());
	}

	public void enviar(String mensaje) throws IOException{
		ps.println(mensaje);
	}
	public String recibir() throws IOException{
		entrada=null;
		entrada = new BufferedReader(new InputStreamReader(algunNombre.getInputStream()));
		String n = entrada.readLine();
		entrada =null;
		return n;
	}

	public void cerrar()throws IOException{
		ps.close();
	}

	public static void main(String[] args) throws IOException{
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		Cliente c = new Cliente();
		System.out.print("Host: ");
		c.setHost(teclado.readLine());
		System.out.print("Puerto: ");
		c.setPort(Integer.parseInt(teclado.readLine()));  //Casteo a entero
		c.conectar();

		String str = "";

		while(!str.equals("adios"))
		{
			System.out.print("Mensaje: ");
			str=teclado.readLine();
			c.enviar(str);
			System.out.println(c.recibir());
		}
		c.cerrar();
	}
}
