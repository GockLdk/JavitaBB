/**
*Clase para sacar la distribucion normal
*@author Anallely_y_Mario 
*@version 03/10/18
*
**/

class DistNorm {

 	public DistNorm(){			}

 	/**
	*
	*Metodo para sacar la distribucion 
	*@param v Valor de cual se quiere su distribucion
	*
	**/
	public double calculaz(double v){ //funcion de densidad de probabilidad normal

		double N=Math.exp(-Math.pow(v, 2)/2)/Math.sqrt(2*Math.PI);

		return N;

	}
}