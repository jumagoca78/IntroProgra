
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
public class FibonacciRecursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String x = JOptionPane.showInputDialog("ingrese el numero del cual desea conocer su numero fibonacci");
        int n = Integer.parseInt(x);
        int fibonacci= fibonacci2(n);
        System.out.println("El número fibonacci de: "+n+" es: "+ fibonacci);
    }
    
    public static int fibonacci2 (int n){
        if (n==0){
            return 0;
        }
        if (n==1||n==2){
            return 1;
        }
        return fibonacci2(n-1)+fibonacci2(n-2);
    }
    
}

