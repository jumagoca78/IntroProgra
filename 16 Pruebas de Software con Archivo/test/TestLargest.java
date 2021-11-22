import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import org.junit.Test;

public class TestLargest {
    
    @Test
    public void testMasGRandeAlInicio (){
        assertEquals(9, Largest.largest(new int []{9,8,7}));
    }  

    @Test
    public void testMasGrandeEnMedio (){
        assertEquals(9, Largest.largest(new int []{8,9,7}));
    }

    @Test
    public void testMasGrandeAlFinal (){
        assertEquals(9, Largest.largest(new int []{8,7,9}));
    }


    @Test
    //prueba simple de muchos valores pero tomados de un archivo
    public void testFromFile() throws Exception{
        
        String linea;
        BufferedReader lector = new BufferedReader (
                               new FileReader ("D:\\testData.txt") 
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
            
            assertEquals (valorEsperado,Largest.largest(arregloParaPrueba) );
        }
    }


}
