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
 * @author JuanManuel
 */
public class TestLargest {
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    

    //probar los limites que el más grande este al inio enmedio o al final del arreglo

    @Test
    public void testLargetFirst (){
        assertEquals (9, Largest.largest(new int [] {9,8,7}));
    }
    
     //probar los limites que el más grande este al inio enmedio o al final del arreglo
    @Test
    public void testLargetMiddle (){
        assertEquals (9, Largest.largest(new int [] {8,9,7}));
    }
    
    @Test
    public void testLargetEnd (){
        assertEquals (9, Largest.largest(new int [] {8,7,9}));
    }
    
    @Test
    public void testOneValue (){
        assertEquals (9, Largest.largest(new int [] {9}));
    }
    
    @Test
    public void testNegatives (){
        assertEquals (-7, Largest.largest(new int [] {-8,-7,-9}));
    }
    
    @Test
    public void testMaxInt (){
        assertEquals (2147483647, Largest.largest(new int [] {-8,2147483647,-9}));
    }
    
    @Test
    public void testMinInt (){
        assertEquals (-8, Largest.largest(new int [] {-8,-2147483648,-9}));
    }
    
    @Test
    public void TestEmptyArray (){
        try{
            Largest.largest (new int []{});
            fail ("Debiste enviar una excepción");
        }
        catch (RuntimeException e ){
            assertTrue(true);
        }
    }

}
