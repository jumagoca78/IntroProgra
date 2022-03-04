/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.ordenamiento;

/**
 *
 * @author JuanManuel
 */
public class SortDescending extends SortAlgorith{

    @Override
    public void sort(int[] arreglo) {
        System.out.println ("El arreglo esta ordenado de forma descendente.");
        
        for (int i = 2; i<= arreglo.length-1;i++ ){
            for (int j=0; j<=arreglo.length-i;j++){
                int temp;
                if (arreglo [j]< arreglo [j+1]){
                    temp = arreglo [j];
                    arreglo [j]= arreglo [j+1];
                    arreglo [j+1]=temp;        
                }
            }
    }
    }
    
}
