/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07.calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author juangonzalezcalleros
 */
public class JavaTest {
    
    public static void main (String args []){
        
        String valor = Calculadora.pedirDato();
        int x = Calculadora.convertirEntero(valor);
        int resultado;
        double resultadoDouble;
        Double xDouble = (double) x; 
        
        
        
        resultado= Calculadora.square(x);
        resultadoDouble = Calculadora.square(xDouble);
        
        Calculadora.mostrarDato(resultado);
        Calculadora.mostrarDato(resultadoDouble);
                
    }
    
}
