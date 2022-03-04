/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09.proyecto.sumatoria;

import javax.swing.JOptionPane;

/**
 *
 * @author juangonzalezcalleros
 */
public class PROYECTOSUMATORIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int valor = 20;
        long factorial [] = new long [21]; //vamos a tener almacenados valores entre 0 y 10
        factorial [0] =1;
        
        for (int i=1; i<= valor; i++){
            factorial [i] = (long) i * factorial [i-1];
        }
        
        System.out.println("El valor del factorial de "+ valor+  " es :" +factorial [valor]);
        
        String valorString = JOptionPane.showInputDialog ("Ingresa un valor a calcular"); 
        int otraSumatoria = Integer.parseInt (valorString);
        
        System.out.println("El valor del factorial de "+ otraSumatoria+  " es :" + factorial [otraSumatoria]+
                           "\nToma en cuenta que el Máximo entero es " + Long.MAX_VALUE);
    }
    
}
