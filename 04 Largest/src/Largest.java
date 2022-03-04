/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanManuel
 */
public class Largest {
    
    public static int largest (int [] list){
        int indice, max = Integer.MIN_VALUE;
        if (list.length==0){
            throw new RuntimeException ("Lista vacia");
        }
        for (indice=0; indice <= list.length-1; indice ++ ){
            if (list[indice] > max ) {
                max = list[indice]; 
            }
                
        }
        return max;
        
    }
}
