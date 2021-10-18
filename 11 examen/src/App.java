

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class App {
    public static void main(String[] args) throws Exception {
        String resultado = "# Los primeros 30 numeros de la serie f(n)= f(n-1)+f(n-2)  \n";
        resultado += "# f(0)= 0 f(1)=1  \n";
        double arreglo[]= new double[41];
        arreglo[1]=1;
        for (int i=2; i<=arreglo.length-1;i++){
            arreglo[i] = arreglo [i-1]+ arreglo [i-2];
        }


    
        for (int i=2; i<=arreglo.length-1;i++)
        {
            double convergenciaFibo =  arreglo[i]/arreglo[i-1];
            resultado += i +"\t" + arreglo[i] +"\t" + convergenciaFibo + "\n";
        }

        //Operaciones de búsqueda
        // Solicitar al usuario que número quiere de la serie
        String textoNoSerie = JOptionPane.showInputDialog(null, "Ingresar numero de la serie que desea consultar");
        int noSerie = Integer.parseInt (textoNoSerie);

        resultado += "El numero" + noSerie + " es: " + arreglo[noSerie];

        JTextArea resultadoFIN = new JTextArea();
        resultadoFIN.append(resultado);
        JOptionPane.showMessageDialog(null, resultadoFIN);
        System.exit(0);
    }
}