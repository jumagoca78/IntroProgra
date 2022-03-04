package pkg01.programa.expresion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juangonzalezcalleros
 */
public class CalculoExpresion {
    
    public static int calcular (int x, int y, int z){
    
        int funcion;
        
        funcion= (5*(x+y)-4*y/(z+6))-4;
        
        if (funcion  == 15)
            funcion = funcion +4;
        
        return funcion;
    } 
    
}
