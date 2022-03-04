/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09.burbuja;

/**
 *
 * @author juangonzalezcalleros
 */
public class Burbuja{
    
    public static void main(String[] args) 
    {
      //Valores que tiene el arreglo desordenado.
      
      int arregloOrdenado [] = {3,5,4,6,8};
      
     ordenamientoAscendente(arregloOrdenado);  
   
      //imprimimos el arreglo ordenado ascendete.
      System.out.println("Arreglo ascendente");
      for(int i = 0; i < arregloOrdenado.length;i++)
        System.out.println(arregloOrdenado[i]);
      
     
      ordenamientoDescendente(arregloOrdenado);  
   
      //imprimimos el arreglo ordenado descendente.
      System.out.println("Arreglo descendente");
      for(int i = 0; i < arregloOrdenado.length;i++)
        System.out.println(arregloOrdenado[i]);

    }
    
    
    public static void ordenamientoDescendente (int arreglo [] )
    
    {
    int auxiliar;
    for(int i = 1; i <= arreglo.length-1; i++)
      {
        for(int j = 0;j < arreglo.length-i;j++)
        {
          if(arreglo[j] < arreglo[j+1])
          {
            auxiliar = arreglo[j];
            arreglo[j] = arreglo[j+1];
            arreglo[j+1] = auxiliar;
          }   
        }
      }
    }
    
    public static void ordenamientoAscendente (int arreglo2 [] )
    
    {
    int auxiliar;
    for(int i = 2; i <= arreglo2.length; i++)
      {
        for(int j = 0;j < arreglo2.length-1;j++)
        {
          if(arreglo2[j] > arreglo2[j+1])
          {
            auxiliar = arreglo2[j];
            arreglo2[j] = arreglo2[j+1];
            arreglo2[j+1] = auxiliar;
          }   
        }
      }
    }
}