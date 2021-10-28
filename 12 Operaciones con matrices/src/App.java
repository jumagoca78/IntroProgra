import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class App {
    public static void main(String[] args) throws Exception {
       
        //Declaracion de una matriz 

        int matriz1 [][]            = {{1,2,3},{4,5,6},{7,8,9} }};
        int matriz2 [][]            = new int [5][5];
        int matrizResultadoSuma[][] = new int [5][5];
        int matrizResultadoResta[][]= new int [5][5];

        //Para recorrer una matriz
        //Primero recorremos sus filas esto lo sabamos con el tamaño de una matriz
        //Luego para cada fila recorremos sus columnas

        //La matriz es la matriz identidad
        for (int i=0; i <= matriz1.length-1;i++){
            for (int j=0; j<=matriz1[i].length-1;j++ ){
                if (i==j){
                    matriz1[i][j]=1;
                }
                matriz2 [i] [j] = 1 + (int) (Math.random()*10);
            }
        }


        //Las operaciones de suma y resta, basicamente se suman o se restan los valores que hay en [i][j] directamente

        for (int i=0; i <= matriz1.length-1; i++){
            for (int j=0; j<=matriz1[i].length-1;j++){

                matrizResultadoSuma[i][j]  = matriz1[i][j]+ matriz2 [i][j];
                matrizResultadoResta[i][j] = matriz1[i][j]- matriz2 [i][j];
            }
        }




        //Imprimir las matrices
        String resultado="Matriz 1\n";
        //imprimir la matriz 1
        for (int i=0; i<=matriz1.length-1;i++){
            for (int j=0 ; j <= matriz1[i].length-1;j++){
                resultado += matriz1[i][j] + "\t";
            }
            resultado += "\n";
        }

        resultado +="Matriz 2\n";
        //imprimir la matriz 2
        for (int i=0; i<=matriz2.length-1;i++){
            for (int j=0 ; j <= matriz2[i].length-1;j++){
                resultado += matriz2[i][j] + "\t";
            }
            resultado += "\n";
        }

        resultado +="Matriz resultado suma\n";
        //imprimir la matriz resultado suma
        
        for (int i=0; i<=matrizResultadoSuma.length-1;i++){
            for (int j=0 ; j <= matrizResultadoSuma[i].length-1;j++){
                resultado += matrizResultadoSuma[i][j] + "\t";
            }
            resultado += "\n";
        }


        //calcular el resultado de sumar los valores de la diagonal
        //Lo alamacenamos en la variable suma de la diagonal
        int sumaDiagonal=0;

        for (int i =0 ; i <= matrizResultadoSuma.length-1;i++){
            for (int j=0; j <= matrizResultadoSuma[i].length;j++){
                if (i==j){
                    sumaDiagonal+=matrizResultadoSuma[i][j];
                }

            }
        }
        resultado+= "La suma de la diagonal de la matriz suma es: " +sumaDiagonal+ "\n";


        resultado +="Matriz resultado resta\n";
        //imprimir la matriz resultado suma
        for (int i=0; i<=matrizResultadoResta.length-1;i++){
            for (int j=0 ; j <= matrizResultadoResta[i].length-1;j++){
                resultado += matrizResultadoResta[i][j] + "\t";
            }
            resultado += "\n";
        }

        JTextArea textoSalida = new JTextArea();
        textoSalida.append(resultado);

        JOptionPane.showMessageDialog(null, textoSalida);

        System.exit(0);
        

    }
}
