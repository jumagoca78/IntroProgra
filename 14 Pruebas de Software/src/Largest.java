//Este nuevo programa me va a servir para crear juna función que busca el número más grande en un arreglo

public class Largest{

    public static int largest (int [] arreglo){
        int    max= Integer.MIN_VALUE;//Hay que inicializar con el valor más pequeño posible cuando buscamos el numero mas grande

        //Vamos a recorrer el arreglo buscando el numero mas grande, comparando cada elemento del arreglo con el valor de la
        //variable max y cuando acabemos de recorrer el arreglo la variable max nos indica el numero más grande

        for (int i=0; i<=arreglo.length-1; i++ ){
            if (arreglo[i]> max){
                max=arreglo[i];
            }

            //mejor regresamos el numero mas grande del arreglo y nos olvidamos del indice :)
        }
        return max;

    }

}