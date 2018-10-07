import javax.swing.JOptionPane;

/**
*
*@author Anallely_y_Mario 
*@version 02/10/18
*
**/

public class Determinante {

    /**
    *@param x recibe entero
    *@return un 1 o -1 
    **/
     private static int sgn (int x) {
        if (x%2==0) return(1);
        else return(-1);            
    }

    /**
    * Creo una matriz auxiliar para sacar el determinante
    * @param matrix matriz
    * @param matrix_aux matriz auxiliar
    * @param dim dimension de la matriz
    * @param m posicion m
    * @param n posicion n
    *@return regresa la dimension decrementada 
    **/
    private static int matrix_adj (int matrix[][], int matrix_aux[][], int dim, int m, int n) {
        int i, j, p, q;
        for (j=0, q=0; j<dim; j++)
            if (j!=n) {
                for (i=0, p=0; i<dim; i++)
                    if (i!=m) {
                        matrix_aux[p][q]=matrix[i][j];
                        p++;
                    }
                q++;                
            }
        return(dim-1);
    }

    /**
    * Saca el determinate de la matriz
    * @param matrix matriz
    * @param dim dimension
    * @return el determinante
    **/
    private static int det_matrix_N (int matrix[][], int dim) {
        int i, j, dim_aux, det;
        for (i=0, j=0, det=0, dim_aux=dim; i<dim; i++) {
            det+=sgn(i+j)*matrix[i][j]*det_matrix_adj(matrix,dim_aux,i,j);
        }        
        return(det);
    }

    /**
    * Hace matrices mas pequeñas para sacar su determinante individualmente
    * @param matrix_aux matriz auxiliar
    * @param dim dimension de la matriz
    * @param m posicion m
    * @param n posicion n
    *@return el determinante 
    **/
    private static int det_matrix_adj (int matrix[][], int dim, int m, int n) {
        int matrix_aux[][]=new int[dim][dim];
        if ( (matrix_adj(matrix,matrix_aux,dim,m,n))==1 )
            return(matrix_aux[0][0]);
        return(det_matrix_N(matrix_aux,dim-1));
    } 

    /**
    *@param args recibe nada
    **/       
    public static void main (String args[]) {
    int i, j, dim, det;

         //Lee matriz
        dim = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame el tamaño de tu matriz cuadrada","Matriz nxn",JOptionPane.INFORMATION_MESSAGE));
        int matrix[][]=new int[dim][dim];
        for (i=0; i<dim; i++) {
            for (j=0; j<dim; j++) { 
                matrix[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"Valor en la posicion "+"["+i+"]"+"["+j+"]","Matriz",JOptionPane.INFORMATION_MESSAGE));                                             
            }                        
        }
         //Calcular determinante
        if (dim==1)
            System.out.print(matrix[0][0]);
        else
            JOptionPane.showMessageDialog(null,"El determinante es: "+det_matrix_N(matrix,dim),"Determinante",JOptionPane.INFORMATION_MESSAGE);
    }
    
   
}