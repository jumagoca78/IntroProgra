/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15.factorial;

/**
 *
 * @author JuanManuel
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 10;
        int factorial = calcularFactorial(n);
        System.out.println("El factorial de "+ n+ " es: "+ factorial);
    }
    
    //función recursiva de calcular el Factorial de un número n
    public static int calcularFactorial (int n){
        if ((n ==0) || (n==1))
            return 1;
        else 
            return n * calcularFactorial (n-1); 
    }
    
    //factorial con un for
    public static int factorial (int n){
        if (n>=0){
        int factorial =1;
            for (int i=1;i<=n;i++ ){
                factorial *= i;
            }
        return factorial;    
        }
        return -1;
    } 
    
}
