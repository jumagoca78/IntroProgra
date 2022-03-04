/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15.alcance.funciones;

/**
 *
 * @author JuanManuel
 */
public class AlcanceFunciones {

    /**
     * @param args the command line arguments
     * 
     */
    
    static int x=1; //variable global y tiene un alcance 
             //  en todo el programa a menos que en una 
             //funcion otra variable x  
    
    public static void main(String[] args) {
        // TODO code application logic here
        inicio();
        
    }
    
    
    public static void inicio(){
        int x = 5; //variable local de la función inicio
        System.out.println ("\n En esta funcion inicio x blobal vale :" + AlcanceFunciones.x); 
        metodoA();// metodo A tiene una variable local x
        metodoB();//metodo B usa la variable global x
        metodoA();//El metodo a se reinicia el uso de la variable x
        metodoB();//volvemos a usar la variable global
        
        System.out.println ("\n En esta funcion inicio x vale :" + x);
        System.out.println ("\n En esta funcion inicio x global al final  vale :" + AlcanceFunciones.x); 
    }
    
    //en este metodo usamos una variable local 
    //su alcancew solo es en esta función
    public static void metodoA(){
        int x=25;
        
        System.out.println("\n En esta funcion metodoA x vale :" + x);
        
        x++;
        System.out.println("\n Despues de manipular x en el metodoA x vale :" + x +
                           " y aquí acaba la funcion metodo A" );
    }
    
    //Vamos a ilustrar el alcance de una variable global 
    //dentro de una funcion
    
    public static void metodoB (){
        System.out.println("\n En esta funcion metodoB x vale :" + x);
        
        x= x+10;
        
        System.out.println("\n Despues de manipular x en el metodoB x vale :" + x +
                           " y aquí acaba la funcion metodo B" );
    }
}
