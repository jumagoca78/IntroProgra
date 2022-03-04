/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.operaciones.matriz;

/**
 *
 * @author JuanManuel
 */
public class OperacionesMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //para guardar la suma 
       int suma=0;
       
       //declaración de la matriz
       int matriz [][] = new int [4][4];
       String salida= "Matriz \n";
       //llenamos la matriz y sumammos la dialogal
       //Recordar primero vemos cuantas filas hay que recorrer
       for (int i=0; i<=matriz.length-1; i++) {
           //luego identificamos cada arreglo en cada fila y lo llenamos
            for (int j=0; j<=matriz[i].length-1; j++){
                //llenamos la matriz de valores entre -5 y 20
                //recuerda que en este caso vamos llenando fila por fila el indice i es fijo 
                //y el que va avanzando en este for es j
                matriz[i][j]=(int) (Math.random()*25 - 5);
                //vamos acumulando la impresión de la salida fila por fila
                salida += matriz[i][j] + "\t";
	        //revisar si es la diagonal
                if (i==j)
                    suma+=matriz[i][j];
	    }
            //una nueva línea para la siguiente fila
            salida += "\n";
	}
       //Mandamos a Imprimir el resultado
       System.out.println (salida);
       System.out.println ("La suma de la diagonal es: " + suma);
    }
}

  
