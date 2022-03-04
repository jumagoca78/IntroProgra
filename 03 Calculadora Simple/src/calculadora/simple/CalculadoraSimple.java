/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.simple;

    import javax.swing.JOptionPane;

/**
 *
 * @author juangonzalezcalleros
 */
public class CalculadoraSimple {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
        String texto1=JOptionPane.showInputDialog("ingresa numero 1");
        String texto2=JOptionPane.showInputDialog("ingresa numero 2");
        

        int numero1= Integer.parseInt(texto1);
        int numero2= Integer.parseInt(texto2);
        
        
        if (  texto1.equals(texto2)  )
            JOptionPane.showMessageDialog(null, "Los numeros son iguales");
        if (numero1!=numero2)
            JOptionPane.showMessageDialog(null, "Los numeros son diferentes");
        if (numero1<numero2)
            JOptionPane.showMessageDialog(null, "El numero 1 es menor al numero 2");


           
        
    }
    
}
