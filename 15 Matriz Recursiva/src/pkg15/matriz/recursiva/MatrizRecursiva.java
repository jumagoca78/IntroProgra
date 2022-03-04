/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15.matriz.recursiva;

/**
 *
 * @author JuanManuel
 */
public class MatrizRecursiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declarar y definir matriz
        int matriz [][] = {{1, 2, 3}, 
                           {4, 5, 6},
                           {7, 8, 9},
                           {10, 11, 12}};
        
        //Imprimir matriz 
        imprimirMatrizRecursión (matriz, 0, 0); //se empieza desde 0 
        
        //Terminar programa
        System.exit(0);
 
    }
        
    
    
       
        //Función recursiva que imprime una matriz
        public static void imprimirMatrizRecursión(int matriz[][], int i, int j){ //i y j son la posiciones

            System.out.print(matriz[i][j] + "\t");
            if (i != matriz.length-1 || j != matriz[i].length-1){ //caso base en el que i y j son distintos al tamaño del arreglo, en este caso 2
 
                if (j == matriz[i].length-1){ //aquí se salta de línea pues j llega a última posición
                    i++; //salta de arreglo
                    j = 0;  //empieza a recorrer el arreglo
                    System.out.print("\n");
                }
                    else {
                    j++; //continúa avanzando en la misma línea
                
                }

                imprimirMatrizRecursión(matriz, i, j); //recursión
                
            }
            
         
        }  
     
   }
 
        
    
    

