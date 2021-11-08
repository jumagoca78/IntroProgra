import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class App {
    public static void main(String[] args) throws Exception {
        
        imprimir_saludo("Este es el primer mensaje");

        int matriz [][]= new int [4][4];

        llenar_matriz_aleatorios(matriz, 1, 100);
        
        imprimir_matriz(matriz);
             
        llenar_matriz_aleatorios(matriz, -10, 20);

        imprimir_matriz(matriz);
        
    }

    public static void imprimir_saludo( String saludo ) {

        JOptionPane.showMessageDialog(null, saludo);
    }

    public static void llenar_matriz_aleatorios ( int matriz[][], int min, int intervalo){
        for (int i=0; i<= matriz.length-1;i++){
            for (int j=0; j<= matriz[i].length-1;j++){
                matriz [i][j]= min+ (int) (Math.random()*intervalo);
            }
        }

    }

    public static void imprimir_matriz ( int matriz[][]){
        String textoSalida="";
        for (int i=0; i<=matriz.length-1;i++ ){
            for (int j=0; j<= matriz[i].length-1;j++){
                textoSalida+= matriz [i][j] + "\t";
            }
            textoSalida += "\n";
        }
        JTextArea areaTexto = new JTextArea();
        areaTexto.append(textoSalida);
        JOptionPane.showMessageDialog(null, areaTexto);
    }
}
