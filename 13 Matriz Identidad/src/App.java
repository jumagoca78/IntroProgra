import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class App {
    public static void main(String[] args) throws Exception {
      
        //Declarar Matriz
        int matriz [][]= new int [4][4];

        //primero tenemos que revisar que la matriz sea cuadrada
        //tenemos el mismo numero de filas que de columnas
        if (matriz.length == matriz [0].length){

            //recorrer la matriz y poner 1 en la diagonal y 0 en cualquier otro caso

            for (int i=0 ; i<=matriz.length-1;i++){
                for (int j=0 ; j <= matriz[i].length-1; j++){
                    if (i==j){
                        matriz [i][j]=1;
                    }
                    else{
                        matriz [i][j]=0;
                    }
                }
            }


            //Mandar a imprimir el resultado
            String resultado="La matriz identidad es: \n";
            for (int i=0; i<=matriz.length-1; i++ ){
                for (int j=0; j <= matriz[i].length-1; j++){
                    resultado += matriz [i][j] + "\t";
                }
                resultado += "\n";
            }

            //USamos un TextArea para poder visualizar correctamente la matriz
            JTextArea textoSalida = new JTextArea ();
            textoSalida.append(resultado);



            JOptionPane.showMessageDialog(null, textoSalida);



        }

        else{

            JOptionPane.showMessageDialog(null, "La matriz no es cuadrada y en consecuencia no se puede convertir en matriz identidad");

        }

        System.exit(0);

    }
}
