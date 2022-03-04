/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.ordenamiento;

/**
 *
 * @author JuanManuel
 */
public abstract class SortAlgorith {
    
    //Este es mi metodo templete de ordenamiento
    public void sortAlgorithm (){
        int arreglo [] = new int [100];
        processArray(arreglo);
        sort(arreglo);
        returnArray(arreglo);
    }
    
    //este es el método para generar los 100 numeros alatorios
    public void processArray(int arreglo []){
        System.out.println ("Aqui llenamos el arreglo de aleatorios");
        //Llenamos con 100 numeros entre 1 y 100
        for (int i=0; i <= arreglo.length-1; i++){
            arreglo [i]=generarAleatorio (1, 100); 
        }
            
    }
    
    //este metodo se programara en las subclases aqui no
    public abstract void sort (int arreglo []);
    
    
    //Mandar  a imprimir el arreglo ordenado
    public void returnArray(int arreglo []){
        System.out.println ("Aqui imprimimos el arreglo ordenado");
        
        //imprimir el arreglo
        String salida = "[";
        for (int i=0;i <= arreglo.length-1;i++ ){
           salida += arreglo[i]+"  ";
        if (i % 9 == 0)
            salida += "\n";
        
    }
        salida += "]";
        
        System.out.println (salida);
        
    }
    
    
    public int generarAleatorio (int base, int rango){
        return base + (int)(Math.random() * rango );
    }
    
}
