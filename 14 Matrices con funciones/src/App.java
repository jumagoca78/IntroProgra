import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class App{
    public static void main(String[] args) throws Exception {
        double matriz1[][]=new double[3][3], matriz2[][]=new double[3][3], multiplicacionMatrices[][]=new double[3][3];
        String resultado; //cadenas de texto para almacenar el resultado de las operaciones
        
        Matrices.llenarMatrizAleatorios (matriz1, 1, 9);
        Matrices.matrizInversa(matriz1,matriz2);
        boolean resultadoMulti = Matrices.multiplicacionMatrices(matriz1,matriz2,multiplicacionMatrices);

        if (resultadoMulti==true){
            //Construyendo cadenas de salida con las matrices y sus títulos respectivos
            resultado=          Matrices.imprimir_matriz(matriz1, "Matriz original");
            resultado+= "\n"   + Matrices.imprimir_matriz(matriz2, "Matriz inversa");
            resultado+="\n" + Matrices.imprimir_matriz(multiplicacionMatrices, "Multiplicación (Matriz identidad)") ;
            //Concatenamos las cadenas de salida en un area de texto e imprimimos en un cuadro de dialogo
            JTextArea textoSalida=new JTextArea();
            textoSalida.append( resultado);
            JOptionPane.showMessageDialog(  null,
                                            textoSalida,
                                            "Operación de matrices",
                                            JOptionPane.PLAIN_MESSAGE);
            
        }
        else{
            JOptionPane.showMessageDialog(  null,
                                            "Error, no se puede multiplicar las matrices",
                                            "Mensaje error",
                                            JOptionPane.ERROR_MESSAGE);
        }
        //Cerramos modo grafico
        System.exit(0);
    }

    
}
