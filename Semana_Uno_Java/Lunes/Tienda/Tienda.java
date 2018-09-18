public class Tienda
{
	private int dinero;
	private String dir;
	static int cont=0;
	
	public Tienda (int dinero, String dir)
	{
		this.dinero = dinero;
		this.dir = dir;
		cont++;
	}

	public int getDinero()
	{
		return dinero;
	}

	public String getDir()
	{
		return dir;
	}

	public static void tienda (String[] args)
	{
		Producto p1 = new Producto(15,"Doritos");
		Producto p2 = new Producto(10,"Emperador");
		Producto p3 = new Producto(8,"Gansito");
		Producto p4 = new Producto(5,"Duvalin");

		Empleado e1 = new Empleado("Policarpo","Chalan");
		Empleado e2 = new Empleado("Octavio","Gerente");
		Empleado e3 = new Empleado("Jorge","Cajero");
		Empleado e4 = new Empleado("Christian","Tecnico");
	} 




}