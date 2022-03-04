/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.cuadro.de.dialogo.para.saludar;

import javax.swing.JOptionPane;

/**
 *
 * @author juangonzalezcalleros
 */
public class CuadroDeDialogoParaSaludar {

    /**
     * @param args the command line arguments   
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       int numero1 = 0;
       int numero2 = 0; 
       String texto1 = "";
       String texto2 = "";
       
      texto1= JOptionPane.showInputDialog("Ingresa el valor 1: ");
      texto2= JOptionPane.showInputDialog("Ingrese el valor 2");
      
      numero1= Integer.parseInt (texto1);
      numero2= Integer.parseInt (texto2);
      
      int suma, resta, multiplicacion, division;
      
      suma = numero1 + numero2;
      resta = numero1-numero2;
      multiplicacion= numero1*numero2;
      division= numero1/numero2;
      
       System.out.println ("La suma de  " + numero1 + " + " + numero2 + "es: "+ suma ); 
       
       JOptionPane.showMessageDialog(null, "La suma de  " + numero1 + " + " + numero2 + " es: "+ suma );
       JOptionPane.showMessageDialog(null, "La resta de  " + numero1 + " - " + numero2 + " es: "+ resta );
       JOptionPane.showMessageDialog(null, "La multiplicacion de  " + numero1 + " * " + numero2 + " es: "+ multiplicacion );
       JOptionPane.showMessageDialog(null, "La division de  " + numero1 + " / " + numero2 + " es: "+ division );
       
    }
    
}
