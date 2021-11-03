import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class App {
    public static void main(String[] args) throws Exception {
       
        //Declarar matrices

        int matriz1 [][] = {
                            {2,0,1},
                            {3,0,0},
                            {5,1,1}    
                          };

        int matriz2 [][] =  {
                             {1,0,1},
                             {1,2,1},
                             {1,1,0}   
                            };
                            
        int matrizResultado [][] = new int [matriz1.length][matriz2[0].length];

        

        for (int i=0; i<= matriz1.length-1; i++){
            for (int j=0; j<=matriz1[i].length-1;j++){
                int suma=0;
                for (int k=0; k<= matriz2.length-1;k++)
                {
                    suma+=matriz1[i][k] * matriz2[k][j];

                }

                matrizResultado [i][j]=suma;
            }
        }

        String resultado = "Resultado Multiplicación: \n";
        //Imprimir la matriz
        for (int i=0;i<=matrizResultado.length-1;i++){
            for (int j=0; j<=matrizResultado[0].length-1;j++){
                resultado += matrizResultado[i][j] + "\t";
            }
            resultado+="\n";
        }

        //Para manda r a imprimir usamos un area de texto
        JTextArea textoSalida= new JTextArea();
        textoSalida.append(resultado);
        
        JOptionPane.showMessageDialog(null, textoSalida);

       //Salir del modo gráfico 
       System.exit(0);     

    }
}
