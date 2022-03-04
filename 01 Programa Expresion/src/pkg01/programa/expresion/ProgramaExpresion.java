/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.programa.expresion;

/**
 *
 * @author juangonzalezcalleros
 */
public class ProgramaExpresion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=2;
        int y=3;
        int z=6;
        
        int funcion;
        
        funcion= CalculoExpresion.calcular(x, y, z);
        
        System.out.println("El valor de la expresion 5*(x+y)-4*y/(z+6)");
        System.out.println("Cuando x=2; y=3; z=6");                        
        System.out.println("Es: " + funcion); //Concacatenar cadenas con tipos de datos primitivos
    }
    
}
