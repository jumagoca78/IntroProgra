import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class App {
    public static void main(String[] args) throws Exception {
        
        
          int arreglo [] = new int [7];

        //Solicitar el numero de repeticiones que queremos   
        String textoNumeroLanzamientos;
        int numeroLanzamientos;

        textoNumeroLanzamientos = JOptionPane.showInputDialog(null, "¿Cuántas veces lanzamos el dado?");
        numeroLanzamientos = Integer.parseInt(textoNumeroLanzamientos);

        //repetir tantas veces como lo requiere el usuario
        for (int i=1 ; i <= numeroLanzamientos; i++){
            //Generar número aleatorio entre 1 y 6
            int aleatorio = 1 +  (int) (Math.random()*6); // valorMin + random()*NumEventos
            
            arreglo [aleatorio]++;
            }
        
        //Construir la salida del programa
        String textoResultado = "Face \t Frequency \n";

        //REcorremos el arreglo
        for (int i=1; i<=arreglo.length-1;i++)
        {
            textoResultado = textoResultado + "Cara " + i + "\t" + arreglo[i] + "\n" ;
        }

        
        //Ponemos todo en un area de texto
        JTextArea resultadoAreaTexto = new JTextArea(7, 20); // definimos que queremos 7 filas y 20 columnas
        resultadoAreaTexto.append(textoResultado);  //Agregamos nuestra cadena de texto al resultado

        //Comunicamos el resultado en la pantalla con una caja de dialogo
        JOptionPane.showMessageDialog(null, resultadoAreaTexto);
        System.exit(0);

    }
}
