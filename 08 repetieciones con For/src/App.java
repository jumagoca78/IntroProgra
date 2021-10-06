import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class App {
    public static void main(String[] args) throws Exception {
        
        int p = 1000;
        double r = 0.05;
        int n =10;
        double a=0.0;

        String resultado ="";
        DecimalFormat precisionDos = new DecimalFormat("0.00");

        for (int i=1; i<=n; i++){
            a=p*(Math.pow(1+r,i));
            resultado = resultado + "Año " + i + " mi ahorro: " + precisionDos.format(a) + "\n"; 
        }

        JOptionPane.showMessageDialog(null, resultado);

    }
}
