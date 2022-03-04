/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
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
public class TestElMasGrande {
    

    
    @Test
    //escenario sencillo para ver si en el arreglo [9,8,7]
    //el resultado debe ser 9
    public void testMasGrandeInicio(){
        assertEquals (9,ElMasGrande.elMasGrande(new int [] {9,8,7}) );
    }
    
    @Test
    //vamos a probar que el numero mayor esta enmedio  del arreglo
    public void testMasGrandeEnmedio(){
        assertEquals (9,ElMasGrande.elMasGrande(new int [] {8,9,7}) );
    }   
    
    @Test
    //vamos a probar que el numero mayor esta enmedio  del arreglo
    public void testMasGrandeAlFinal(){
        assertEquals (9,ElMasGrande.elMasGrande(new int [] {8,7,9}) );
    }   
    
     @Test
    //vamos a probar que el numero mayor ESTE duplicado
    public void testDuplicado(){
        assertEquals (9,ElMasGrande.elMasGrande(new int [] {9,9,9,1,2}) );
    }
    
    @Test
    //vamos a probar que el numero mayor esta en un arreglo de tamaño 1
    public void testUnValorEnArreglo(){
        assertEquals (9,ElMasGrande.elMasGrande(new int [] {9}) );
    }
    
    @Test
    //Que pasa si los numeros son negativos
    public void testNegativo(){
        assertEquals (-9,ElMasGrande.elMasGrande(new int [] {-10,-15,-9}) );
    }
    
    @Test
    //Que pasa si la lista esta vacia
    public void testListaVacia(){
        try 
        {
            ElMasGrande.elMasGrande(new int [] {} );
            fail ("Debería lanzar una excepcion");
        }catch (RuntimeException e){
            assertTrue (true);
        }
                    
                
        
    }
    
        @Test
    //prueba simple de muchos valores pero tomados de un archivo
    public void testFromFile() throws Exception{
        
        String linea;
        BufferedReader lector = new BufferedReader (
                               new FileReader ("testdata.txt") 
                               );
        while ((linea=lector.readLine()) != null){
            if (linea.startsWith("#")){//ignorar la linea que empieza con #
                continue;
            }
            //es una forma de segmentar una cadena de texto en palabras 
            StringTokenizer st = new StringTokenizer (linea);
            
            if (!st.hasMoreTokens()){//aqui la cadena esta vacia
                continue;
            }
                     
            String valorEsperadoString = st.nextToken();
            int valorEsperado = Integer.parseInt(valorEsperadoString);
            
            //ocupar una forma de guardar elementos de forma dinámica
            //en lugar de un arreglo [] vamos a usar un arreglo de java
            //ArrayList
            ArrayList arreglo = new ArrayList ();
            while (st.hasMoreTokens()){
                String numeroEnArregloString = st.nextToken();
                int numeroEnArreglo = Integer.parseInt(numeroEnArregloString);
                arreglo.add (numeroEnArreglo);
            }
            
            int [] arregloParaPrueba = new int [arreglo.size()];
            //llenamos nuestro arreglo con los valores del arrayList
            for (int i = 0; i<=arregloParaPrueba.length-1;i++){
                arregloParaPrueba [i]= (int) (arreglo.get(i));
            }
            
            assertEquals (valorEsperado,ElMasGrande.elMasGrande(arregloParaPrueba) );
        }
    }
    
    
    
    

    
}
