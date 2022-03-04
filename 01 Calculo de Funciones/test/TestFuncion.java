/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juangonzalezcalleros
 */
public class TestFuncion {
    
@Test 
    // Cuando x=2; y=3; z=6"
    // Se espera que el valor de la expresion 5*(x+y)-4*y/(z+6)
    //Sea de 24
   public void test24(){
        assertEquals (24, CalcularFuncion.funcion(2, 3, 6));
    }
    
    @Test 
    // Cuando x=2; y=2; z=0"
    // Se espera que el valor de la expresion 5*(x+y)-4*y/(z+6)
    // Se espera que el valor de la expresion 5*(4)-8/(6)
    //Sea de 19
   public void test19(){
        assertEquals (19, CalcularFuncion.funcion(2, 2, 0));
    }
}
