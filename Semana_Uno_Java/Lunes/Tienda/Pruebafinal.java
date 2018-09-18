public class Pruebafinal
{
	public static void main(String[] args) 
	{
		int total;

		Tienda t1 = new Tienda(15000,"Mexico");
		Tienda t2 = new Tienda(14000,"Venezuela");
		Tienda t3 = new Tienda(10000,"USA");

		total= t1.getDinero() + t2.getDinero() + t3.getDinero();

		System.out.println("Total del dinero de las tiendas:");
		System.out.println(total);

		System.out.println("Total de tiendas:");
		System.out.println(Tienda.getcont()); 
	}
}