import java.text.DecimalFormat;

public class Matrices {

    //Funcion que dada una matriz guarde su inversa en otra matriz
    public static void matrizInversa (double matriz1[][], double matriz2[][]){
        for (int i=0; i <= matriz1.length-1;i++){
            for (int j=0; j<=matriz1[i].length-1;j++){
                if(i==j){
                    matriz2[i][j]=1/matriz1[i][j]; 
                }
                else{
                    matriz2[i][j]=0; 
                }
            }
        }
        
    }
    
    //Funcion que llena de aleatorios una matriz en un rango de valores
    public static void llenarMatrizAleatorios (double matriz [][], int min, int rango){
        for (int i=0; i <= matriz.length-1;i++){
            for (int j=0; j<=matriz[i].length-1;j++){
                matriz[i][j]=min+(int)(Math.random()*rango);
            }
        }
    }

    //Funcion que multiplica matrices
public static boolean multiplicacionMatrices (double matriz1[][], double matriz2[][], double multiplicacionMatrices[][]){

    boolean operacionExitosa = true;
    //Para poder multiplicar matrices se debe cumplir que el numero de columnas de la matriz1 es igual al numero de filas de la matriz 2  
    if (matriz1[0].length==matriz2.length){
        for (int i=0; i<= matriz1.length-1; i++){
            for (int j=0; j<=matriz1[i].length-1;j++){
                int suma=0;
                for (int k=0; k<= matriz2.length-1;k++){
                    suma+=matriz1[i][k] * matriz2[k][j];
                }
            multiplicacionMatrices [i][j]=suma;
            }
        }  
    }
    else{
        operacionExitosa = false;
    }
    return operacionExitosa;
}

    //Funcion que construye una cadena de texto con un titulo y una matriz
    public static String imprimir_matriz (double matriz[][], String titulo ){

        String resultado=titulo+"\n";
        DecimalFormat formatoDecimales=new DecimalFormat("0.00");

        for (int i=0; i <= matriz.length-1;i++){
            for (int j=0; j<=matriz[i].length-1;j++){
                resultado+=formatoDecimales.format(matriz[i][j])+"\t";
            }
            resultado+="\n";
            }
        return resultado;    
    }


  
    
    
}
