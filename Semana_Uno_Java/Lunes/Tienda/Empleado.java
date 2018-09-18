public class Empleado
{
	private int salario;
	private String nom;
	private String puesto;
	static int cont=0;

	public Empleado(int salario, String nom, String puesto)
	{
		this.nom = nom;
		this.puesto = puesto;
		this.salario = salario;
		cont++;
	}

	public int getSalario()
	{
		return salario;
	}

	/*public void setSalario(int salario)
	{
		this.salario = salario;
	}*/

	public String getNom()
	{
		return nom;
	}

	/*public void setNom(String nom)
	{
		this.nom = nom;
	}*/

	public String getPuesto()
	{
		return puesto;
	}

	/*public void setPuesto(String puesto)
	{
		this.puesto = puesto;
	}*/

	public static int getcont()
	{
		return cont;
	}

}