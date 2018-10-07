import java.io.IOException;
import javax.swing.JOptionPane;


/**
*
*@author Anallely_y_Mario 
*@version 02/10/18
*
**/

public class Cesar {

    /**
    *método para cifrar el texto
    *@param texto (a cifrar)
    *@param codigo (que se utilizara)
    *@return el cifrado
    **/
    public static String cifradoCesar(String texto, int codigo) {
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) + codigo) > 'z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) + codigo) > 'Z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            }
        }
        return cifrado.toString();
    }

     /**
    *método para descifrar el texto
    *@param texto (a descifrar)
    *@param codigo (que se utilizara)
    *@return el descifrado
    **/
    public static String descifradoCesar(String texto, int codigo) {
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) - codigo) < 'a') {
                    cifrado.append((char) (texto.charAt(i) - codigo + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - codigo));
                }
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) - codigo) < 'A') {
                    cifrado.append((char) (texto.charAt(i) - codigo + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - codigo));
                }
            }
        }
        return cifrado.toString();
    }

    /**
    *Main donde se piden el texto, codigo y si se descifra o cifra al estilo Cesar :v
    *@param args nada
    *@throws IOException excepciones generales
    **/
    public static void main(String[] args) throws IOException {
        String texto;
        int codigo;
        String opcionstr;
        char opcion;
        //Introducir un texto
        do {
            texto = JOptionPane.showInputDialog(null,"Introduce tu texto","Cifrado Cesar",JOptionPane.INFORMATION_MESSAGE);
        } while (texto.isEmpty());
        //Introducir el valor del desplazamiento
        do {
            codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de tu codigo","Codigo Cesar",JOptionPane.INFORMATION_MESSAGE));
        } while (codigo < 1);
        //Introducir la operación a realizar: cifrar o descifrar
        do {
            opcionstr = JOptionPane.showInputDialog("(C) cifrar o (D) descifrar?");
            opcion = opcionstr.charAt(0); 
        } while (Character.toUpperCase(opcion) != 'C' && Character.toUpperCase(opcion) != 'D');
        if (Character.toUpperCase(opcion) == 'C') {
            JOptionPane.showMessageDialog(null,cifradoCesar(texto, codigo),"Texto Cifrado",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,descifradoCesar(texto, codigo),"Texto Descifrado",JOptionPane.INFORMATION_MESSAGE);
        }
    }

} 