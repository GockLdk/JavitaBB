import java.util.Random;

public class Pokemon{
	private int salud, fisico, especial, pp, nivel;
	private String nombre;
	private Random rand = new Random(System.nanoTime());
	//Set and get
	public void setSalud(int salud){
		this.salud = salud;
	}
	public int getSalud(){
		return salud;
	}
		public void setFisico(int fisico){
		this.fisico = fisico;
	}
	public int getFisico(){
		return fisico;
	}
		public void setEspecial(int especial){
		this.especial = especial;
	}
	public int getEspecial(){
		return especial;
	}
		public void setPp(int pp){
		this.pp = pp;
	}
	public int getPp(){
		return pp;
	}
		public void setNivel(int nivel){
		this.nivel = nivel;
	}
	public int getNivel(){
		return nivel;
	}
	//Ataques

	public int ataque_fisico(){
		int aleatorio = rand.nextInt(2);
		return nivel * fisico * aleatorio;
	}
	public int ataque_especial(){
		if(pp > 0){
			pp -= 1;
			return nivel * especial;
		}
		else{
			return 0;

		}
	}
	public void danio(int salud){
		this.salud -= salud;
	}











}