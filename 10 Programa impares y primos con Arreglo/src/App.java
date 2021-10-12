import javax.lang.model.util.ElementScanner6;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
       //declarar un arreglo de tamaño n+1 donde m es igual a 20
       int arreglo [] = new int [101];

       //recorrer el arreglo desde 1 y hasta n-1 para determinar si el índice del arreglo es impar
        for (int i=1; i<= arreglo.length-1; i++){
            if (i % 2 != 0){
                arreglo [i] = 1;
            }
        }

        //Construir una cadena de salida
        String resultado= "Los numeros impares son: \n";

        //recorrer el arreglo para mostrar los números impares
        for (int i=1; i<= arreglo.length-1; i++){
            if (arreglo [i] == 1){
                resultado = resultado + i + ", ";
            }
                
        }

        //reccorrer el arreglo para determinar que numeros son primos
        //divisibles entre uno, entre ellos mismos
        //La estratagia es dividir el numero por otros numeros y si es divisible no es primo

        for (int i=1 ; i <= arreglo.length-1; i++)
        {
            //vamos a buscar los mumeros que dividen al indice i
            //Si encontramos uno significa que el numero no es primo
            // a menos que ese valor sea el mismo i
            for (int j=2; j<=i ; j++ )
            {
                if (i % j == 0){ //el numero es divisible por otro numero 
                    if (i == j){ //es divisible por el mismo entonces es primo
                        arreglo[i]= arreglo[i] + 2; //Significa es primo 
                    }
                    else
                        break;
                }

            }
        }

        //Agregamos contenido a la cadena de salida imprimir solo los primos
        resultado= resultado + "\n Los numeros primos son: \n";  
        //recorrer el arreglo para listar solo los primos
        for (int i=1; i <= arreglo.length-1 ; i++){
            if (arreglo[i]==2 || arreglo[i]==3){
                resultado = resultado + i + ", ";
            }
        }

        //agregamos contenido a la cadena de salida imprimir solo los primos e impares
        resultado = resultado + "\n Los numeros impares y primos son: \n";
        for (int i=1; i <= arreglo.length-1; i++){
            if (arreglo [i]==3){
                resultado = resultado + i +", ";
            }
        }

        //Comunicamos el resultado
        JOptionPane.showMessageDialog(null, resultado, "Numeros impares", JOptionPane.INFORMATION_MESSAGE);
        
        //salir del modo grafico
        System.exit(0);
        

    }
}
