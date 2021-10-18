import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
    
        //Llenar un arreglo de numero aleatorios entre 1 y 20

        //declaramos el arreglo
        int arreglo [] = new int [20];
        
        //Construir una cadena de salida
        String resultado = "Los numeros del arreglos son: \n";

        //Recorremos el arreglo y lo llenamos de los 20 enteros y los mostramos
        for (int i=0; i <= arreglo.length-1; i++){
            arreglo[i]= 1 + (int) (Math.random()*20);
            resultado += i + "       " + arreglo[i] + "\n";

        }

        //Preguntar al usuario el número a buscar
        String textoNoABuscar = JOptionPane.showInputDialog(null, resultado+ "¿Que numeor buscas?");
        int noABuscar = Integer.parseInt (textoNoABuscar);

        //La busqueda nos dice buscar uno por uno en los elementos de un arreglo hasta acabar o encontrar el numero
        //si acabamos de recorrer el arreglo significa que no esta el numero lo vamos a indicar con el valor -1
        //sino encontramos el numero y conoceremos el índice donde esta el numero

        int indiceValor = -1; //esto significa que no encontre el numero         

        for (int i=0 ; i <= arreglo.length-1 ; i++){
            if (noABuscar == arreglo[i]){
                indiceValor =i; //cambio este valor y significa que ya encontre el numero
                break; //terminar antes de tiempo la ejecución del ciclo for
            } 
        }

        if (indiceValor == -1){
            JOptionPane.showMessageDialog(null, resultado+ "No encontramos el numero");
        }
        else {
            JOptionPane.showMessageDialog(null, resultado+"Si encontre el numero en el indice " + indiceValor);
        }
       
        //Cerramos modo gráfico
        System.exit(0);


    }
}
