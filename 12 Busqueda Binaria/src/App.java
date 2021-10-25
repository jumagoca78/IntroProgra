import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {


           //arreglo
        int arreglo [] = new int [20];

        //llenar de numeros aleatorios el arreglo entre 1 y 100

        for (int i=0; i< arreglo.length-1; i++){
            arreglo [i]= 1+ (int) (Math.random()*100);
        } 

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
       

        /*
            Compara el valor a la mitad del arreglo
            Si es igual, ya encontró el valor
            Si el valor  < medio, busca en la primera mitad del arreglo
            Si el valor  > mitad, busca en la segunda parte del arreglo
            Repetir

        */
        String textoNumeroABuscar= JOptionPane.showInputDialog(null, "Ingresa el numeroa buscar");
        int numeroABuscar = Integer.parseInt(textoNumeroABuscar);

        //indices para saber el fragmento del arreglo que estoy analizando
        int bajo = 0;
        int alto = arreglo.length-1;
        int medio;

        int contadorDePasosDeBusqueda=0; 

        while (bajo <=alto){
            medio = (alto+bajo)/2;
            contadorDePasosDeBusqueda++;

            if (numeroABuscar == arreglo[medio]){
                resultado += "\nEncontramos el valor en el índice "+medio;
                resultado += "\nEl algoritmo se ejecuto  "+ contadorDePasosDeBusqueda + " veces";
                break;
            }


            else if (numeroABuscar > arreglo [medio]){
                bajo= medio+1;
                }
                else {
                    alto = medio -1;
                }
                
        }    

        if (bajo > alto){
            resultado += "\n El numero no esta en el arreglo";
            resultado += "\nEl algoritmo se ejecuto  "+ contadorDePasosDeBusqueda + " veces";


        }

        JOptionPane.showMessageDialog(null, resultado);

        //Cerramos modo grafico
        System.exit(0); 

    }
}
