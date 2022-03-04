/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanManuel
 */
public class MatrizRecursiva {
    public static void main(String[] args) {

        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        //llamada inicial
        recorrerMatrizRecursivo(m, 0, 0);
        ImprimirMatriz (3,3,m);
    }

    public static void recorrerMatrizRecursivo(int[][] m, int i, int j) {

        //Muestro el numero (sin salto de linea)
        System.out.print(m[i][j] + " ");

        //
        if (i != m.length - 1 || j != m[i].length - 1) {

            //Indico si llego al final de la fila
            if (j == m[i].length - 1) {
                //Paso a la siguiente fila
                i++;
                //Reinicio la j
                j = 0;
                //Salto de linea (solo formato)
                System.out.println("");
            } else {
                //Paso a la siguiente columna
                j++;
            }

            //Volvemos a llamar la función recursivamente
            recorrerMatrizRecursivo(m, i, j);

        }
        
    } 
       	public static void ImprimirMatriz(int x, int y, int[][] Matriz) {
		if (x == 1) {
			ImprimirArreglo(y,Matriz[0]);//Se imprime la primera columna, primer caso
		}
		else {
			ImprimirMatriz(x-1,y,Matriz);//recursión
			System.out.println("");//Se separan las matrices
			ImprimirArreglo(y,Matriz[x-1]);//Se imprime la siguiente columna
		}
		
	}
	public static void ImprimirArreglo(int x, int[] Arreglo) {
		if(x==1) {
			System.out.print(Arreglo[0] + " ");//Se escribe el primer valor de la columna
		}
		else {
			ImprimirArreglo(x-1, Arreglo);//Recursión
			System.out.print(Arreglo[x-1]+ " ");//Se escribe el siguiente valor de la columna
		}
	}
}

    
