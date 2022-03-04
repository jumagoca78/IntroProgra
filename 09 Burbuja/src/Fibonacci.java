
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juangonzalezcalleros
 */
public class Fibonacci {
    
        public static void main(String[] args) {
        // TODO code application logic here
        String terminon;
        int  nElementos;
       
        terminon= JOptionPane.showInputDialog("Introduce el n termino a calcular de la sucesion de Fibonacci");
        nElementos = Integer.parseInt(terminon);
        int [] arreglo = new int [nElementos+1]; //Recuerda que un arreglo llega hasta n-1
       
       
        arreglo[0]=0;
        arreglo[1]=1;
        
        //importante preguntar primero si el número es mayor a 2 para hacer el for
        if  (nElementos >=2){
            for(int i=2; i <= nElementos; i++){
                arreglo[i] = arreglo[i-1] +arreglo[i-2];           
                System.out.println( arreglo [i]);
              }
        } 
        System.exit( 0 );
        }
   
}