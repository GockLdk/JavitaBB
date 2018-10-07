/**
*
*@author Anallely_y_Mario 
*@version 03/10/18
*
**/

public class Persona
{
	/**
	* Atributos
	**/
	private String nombre;
	private int telefono;
	private Mascota mascota;

	/**
	*Constructor sin Argumentos
	**/
	public Persona()
	{
		this.nombre="";
		this.telefono=0;
	}

	/**
	*Constructors
	*@param nombre nombre de la persona
	*@param telefono telefono de la persona
	*@param mascota nombre de la mascota
	**/
	public Persona(String nombre,int telefono, Mascota mascota)
	{
		this.nombre = nombre;
		this.telefono = telefono;
		this.mascota = mascota;
	}

	/**
	*Devuelve el nombre
	*@return nombre
	**/
	public String getNombre()
	{
		return this.nombre;
	}

	/**
	*Devuelve el telefono (por si se implementaba busqueda por telefono)
	*@return telefono
	**/
	public int getTelefono()
	{
		return this.telefono;
	}

	/**
	*Devuelve la mascota (por si se implementaba busqueda por mascota)
	*@return mascota
	**/
	public Mascota getMascota()
	{
		return this.mascota;
	}

	/**
	*Sobreescribe el metodo toString para devolver todos los datos de una persona
	*@return informacion completa de la persona
	**/
	public String toString()
	{
		return "Nombre: "+this.nombre+"\nTelefono: "+this.telefono+"\nMascota: "+this.mascota;
	}
}