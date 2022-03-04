

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juangonzalezcalleros
 */
import java.util.Scanner; 


public class Sumatoria {
    
    public static void main (String args []){
    
        //Calculo del factorial de un numero entero positvo o cero
        
        Scanner in = new Scanner(System.in); 
        System.out.println("Ingresa el valor del factorial a calcular: ");
        String valor = in.nextLine();
        int valorInt = Integer.parseInt (valor);
        long sumatorias []  = new long [valorInt+1]; //0 hasta n

        if (valorInt >=0){
            
            if (valorInt == 0)
                System.out.println("La sumatoria de " + valorInt +
                                                      " es: "+ valorInt);   
            else 
            {
                
                for (int i=1; i <= valorInt; i++){
                    sumatorias [i]=i+sumatorias [i-1];
                }
                
                System.out.println("La sumatoria de " + valorInt +
                                                      " es: "+ sumatorias [valorInt]);
            }
            
            System.out.println("Te interesa un valor de sumatoria  entre 1 y "+ valorInt+ " ingresa el valor o -1 para terminar");
            String segundoValor =in.nextLine();
            
            
            int segundoSumatoria= Integer.parseInt(segundoValor);
            
            while (segundoSumatoria >=0 || segundoSumatoria<=valorInt){
                System.out.println("El nuevo valor de la sumatoria de " + segundoSumatoria+ " es: "+
                        sumatorias [segundoSumatoria]);
                 
                System.out.println("Te interesa un valorfactorial entre 1 y "+ valorInt+ " ingresa el valor o -1 para terminar");
                segundoValor = in.nextLine();
                segundoSumatoria= Integer.parseInt(segundoValor);
            }      
        }
        else
            System.out.println("El valor debe ser entero positivo");
        
        System.exit(0);
              
        
        
    }
    
    
}
