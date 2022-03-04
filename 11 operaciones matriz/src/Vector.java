
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
public class Vector {

    
    
    public static void main (String args []){
    
        int size = solicitarDatoEntero("Tamaño del vector");
        int vector [] = new int [size];
        
        llenarVector (vector, -100,200);
        
        System.out.println ("El arreglo original");
        System.out.println (arregloToString (vector));
        
        
        OrdenarAscendente (vector);
        System.out.println ("El arreglo ordenado");
        System.out.println (arregloToString (vector));
        
       
    }
    
    
     public static void llenarVector (int vector [] , int a, int b  ){
        
        for (int i=0 ; i<= vector.length-1;i++){
            vector [i] = MatrizTranspuesta.genradorAleatoriosRango(a, b);
        }
    }

     public static void llenarVector (int vector []  ){
        int a= -100;
        int b=200;
        for (int i=0 ; i<= vector.length-1;i++){
            vector [i] = MatrizTranspuesta.genradorAleatoriosRango(a, b);
        }
    }
     
     
    public static String arregloToString (int vector []){
        String salida = "";
        int contador = 0;
        
        for (int i =0 ; i <= vector.length -1;i++){
            salida+= vector [i] + "\t";
            contador ++;
            
            if (contador == 20){
                salida += "\n";
                contador =0;
            }
        }
        
        
        return salida;
    }
    
    public static void OrdenarAscendente (int vector []){
        for (int i = 2; i<= vector.length-1;i++ ){
            for (int j=0; j<=vector.length-i;j++){
                int temp;
                if (vector [j]> vector [j+1]){
                    temp = vector [j];
                    vector [j]= vector [j+1];
                    vector [j+1]=temp;        
                }
            }
    }
    
   }
    
//funcion para pedir al usuario un numero entero
       public static int solicitarDatoEntero (String mensaje){
           String valor = JOptionPane.showInputDialog(mensaje);
           //convertir texto a entero y regresarlo
           return Integer.parseInt(valor);
       }
}
