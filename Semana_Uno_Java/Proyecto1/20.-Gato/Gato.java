import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Thread; //Sleep en java :)

/**
*
*@author Anallely_y_Mario 
*@version 02/10/18
*
**/

public class Gato {

  Thread th = new Thread();   //Hilo para sleep

/**
*Funcion para hacer Sleep como en C
*@param n Recibe cantidad de milisegundos a parar
**/
  public void pausa(int n)
  {
    try
    {
      th.sleep(n);   //Dormir
    }catch(InterruptedException e)
      {
        System.out.println("Error");
      }
  } 

  String ANSI_CLEAR_SEQ = "\u001b[2J";

  //Variables.  
  public char [][] tablero;
  public char jugadorUno;
  public char jugadorDos;
  public boolean turno;
  int contador;    
 
/**
*Constructor(Inicializa Variables).
**/  
  public Gato() {
    tablero = new char[3][3];        
    jugadorUno = 'X';
    jugadorDos = 'O';
    turno = true;  //Si El Valor De "turno" Es Igual A "true" El Turno Es Del Jugador 1, De Lo Contrario Es Jugador 2.
    int contador = 0;   //Lleva Cuenta De Las Veces Que Han Participado Los Jugadores 1 y 2.
    inicializarTablero();  
  }
 
  /**
  *Inicia El Arreglo, Especifica El Numero Que Le Corresponde A Cada Casilla.
  **/
  public void inicializarTablero(){
    int posicion = 1;
    for(int i=0;i<3;i++){
      for(int j=0; j<3;j++){
        tablero[i][j] = Integer.toString(posicion).charAt(0);
        posicion++;
      }        
    }
  }
 
  /**
  *Imprime El Formato Del Tablero.
  **/
  public void imprimirTablero(){
   System.out.println("\n");      
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        if(j<2) {
          System.out.print(" " + tablero[i][j] + " |");
         } else {
          System.out.print(" " + tablero[i][j] + " ");
         }
      }
     
      if(i<2) {        
        System.out.println("\n-----------");                    
      }
    }
    System.out.println("\n\n\n");
  }
 
  /**
  *Indica La Posicion Donde Se Ingresara El Dato Dentro Del Arreglo Por Medio De Parametros.  
  *@param a posicion i 
  *@param b posicion j
  *@param c valor
  **/
  public void indicarPosicionArreglo (int a, int b, char c) {tablero [a][b]=c;}

  /**
  *Manipula el valor De La Variable "turno".  
  *@param d Recibe un boleano para saber turnos
  **/
  public void setTurno(boolean d){turno=d;}

   /**
  *Manipula el valor De La Variable "contador".  
  *@param e contador
  **/ 
  public void setContador(int e){contador=e;}
 
  /**
  *Regresa Valor De La Posicion Del Arreglo Indicada Por Medio De Parametros.  
  *@param a posicion i
  *@param  b posicion 
  *@return el tablero en la posicion
  **/
  public char getPosicionArreglo (int a, int b)  {return tablero[a][b];}
   
  /**
  *Regresa Valor De La Variable "jugadorUno".
  *@return jugador uno
  **/
  public char getJugadorUno()  {return jugadorUno ;}      
   
  /**
  *Regresa Valor De La Variable "jugadorDos".
  *@return jugadir dos
  **/
  public char getJugadorDos()  {return jugadorDos;}      
 
  /**
  *Regresa Valor De La Variable "turno".
  *@return el turno que sigue
  **/
  public boolean getTurno()  {return turno ;}

 /**
  *Regresa Valor De La Variable "contador".  
  *@return el contador      
  **/    
  public int getContador()  {return contador ;}      
 
 
/**
  *Imprime e Indica El El Turno Del Jugador Que Le Toca Elejir Una Casilla Con Ayuda del Metodo "getTurno()".
  **/
  public void indicarTurno(){
    System.out.println( "JUGADOR "+(getTurno()?"1":"2")+": \nElija Una Casilla Ingresando El Numero Correspondiente.");
  }

  /**
  *Regresa El Caracter De Tipo Char Para Posteriormente Ingresarlo A Alguna Posicion Del Arreglo, Usandolo En Otro Metodo.
  *@return la figura
  **/
  public char obtenerFigura(){
    return getTurno() ? jugadorUno : jugadorDos;
  
  }
 
  /**
  *Cambia El Valor De La Variable "turno" Para Llevar El Orden Correcto De Los Turnos Entre Los 2 Jugadores.  
  **/
  public void cambiarTurno(){    
    setTurno(obtenerFigura() != 'X' );
  }
   
  /**
  *Verifica Si La Posicion Del Arreglo Al Que El Jugador Desea Ingresar El Caracter No Fue Utilizada Antes.  
  *@param espacio la posicion
  *@param posicionUno posicion i
  *@param posicionDos posicion j
  **/
  public void comprobarEspacio(char espacio, int posicionUno, int posicionDos){
    //Si Se Cumple La Condicion Se Ingresa El Valor En La Posicion Del Arreglo Especificada.  
    if(espacio!=getJugadorUno()&&espacio!=getJugadorDos()){
       indicarPosicionArreglo(posicionUno, posicionDos,obtenerFigura());//Ingresa EL Caracter Si Se Cumple La Condicion.
       cambiarTurno(); //Cambia El Turno Si Se Cumple La Condicion.  
       contador++; //Solo Incremente Cuando Se Cumple La Anterior Condicion.      
    } else {
     //Imprime El Siguiente Mensaje En Caso De Que No Se Cumpla La Anterior Condicion.            
       System.out.println("La Casilla Esta Ocupada, Elija Otra Por Favor");          
    }
  }
         
  /**
  *Metodo Que Hace Uso De Un "switch" Para Indicar La Posicion Del Arreglo Que El Jugador Elijio En El Juego.  
  *@param posicion recibe la posicion donde jugar
  **/ 
  public void elegirPosicion(int posicion){
               
      switch(posicion){
        //Comprueba Si La Posicion Esta Disponible Valiendose Del Metodo "comprobarEspacio()"
        case 1:comprobarEspacio(getPosicionArreglo(0,0),0,0);break;
        case 2:comprobarEspacio(getPosicionArreglo(0,1),0,1);break;
        case 3:comprobarEspacio(getPosicionArreglo(0,2),0,2);break;
        case 4:comprobarEspacio(getPosicionArreglo(1,0),1,0);break;
        case 5:comprobarEspacio(getPosicionArreglo(1,1),1,1);break;
        case 6:comprobarEspacio(getPosicionArreglo(1,2),1,2);break;
        case 7:comprobarEspacio(getPosicionArreglo(2,0),2,0);break;
        case 8:comprobarEspacio(getPosicionArreglo(2,1),2,1);break;
        case 9:comprobarEspacio(getPosicionArreglo(2,2),2,2);break;
        default:
          //Imprime El Siguiente Mensaje En Caso De Que El "switch" No Reciba Un Digito Del 1 al 9.  
          System.out.println("Por Favor, Ingrese Solo Un Digito Del 1 al 9.");break;          
      }    
  }
 
  /**
  *Solo Imprime Un Mensaje Distinto Dependiendo Del Jugador Que Haya Resultado Ganador.
  *@param a recibe el jugador que gano
  **/
  public void decirGanador(char a){
    System.out.println(ANSI_CLEAR_SEQ);
    System.out.println("FIN DEL JUEGO: FELICIDADES JUGADOR "+(a == 'X' ? "1": "2" )+"!\nHA GANADO!.");
  }
 
 /**
 *Verifica Las Unicas 8 Combinaciones Que Pueden Dar La Victoria A Uno De Los Jugadores.
 **/
  public void buscarGanador(){
         
    //Ciclo Con Instrucciones Para Comprobar Las 3 Posibilidades De Ganar De Forma Horizontal.
    for(int i=0;i<3;i++){
      for(int j=1;j<2;j++){
        if(tablero[i][j]==tablero[i][j-1]&&tablero[i][j]==tablero[i][j+1]){
           decirGanador(tablero[i][j]);
           setContador(10);
        }          
      }        
    }
   
    //Ciclo Con Instrucciones Para Comprobar Las 3 Posibilidades De Ganar De Forma Vertical.  
    for(int i=0;i<3;i++){
      for(int j=1;j<2;j++){
        if(tablero[j][i]==tablero[j-1][i]&&tablero[j][i]==tablero[j+1][i]){
           decirGanador(tablero[j][i]);
           setContador(10);
        }            
      }
    }
   
    //Instrucciones Para Comprobar La Unica Posibilidad De Ganar De Forma Diagonal.  
    if(tablero[1][1]==tablero[0][0]&&tablero[1][1]==tablero[2][2]){
       decirGanador(tablero[1][1]);
       setContador(10);
    }  
       
    //Ciclo Con Instrucciones Para Comprobar La Unica Posibilidade De Ganar De Forma Diagonal Inversa.
    if(tablero[1][1]==tablero[0][2]&&tablero[1][1]==tablero[2][0]){
       decirGanador(tablero[1][1]);        
       setContador(10);
    }    
  }  
   
  /**
  *Metodo Que Contiene El Flujo Y El Orden Del Juego.
  **/
  public void jugarGato(){
   
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println(ANSI_CLEAR_SEQ);
    System.out.println("BIENVENIDO A GATO");    
    pausa(2000);

    do{
      System.out.println(ANSI_CLEAR_SEQ);
      indicarTurno();      
      imprimirTablero();    
      try{elegirPosicion(Integer.parseInt(entrada.readLine()));}
      catch(IOException e){}  
      catch(NumberFormatException e){
        System.out.println("ERROR!: Ingreso Un Caracter No Valido, Por Favor, Intente Nuevamente JUGADOR " + (getTurno()?"1":"2"));        
      }
         
      buscarGanador();
   
    } while(getContador()<9);
   
    if(getContador()==9){
      System.out.println(ANSI_CLEAR_SEQ);
      System.out.println("¡GATO!¡JUEGO EMPATADO!");              
      pausa(4000);
      System.out.println(ANSI_CLEAR_SEQ);
      System.out.println("Gracias por Jugar :3");      
    }else{
     pausa(4000);
     System.out.println(ANSI_CLEAR_SEQ);
     System.out.println("Gracias por Jugar :3");
     }      
  }
 
  /**
 *Main
 *@param args puede recibir algo
 **/
  public static void main(String [] args){
    Gato objeto = new Gato();
    objeto.jugarGato();    
                                   
  }  
}
