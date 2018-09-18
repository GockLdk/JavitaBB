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

	public static int getcont()
	{
		return cont;
	}
}