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
public class TestLargest {
    
    @Test
    public void testMasGrandeAlInicio (){
       
        assertEquals (9,Largest.largest(new int [] {9,8,7}));
    }
    
    @Test
    public void testMasGrandeEnmedio (){
        assertEquals (9,Largest.largest(new int [] {8,9,7}));
    }
    
    @Test
    public void testMasGrandeAlFinal (){
        assertEquals (9,Largest.largest(new int [] {8,7,9}));
    }
    
    @Test
    public void testNumerosNegativos (){
        assertEquals (-7,Largest.largest(new int [] {-8,-7,-9}));
    }
    
    @Test
    public void testNumeroMasGrandeRepetido (){
        assertEquals (9, Largest.largest(new int [] {9,8,7,9,5,9}));
    }
    
    @Test
    public void testUnSoloValorEnArreglo (){
        assertEquals (9, Largest.largest(new int [] {9}));
    }    
    
    @Test
    //Vamos a abrir un archivo que tiene pruebas y a partir de esas pruebas 
    //revisar si pasan o no pasan
    //hay que avisar que intentar leer archivos puedes causar errores fatales por eso lanza excepciones
    public void testDesdeUnArchivoDePruebas ()throws Exception{
        
        String linea; //Variable que va a ir recolectado cada linea del archivo
        //Un buffereeader es un especio de almacenamiento del contenido de un archivo 
        BufferedReader lector = new BufferedReader(new FileReader ("testdata.txt"));
        
        //Vamos a recorrer el BufferedReader liniea por linea mientras no lleguemos al final
        while ((linea=lector.readLine()) != null){
            if (linea.startsWith("#")){
                continue; //Saltar al while pues no hay nada que hacer 
            }
            //Sino fue comentario ejecutamos el siguiente codigo
            //cada texto de la cadena se puede guardar en un token 
            //para poder ir recorriendo el contenido de cada linea y obteniendo
            //el valor esperado de la prueba y los valores del arreglo
            //usaremos st para sacar cada elemento de una sola línea
            StringTokenizer st = new StringTokenizer (linea);
            
            //primero verifiucamos que no sea una línea vacía
            if (!st.hasMoreTokens()){
                continue; //ns vamos a la siguiente iteración del while ya que es una línea vacía
   
            }
            
            //El primer numero en la linea es el valor esperado de la prueba
            String valorEsperadoString = st.nextToken();
            //Como es texto lo convertimos a numero
            int valorEsperado = Integer.parseInt(valorEsperadoString);
            
            //Como no sabemos cuando numero hay en el arreglo vamos a usar
            //un arreglo que crece de forma dinamica que se llama arraylist
            ArrayList arregloArray = new ArrayList();
            //Vamos a recorrer la línea y sacar numero por numero y guardarlos en el arreglo
            while (st.hasMoreTokens()){
                String numeroEnArchivoString = st.nextToken();
                int numeroEnArchivo = Integer.parseInt(numeroEnArchivoString);
                arregloArray.add(numeroEnArchivo);
            }
            
            //Recordemos que nuestra clase funciona con un arreglo no ArrayList
            //Vamos a construir el arreglo para la prueba
            int [] arregloParaPrueba = new int [arregloArray.size()];
            for (int i=0 ; i<= arregloParaPrueba.length-1; i++){
                arregloParaPrueba[i]=(int) (arregloArray.get(i));
            }
            
            //Ya con el arreglo construido podemos hacer la prueba para cada línea
            assertEquals (valorEsperado, Largest.largest(arregloParaPrueba));
            
        }
    }
            
    
    
}
