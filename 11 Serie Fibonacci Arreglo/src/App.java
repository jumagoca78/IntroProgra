

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class App {
    public static void main(String[] args) throws Exception {
        String resultado = "# Los primeros 30 numeros de la serie fibonacci f(n)= f(n-1) + f(n-2)\n";
        resultado += "# f(0)= 0 y f(1)=1  \n";
        double arreglo[]= new double[51];
        
       //debemos inicializar los valores de f(0) = 0 y f(1)=1
       arreglo[0]=0;
       arreglo[1]=1;
        for (int i=2; i<=arreglo.length-1;i++){
            arreglo[i] = arreglo[i-1] + arreglo[i-2];
        }


        resultado += "0 \t 0 \t f(0)=0\n";
        resultado += "1 \t 1 \t f(1)=1\n";

        for (int i=2; i<=arreglo.length-1;i++)
        {
            resultado += i +"\t" + arreglo[i] + "\t f("+i+")= f("+ (i-1)+")+f("+(i-2)+")\t"+ (arreglo[i]/arreglo[i-1])+"\n";
        }

        String textoNumeroABuscar = JOptionPane.showInputDialog(null, "Ingresar el número de la serie a buscar:");
        int numeroABuscar = Integer.parseInt(textoNumeroABuscar);

        resultado += "El número de Fibonacci " + numeroABuscar + " es: "+ arreglo [numeroABuscar];

        
        JTextArea resultadoFIN = new JTextArea();
        resultadoFIN.append(resultado);
        JOptionPane.showMessageDialog(null, resultadoFIN);
        System.exit(0);
    }
}