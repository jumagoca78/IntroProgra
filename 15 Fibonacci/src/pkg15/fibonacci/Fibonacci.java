/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15.fibonacci;

/**
 *
 * @author JuanManuel
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=32;
        int Fibonacci = Fibonnaci (n); 
        System.out.println ("El numero Fibonacci es " + Fibonacci);
    }
    
    
    public static int Fibonnaci (int n){
        
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        return Fibonnaci (n-1) + Fibonnaci (n-2);
        
    }
}
