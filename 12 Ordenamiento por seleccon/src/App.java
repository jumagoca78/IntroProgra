import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
       
        //arreglo
        int arreglo [] = {34, 67, 32, 45, 34};

        //Aplicamos el algoritmo de seleccion para ordenar un arreglo
        /*
        Consiste en encontrar el menor de todos los elementos del arreglo e intercambiarlo con el que está en la primera posición. Luego el segundo mas pequeño, y así sucesivamente hasta ordenarlo todo.
        Su funcionamiento se puede definir de forma general como:
        Buscar el mínimo elemento entre una posición i y el final de la lista.
        Intercambiar el mínimo con el elemento de la posición i
        */
        int posicion;
        for (int i=0; i <= arreglo.length-2 ; i++){
            posicion = i;

            for (int j=i+1; j <= arreglo.length-1; j++){
                if (arreglo [posicion] > arreglo [j]){
                    posicion = j;
                }
            }
            if (posicion != i){
                int temp = arreglo [i];
                arreglo [i] = arreglo [posicion];
                arreglo [posicion] = temp;
            }
        }

        //Imprimir el resultado
        String resultado = "Arreglo ordenado \n";
        for (int i = 0; i <= arreglo.length-1; i++){
            resultado += arreglo [i] + ", ";
        }

        JOptionPane.showMessageDialog(null, resultado);

        //Cerramos modo grafico
        System.exit(0);



    }
}
