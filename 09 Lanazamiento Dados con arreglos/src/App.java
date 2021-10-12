import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        //Crrear un arreglo de tamaño 7 para guardar los valores de las seis caras del dado y lo que hay en indice 0 no le hacemos caso
        int arreglo [] =  new int [7];

        //Simular el lanzamiento del dado n veces

        for (int i=1 ; i <= 100000000; i++){
            //la ecuacion para simular el lanzamiento del dado es: numeroMimnimo + (int) random * numero de eventos aleatorios
            int caraDado = 1 + (int) (Math.random()*6); 

            //aumentamos el contador en el indice de la cara del dado
            arreglo [caraDado] ++;

        }

        //Mostrar los valores de los contadores
        String resultado = "Cara      Valor\n";

        //recorrer el arreglo y sacamos sus valores
        for (int i=1; i <= arreglo.length-1; i++){
            resultado = resultado + i + "              " + arreglo[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado, "Cara de los dados lanzados n veces", JOptionPane.ERROR_MESSAGE);

        System.exit(0);


    }
}
