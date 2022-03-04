
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
public class Factorial {
    
    public static void main (String args []){
    
        //Calculo del factorial de un numero entero positvo o cero
        
        long factorial=1;
       
        String valor = JOptionPane.showInputDialog("Ingresa el valor del factorial a calcular: ");
        int valorInt = Integer.parseInt (valor);
        long factoriales []  = new long [valorInt+1]; //0 hasta n

        if (valorInt >=0){
            
            if ((valorInt == 0) || (valorInt == 1))
                JOptionPane.showMessageDialog (null, "El factorial de " + valorInt +
                                                      " es: 1");   
            else 
            {
                
                for (int i=2; i <= valorInt; i++){
                    factoriales [i]=factoriales [i-1]+factoriales [i-2];
                }
                
                JOptionPane.showMessageDialog (null, "El factorial de " + valorInt +
                                                      " es: "+ factorial);
            }
            
            String segundoValor = JOptionPane.showInputDialog("Te interesa un valorfactorial entre 1 y "+ valorInt+ " ingresa el valor o -1 para terminar");
            int segundoFactorial= Integer.parseInt(segundoValor);
            
            while (segundoFactorial >=0 || segundoFactorial<=valorInt){
                JOptionPane.showMessageDialog(null, "El nuevo factorial de " + segundoFactorial+ " es: "+
                        factoriales [segundoFactorial]);
                segundoValor = JOptionPane.showInputDialog("Te interesa un valorfactorial entre 1 y "+ valorInt+ " ingresa el valor o -1 para terminar");
                segundoFactorial= Integer.parseInt(segundoValor);
            }      
        }
        else
            JOptionPane.showMessageDialog (null, "El valor debe ser entero positivo");
        
        System.exit(0);
              
        
        
    }
    
    
}
