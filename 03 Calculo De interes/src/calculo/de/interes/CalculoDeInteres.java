/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo.de.interes;

/**
 *
 * @author juangonzalezcalleros
 */
import java.text.NumberFormat;
import javax.swing.JOptionPane;

public class CalculoDeInteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int c=0;
        if ( c => 7 );
             System.out.println ("c es mayor o igual a 7");
  

        
        double p=0.0, i=0.0, n=0.0, m=0.0;
        
        p= Double.parseDouble(textoPrincipal);
        i= Double.parseDouble(textoInteres);
        i=i/100; //Reciuerda que la ecauacion funciona con un valor entre 0 y 1 para el interes
        n=Double.parseDouble(textoAñosInversion);
        m=Double.parseDouble(textoTimepoBanco);
            
        
        double total =p* (Math.pow(1+(i/m),(m*n)));
        
        
        JOptionPane.showMessageDialog(null, "El resultado es " + total);
        
    }
    
}
