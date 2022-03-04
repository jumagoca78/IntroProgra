/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.operaciones.arreglos;

/**
 *
 * @author JuanManuel
 */
public class OperacionesArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ///suma simple de arreglos
        int matriz1 [][]={{1,2,3,4,5},{6,7,8,9,10}};
        int matriz2 [][]={{6,7,8,9,10},{1,2,3,4,5}};
        int matrizRes [][]= new int [2][5];
        
        System.out.println("Esta es una matriz de "+ matriz1.length + " filas");
        System.out.println("Con " + matriz1[0].length+ " columnas");
        
        //variable para guardar una fila ompleta de una matriz
        String salida = "";
        System.out.println ("Matriz1");
        //Para mandar a imprimir el contenido de una matriz hay que recorrer fila por fila
        for (int i=0; i <= matriz1.length-1; i++ ){
            //Hay recorrer columna por columa de toda una fila
            for (int j=0; j<=matriz1[i].length-1;j++){
                salida += matriz1 [i][j] + " ";
            }
            //Cada fila es impresa en la salida del sistema y borramos para una nueva línea
            System.out.println(salida);
            salida = "";
        }
        
        
        
        salida = "";
        System.out.println ("Matriz2");
        //Para mandar a imprimir el contenido de una matriz hay que recorrer fila por fila
        for (int i=0; i <= matriz2.length-1; i++ ){
            //Hay recorrer columna por columa de toda una fila
            for (int j=0; j<=matriz2[i].length-1;j++){
                salida += matriz2 [i][j] + " ";
            }
            //Cada fila es impresa en la salida del sistema y borramos para una nueva línea
            System.out.println(salida);
            salida = "";
        }
        
        salida = "";
        System.out.println ("Resultado");
        //Para mandar a imprimir el contenido de una matriz hay que recorrer fila por fila
        for (int i=0; i <= matrizRes.length-1; i++ ){
            //Hay recorrer columna por columa de toda una fila
            for (int j=0; j<=matrizRes[i].length-1;j++){
                matrizRes[i][j]=matriz1[i][j]*matriz2[i][j]; 
                salida += matrizRes [i][j] + " ";
            }
            //Cada fila es impresa en la salida del sistema y borramos para una nueva línea
            System.out.println(salida);
            salida = "";
        }
        
        
        }

    
    }
    

