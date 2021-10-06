import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        /*
            p - principal
            r – Porcentage del interés
            n – numero de años
            a – Suma del deposito al n_esimo año

        */
        double p=1000.0, r=0.05 , a=0.0;

        //Construir una cadena de salido con el resultado esperado
        String resultado = "Tu ahorro es: \n";

        //Clase de la libreearia de Java que me permite dar formato a texto con decimales
        DecimalFormat formato = new DecimalFormat("0.00");

         //Repetir 10 veces el calculo de interes bancario aplicando la formula
        //a = p (1 + r )^n
        for (int n =1; n <=10 ; n++ )
        {
            a= p * ( Math.pow(1+r, n) );
            resultado = resultado + "Año " + n + ": " + formato.format(a) + "\n";
        }

        //Comunicar el resultado acumulado
        JOptionPane.showMessageDialog(null, resultado);
        System.exit(0);

    }
}
