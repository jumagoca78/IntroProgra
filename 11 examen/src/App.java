

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class App {
    public static void main(String[] args) throws Exception {
        String resultado = "# Los primeros 30 numeros de la serie f(n)= f(n-1)*2+1  \n";
        resultado += "# f(1)= 0  \n";
        int arreglo[]= new int[31];
        
       
        for (int i=2; i<=arreglo.length-1;i++){
            arreglo[i] = arreglo[i-1] *2 + 1;
        }


    
        for (int i=1; i<=arreglo.length-1;i++)
        {
            resultado += i +"\t" + arreglo[i] + "\t f("+i+")= f("+ (i-1)+")*2+1\n";
        }

        
        JTextArea resultadoFIN = new JTextArea();
        resultadoFIN.append(resultado);
        JOptionPane.showMessageDialog(null, resultadoFIN);
        System.exit(0);
    }
}