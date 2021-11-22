public class Largest {
    
    public static int largest (int [] arreglo){
        int    max= Integer.MIN_VALUE;//El número entero más grande que puede tener mi equipo
        //Vamos a recorrer el arreglo buscando el numero mas grande, comparando cada elemento del arreglo con el valor de la
        //variable max y cuando acabemos de recorrer el arreglo la variable max nos indica el numero más grande

        for (int i=0; i<arreglo.length; i++ ){
            if (arreglo[i]> max){
                max=arreglo[i];
            }

            //mejor regresamos el numero mas grande del arreglo y nos olvidamos del indice :)
        }
        return max;

    }

}
