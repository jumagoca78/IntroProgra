
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanManuel
 */
public class MatrizTranspuesta {
       
    

       public static void main(String[] args) {
        // TODO code application logic here
      
       
       //vamos definiendo el tamaño de la matriz
       int filas=     solicitarDatoEntero ("Ingresa el tamaño de filas de la matriz");
       int columnas = solicitarDatoEntero ("Ingresa el tamaño de columnas de la matriz");
     
       //declaración de la matriz
       //Por default tiene ceros 
       int matriz [][] = new int [filas][columnas];
       int matrizTranspuesta [][]= new int [columnas][filas];
       
       //llenamos la matriz de aleatorios entre -5 y 20 o sea 25 valores
       int a = solicitarDatoEntero ("¿Cuál es el valor mínimo de nuestro rango?");
       int b = solicitarDatoEntero ("¿Cuál es el total de valores en nuestro rango?");
       llenarMatrizDeAleatorios (matriz, a, b); 
       
       //ahora la Transpuesta
       transpuestaDeMatriz (matriz,matrizTranspuesta);
       
       //Mandamos a Imprimir la matriz original
       imprimirMatriz ("Matriz Original",matriz);
       //Mandamos a Imprimir la Matriz Transpuesta
       imprimirMatriz ("Matriz Transpuesta", matrizTranspuesta);
       
       System.exit (0);
      }
       
       //funcion para pedir al usuario un numero entero
       public static int solicitarDatoEntero (String mensaje){
           String valor = JOptionPane.showInputDialog(mensaje);
           //convertir texto a entero y regresarlo
           return Integer.parseInt(valor);
       }
       
     //función para hacer la transpuesta de una matriz
       public static void transpuestaDeMatriz (int matrizA [][], int matrizT [][]){
       for (int i=0; i<=matrizT.length-1; i++) {
            for (int j=0; j<=matrizT[i].length-1; j++){
                //llenamos la matriz de aleatorios y solo invertimos los indices
                 matrizT[i][j]= matrizA[j][i];
	    }
	}
       } 
       
     //función que comvierte una matriz a String
       public static String matrizToString (int matrizX [][]){
           String salida = "";
           for (int i=0; i<=matrizX.length-1; i++) {
            for (int j=0; j<=matrizX[i].length-1; j++){
                //vamos acumlando la impresión de la salida fila por fila
	        salida += matrizX[i][j] + "\t";
	    }
            //una nueva línea para la siguiente fila
            salida += "\n";
	}
           return salida;
       }       
       
       //función que imprime una matriz
       public static void imprimirMatriz (String titulo, int matrizAImprimir [][] ){
           //Esta es el mensaje que antecede a la matriz
           System.out.println (titulo);
           System.out.println (matrizToString (matrizAImprimir));
           
       }
       
       //Función que llena un vector de aleatorios entre un rango de valor b y un
       //valor inicial a
       public static void llenarMatrizDeAleatorios (int matriz [][], int a, int b){
           //recorremos fila x fila
           for (int i=0; i<=matriz.length-1; i++){
               for (int j=0; j<= matriz [i].length-1; j++){
                //llenamos el vector de aleatorios
	        matriz[i][j] = genradorAleatoriosRango(a,b) ;
               }
            }
       }
       
       
       public static int genradorAleatoriosRango (int a, int b){
           return a + (int) (Math.random()*b);
       }
       
       
       
       
}

