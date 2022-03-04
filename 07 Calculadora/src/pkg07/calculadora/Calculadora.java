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
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String valor = JOptionPane.showInputDialog("ingresar valor");
        
        int x = Integer.parseInt(valor);
        
        
        
        int resultado = square (x);
        
        JOptionPane.showMessageDialog (null, "El resultado de x=" + x +
                                       " al cuadrado es "+ resultado);
        
        System.exit(0);
        
        
    }
    
    //Función que regresa el valor al cuadrado de un numero x
    public static int square (int numeroX){
        return numeroX*numeroX;
    }
    
    public static double square (double numeroX){
        return numeroX*numeroX;
    }
    
    public static int addition (int numeroX, int numeroY){
        return numeroX+numeroY;
    }
    
    public static int resta (int numeroX, int numeroY){
        return numeroX-numeroY;
    }
    
    public static String pedirDato(){
        return JOptionPane.showInputDialog("Ingresar dato");
    }
    
    public static void mostrarDato(int dato){
        JOptionPane.showMessageDialog(null, dato);
    }
    
    public static void mostrarDato(double dato){
        JOptionPane.showMessageDialog(null, dato);
    }
    
    public static int convertirEntero (String cadena){
        return Integer.parseInt(cadena);
    }
    
}
