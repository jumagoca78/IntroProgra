/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanManuel
 */
public class ElMasGrande {
    
    public static int elMasGrande (int[] arreglo){
        int indice, max= Integer.MIN_VALUE;//regla, cuando buscamos el maximo inicializar con el valor minimo posible 
        //es necesario detener la ejecución del programa
        if (arreglo.length==0){
            throw new RuntimeException ("Lista vacia");
        }
        for (indice=0; indice <=arreglo.length-1; indice ++){
            if (arreglo [indice] > max){
                max = arreglo [indice];    
            }
        }
        return max;
    }
    //otras cosas
    
    
    
}
