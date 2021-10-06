import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {
        int arregloEnteros [] = new int [1000];
        String resultado="";
        int sumaEnteros=0;

        for (int i=0 ;i< arregloEnteros.length;i++){
            arregloEnteros [i]= 1 + (int) (Math.random () * 9); 
            resultado = resultado + "Num" + i + ": " + arregloEnteros [i] + "\n";
            sumaEnteros= sumaEnteros + arregloEnteros [i];
        }

        resultado =resultado + "\n"+ "La suma es: " + sumaEnteros;
        
        Font font = new Font("Segoe Script", Font.BOLD, 20);
        JTextArea areaTexto = new JTextArea (25, 10);
        areaTexto.setFont(font);
        areaTexto.setForeground(Color.BLUE);
        
        areaTexto.append(resultado);
        JScrollPane barra= new JScrollPane (areaTexto);
        


        JOptionPane.showMessageDialog(null, barra);

        System.exit(0);
     }
}

