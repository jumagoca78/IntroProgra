/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juangonzalezcalleros
 */

    
    
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juangonzalezcalleros
 */
public class Fibonacci {    
    public static void main (String args []){
    
        //Calculo del factorial de un numero entero positvo o cero
        
        long factorial=1;
       
        String valor = JOptionPane.showInputDialog("Ingresa el valor del fibonacci a calcular: ");
        int valorInt = Integer.parseInt (valor);
        long fibonaccis []  = new long [valorInt+1]; //0 hasta n

        
        if (valorInt >=0){
            
            if (valorInt == 0) 
                JOptionPane.showMessageDialog (null, "El Fibonacci de " + valorInt +
                                                      " es: 0");   
            else if (valorInt == 1)
                    JOptionPane.showMessageDialog (null, "El Fibonacci de " + valorInt +
                                                      " es: 1");   
                    else
            {
                fibonaccis [0]=0;
                fibonaccis [1]=1;
                for (int i=2; i <= valorInt; i++){
                    fibonaccis [i]=fibonaccis [i-1]+fibonaccis [i-2];
                }
                
                JOptionPane.showMessageDialog (null, "El Fibonacci de " + valorInt +
                                                      " es: "+ fibonaccis[valorInt] );
            }
            
            String segundoValor = JOptionPane.showInputDialog("Te interesa un valorfactorial entre 1 y "+ valorInt+ " ingresa el valor o -1 para terminar");
            int segundoFactorial= Integer.parseInt(segundoValor);
            
            while (segundoFactorial >=0 || segundoFactorial<=valorInt){
                JOptionPane.showMessageDialog(null, "El nuevo factorial de " + segundoFactorial+ " es: "+
                        fibonaccis  [segundoFactorial]);
                segundoValor = JOptionPane.showInputDialog("Te interesa un valorfactorial entre 1 y "+ valorInt+ " ingresa el valor o -1 para terminar");
                segundoFactorial= Integer.parseInt(segundoValor);
            }      
        }
        else
            JOptionPane.showMessageDialog (null, "El valor debe ser entero positivo");
        
        System.exit(0);
              
        
        
    }
    
    
}

    

