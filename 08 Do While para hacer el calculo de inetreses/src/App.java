import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/*

Hacer un  programa que vaya calculando año con año los intereses bancarios de un  deposito
La formalu para calcular el interes bancario esta dada por:
a = p    (1 + r )^n    
    p *  ( Math.pow (base, potencia) )    
    p *  ( Math.pow (1+r, n) )

Donde: 
p - principal o el dinero a ahorrrar
r – Porcentage del interés
n – numero de años invertidos
a – Suma del deposito al n_esimo año

Vamos a mostrar el resultado de esta ecacion en 10 años
Probar con un ahorro de 1000, un interes de 5% y calcular el ahorro en 10 años
*/

public class App {
    public static void main(String[] args) throws Exception {
        
        //Repetir 10 veces el calculo de la operación a = p (1 + r )^n 
        double p = 1000.0, r=0.05;
        double a;

        //Variable para enmascarar el formato del resultado con solo dos decimales
        DecimalFormat formato;
        formato = new DecimalFormat("0.00"); //0.326565  --> 0.33

        //Variable para enmascarar el  valor del año con dos digitos
        DecimalFormat formatoYear;
        formatoYear = new DecimalFormat("00");

        //Definir una variable de tipo area de texto JTextArea
        JTextArea resultado;
        resultado = new JTextArea();
        resultado.append("Año \t  Ahorro\n");

       //Declaración e iniciización de variable de control 
       int i=1;

        do{
            a = p *  ( Math.pow (1+r, i) ); 
            resultado.append(formatoYear.format(i) + "\t" + formato.format(a) + "\n"); 
            i++; //incremento de variable de control

        } while (i<=10); //Repetir 10 veces
 
        JOptionPane.showMessageDialog(null, resultado);
        System.exit(0);

    }
}
