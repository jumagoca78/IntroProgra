import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class App {
    public static void main(String[] args) throws Exception {
       
        //Declaramos e inicializamos un arreglo

        double arreglo [];
        arreglo = new double [20];


        String salida = "Indice \t  Valor \n"; 
       
        DecimalFormat formato;
        formato = new DecimalFormat("0.0000");

        for (int i=0 ; i<= arreglo.length-1; i++)
        {
            arreglo[i] = 0.0 + (Math.random()*100.0);
            salida = salida + i + "\t" + formato.format(arreglo[i]) + "\n";
        }

        JTextArea salidaConFormato = new JTextArea(11,10);
        salidaConFormato.append(salida);
        JOptionPane.showMessageDialog(null, salidaConFormato, "Contenido de un arreglo", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);


    }
}
