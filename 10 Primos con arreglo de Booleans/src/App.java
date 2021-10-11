import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        //arreglo para guardar numeros primos
        boolean arregloPrimos [] = new boolean [100];

        String resultado ="";
        //recorrer los primeros 100 números naturales enteros y determinar si son o no primos
        for (int i=1 ; i<=arregloPrimos.length-1 ; i++){

            //determinar si hay algun numero que divide al valor i
            for (int j=2; j<=i; j++){
                if (i%j==0)
                {
                   if (i==j)
                        {
                            arregloPrimos [i] = true;
                        
                        }
                   else   //Sino son iguales significa que el numero es divisible por algun otro
                        break;
                }
            }

        }

        //Recorremos el arreglo con los numeros primos
        for (int i=0 ; i <= arregloPrimos.length-1; i++){
            if ( arregloPrimos[i] == true)
                resultado = resultado + i +"\n"; //Si los numero son iguales el valor es primo
        }

        //Comunicamos el resultado
        //JOptionPane.showMessageDialog(null, resultado, "Numeros primos", JOptionPane.INFORMATION_MESSAGE);

        //Cerramos el modo grafico
        //System.exit (0);

    }
}
