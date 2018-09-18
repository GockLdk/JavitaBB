public class Pruebatienda2
{
	public static void main(String[] args)
	{
		Tienda t1 = new Tienda(14000,"Venezuela");
		Producto p1 = new Producto(17,"Doritos");
		Producto p2 = new Producto(11,"Emperador");
		Producto p3 = new Producto(5,"Gansito");
		Producto p4 = new Producto(4,"Duvalin");
		Empleado e1 = new Empleado(100,"Enrique","Chalan");
		Empleado e2 = new Empleado(1000,"Karina","Gerente");
		Empleado e3 = new Empleado(500,"Paola","Cajero");
		Empleado e4 = new Empleado(850,"Edivaldo","Tecnico");

		System.out.println("Info tienda 2:");
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