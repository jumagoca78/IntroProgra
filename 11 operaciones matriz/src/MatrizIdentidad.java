
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
public class MatrizIdentidad {
    
    
        public static void main(String[] args) {
        // TODO code application logic here
       //para guardar la suma 
       int suma=0;
       
       
       int size= MatrizTranspuesta.solicitarDatoEntero("Solicitar tamaño de la matriz");
       
       //declaración de la matriz
       //Por default tiene ceros 
       int matriz [][] = new int [size][size];
       
       for (int i=0; i<=matriz.length-1; i++) {
            for (int j=0; j<=matriz[i].length-1; j++){
                //llenamos la matriz solo de 1´s la diagonal
                //revisar si es la diagonal
                if (i==j)
                    matriz[i][j]=1;
                //vamos acumlando la impresión de la salida fila por fila
	    }
            //una nueva línea para la siguiente fila
        }
       
       MatrizTranspuesta.transpuestaDeMatriz(matriz, matriz);
       //Mandamos a Imprimir el resultado
       Matriz.imprimirMatriz("Matriz", matriz);
               
      }
      
}
 