//SERVIDOR TIPO ORIENTADO A OBJETO
import java.io.BufferedReader;
import java.io.*;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.*;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Scanner;


public class Servidor extends Thread
{
	public String nombreCliente;
	private Socket sock;
	private BufferedReader entrada =null;
	private DataOutputStream salida=null;
	public static HashMap<String,String> nombresClientes = new HashMap<String,String>();
	public static String mensajeParatodos;

	public Servidor (Socket s) throws IOException{
		sock = s;
		entrada= new BufferedReader(new InputStreamReader(s.getInputStream()));
		nombreCliente = s.getInetAddress().getCanonicalHostName();  //Da el nombre apartir de su IP
		System.out.println("\nSolicitud de conexion desde: "+ s.getRemoteSocketAddress());
	}

	public String recibir() throws IOException{
		String str = entrada.readLine();
		return str;
		
	}
	public void enviar(String mensaje) throws IOException{
		salida = new DataOutputStream(sock.getOutputStream());
		salida.flush();
		salida.writeUTF(mensaje);
		salida.flush();
		salida.flush();
	}

	public void cerrar() throws IOException
	{
		entrada.close();
	}

	public void text(String mnsj) throws IOException{
		System.out.println("Entraste a text");
		mensajeParatodos = mnsj;
		enviar("Este mensaje lo ven todos?: " + mensajeParatodos);
	}

	public void textTo()throws IOException{
		System.out.println("TEXT");
		enviar("AIUUDAA :(");
	}


	@Override
	public void run() //Metodo define todas las acciones de cad hilo... en este caso de cada cliente
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			String str ;
			System.out.print("\tAgregar cliente (ADD)\n\tDeclinar solicitud (NO ADD)\nOpc: ");
			String respuesta = sc.nextLine();
			str=recibir();
			if(respuesta.equals("ADD")){
				enviar("CONEXION ACEPTADA :) \n");
			while(!str.equals("adios")){
					switch(str){
						case "LIST":
							System.out.println("Lista de usuario");
							System.out.println(nombresClientes);
							String ips =  nombresClientes.toString();
							enviar(ips);
							break;
						case "TEXT":
							text(str);
							break;
						case "NA":
							System.out.println("TEXT_TO");
							textTo();
							break;
					}
						System.out.println(getName() +" dice: " + str);
						enviar(getName() + " :" + str + "\n");
						str = recibir();
				}
			nombresClientes.remove(getName());

			}
			if(respuesta.equals("NO ADD")){
			enviar("CONEXION NO ACEPTADA :( \n");
			nombresClientes.remove(getName());
		}else
		{
			enviar("ERROR EN LA CONEXION :'( \n");
			nombresClientes.remove(getName());
		}
		}catch (IOException ex)
				{
					System.out.println(("Se cerro la conexion con " + getName()));
				}finally
						{
							try{
								cerrar();
								}catch(IOException ex){}
						}
	}

	public static void main(String[] args) throws IOException
	{
		ServerSocket ss = new ServerSocket(9998);
		Map<String,Float> mapaHash= new HashMap<String,Float>();
		System.out.println("Servidor esperando conexiones en el puerto " + ss.getLocalPort());
		Integer id=0;

		while(true)
		{
			id++;
			Socket cliente = ss.accept();  //Cada vez que se conecte alguien se crea un socket para el cliente
			Servidor hilo = new Servidor(cliente);
			String nom = "Cliente " +id.toString();
			hilo.setName(nom);
			hilo.nombresClientes.put(hilo.getName(),cliente.getInetAddress().toString());
			hilo.start();
		}
	}
}
