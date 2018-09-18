public class Producto
{
	private int precio;
	private String nom;
	static int cont=0;

	public Producto(int precio, String nom)
	{
		this.precio = precio;
		this.nom = nom;
		cont++;
	} 

	public int getPrecio()
	{
		return precio;
	}

	/*public void setPrecio(int precio)
	{
		this.precio = precio;
	}*/

	public String getNom()
	{
		return nom;
	}

	/*public void setNom(String nom)
	{
		this.nom = nom;
	}*/

	public static int getcont()
	{
		return cont;
	}

}