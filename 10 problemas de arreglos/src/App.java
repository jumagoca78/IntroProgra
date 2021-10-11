import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Declarmaos un arreglo de tamaño 50 para almacenar el valor mis 50 impares que tengo entre 1 y 100
        int arregloImpares [] = new int [50];
        
        //Recorrer el contenido de un arreglo de 50 valores 
        for (int i=0; i<=arregloImpares.length-1;i++){
            arregloImpares [i] = (i*2)+1; //ecuación para calcular el número impar 
        }

        //Recorrer el arreglo para mostrarlo
        String resultado = "Indice \t Impar\n";

        //recorrer el arreglo para construir la cadena de texto de salida
        for (int i=0; i<=arregloImpares.length-1; i++){
            resultado = resultado + i + "\t" + arregloImpares[i] + "\n";
        }

        //Ponemos nuestra cadena en un arae de texto
        JTextArea textoConFormato = new JTextArea();
        textoConFormato.append(resultado);

        //Mostramos el resultado
        JOptionPane.showMessageDialog(null, resultado, "Numeros Impares", JOptionPane.INFORMATION_MESSAGE);

        //Cerramos modo gráfico
        System.exit(0);


    }
}
