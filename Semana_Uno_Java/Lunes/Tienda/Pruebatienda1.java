public class Pruebatienda1
{
	public static void main(String[] args)
	{
		Tienda t1 = new Tienda(15000,"Mexico");
		Producto p1 = new Producto(15,"Doritos");
		Producto p2 = new Producto(10,"Emperador");
		Producto p3 = new Producto(8,"Gansito");
		Producto p4 = new Producto(5,"Duvalin");
		Empleado e1 = new Empleado(100,"Policarpo","Chalan");
		Empleado e2 = new Empleado(1000,"Octavio","Gerente");
		Empleado e3 = new Empleado(500,"Jorge","Cajero");
		Empleado e4 = new Empleado(850,"Christian","Tecnico");
	 
		System.out.println("Info tienda 1:");
		System.out.println("Direccion:");
		System.out.println(t1.getDir());
		System.out.println("Dinero:");
		System.out.println(t1.getDinero());
		System.out.println("");
		System.out.println("Empleados:");
		System.out.println(e1.getNom());
		System.out.println("Ocupacion:");
		System.out.println(e1.getPuesto());
		System.out.println("Salario:");
		System.out.println(e1.getSalario());
		System.out.println("");
		System.out.println(e2.getNom());
		System.out.println("Ocupacion:");
		System.out.println(e2.getPuesto());
		System.out.println("Salario:");
		System.out.println(e2.getSalario());
		System.out.println("");
		System.out.println(e3.getNom());
		System.out.println("Ocupacion:");
		System.out.println(e3.getPuesto());
		System.out.println("Salario:");
		System.out.println(e3.getSalario());
		System.out.println("");
		System.out.println(e4.getNom());
		System.out.println("Ocupacion:");
		System.out.println(e4.getPuesto());
		System.out.println("Salario:");
		System.out.println(e4.getSalario());

		System.out.println("");
		System.out.println("Productos:");
		System.out.println(p1.getNom());
		System.out.println(p1.getPrecio());
		System.out.println("");
		System.out.println(p2.getNom());
		System.out.println(p2.getPrecio());
		System.out.println("");
		System.out.println(p3.getNom());
		System.out.println(p3.getPrecio());
		System.out.println("");
		System.out.println(p4.getNom());
		System.out.println(p4.getPrecio());


	}

}