public class Arreglo {
    
    //llenar arreglo de aleatorios
    public static void llenarArregloAleatorios (int arreglo [], int min, int max){
        for (int i=0; i <= arreglo.length-1;i++){
            arreglo [i] = min + (int) (Math.random()*max);
        }
    }

    public static String impirmirArreglo (int arreglo [], String titulo){
        String resultado = titulo + "\n";
        for (int i=0; i <= arreglo.length-1;i++){
            resultado += arreglo[i]+", ";
        }

        return resultado;
    }

}
