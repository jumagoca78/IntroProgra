/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07.funciones.en.aplicacion;
import javax.swing.JOptionPane;

/**
 *
 * @author juangonzalezcalleros
 */
public class FuncionesEnAplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int result=0;
        String output = "";
        
        for (int i=1; i<=10;i++){
            result = Calculadora.square(i);
            output += "The additon of " + i + " and " + i +
                     " is " + result + "\n";
        }
        
        JOptionPane.showMessageDialog(null,output);

    }
    
}
