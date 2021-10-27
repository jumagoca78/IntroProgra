import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {


        //Declaramos dos arreglos
        int arreglo1 [] = {2,4,6,8,10};
        int arreglo2 [] = {1,3,5,7,9};

        if (arreglo1.length==arreglo2.length){
            //Declaramos los arreglos que van a guardar el resultado
            int arregloSuma []  = new int [arreglo1.length];
            int arregloResta[]  = new int [arreglo1.length];
            int arregloMult []  = new int [arreglo1.length];
            int arregloDiv  []  = new int [arreglo1.length]; 

            for (int i = 0; i <= arreglo1.length-1; i++){
                arregloSuma [i] = arreglo1[i] + arreglo2[i];
                arregloResta[i] = arreglo1[i] - arreglo2[i];
                arregloMult [i] = arreglo1[i] * arreglo2[i];

                //revisar para la divion que no hagamos operaciones de diviión por cero

                if (arreglo2[i]!=0){
                    arregloDiv[i] =  arreglo1[i] / arreglo2[i];
                }

            }

            //Construimos la cadena de texto de resultado
            String resultado = "Arreglo 1 \n";
            for (int i = 0 ; i <=  arreglo1.length-1; i++){
                resultado += arreglo1[i] + ", "; 
            }

            resultado += "\nArreglo 2 \n";
            for (int i = 0 ; i <=  arreglo2.length-1; i++){
                resultado += arreglo2[i] + ", "; 
            }

            resultado += "\nResultado de la suma de los dos arreglos \n";
            for (int i = 0 ; i <=  arregloSuma.length-1; i++){
                resultado += arregloSuma[i] + ", "; 
            }

            resultado += "\nResultado de la RESTA de los dos arreglos \n";
            for (int i = 0 ; i <=  arregloResta.length-1; i++){
                resultado += arregloResta[i] + ", "; 
            }

            resultado += "\nResultado de la multiplicación de los dos arreglos \n";
            for (int i = 0 ; i <=  arregloMult.length-1;i++){
                resultado += arregloMult[i] + ", "; 
            }

            resultado += "\nResultado de la División de los dos arreglos \n";
            for (int i = 0 ; i <=  arregloDiv.length-1; i++){
                resultado += arregloDiv[i] + ", "; 
            }

            JOptionPane.showMessageDialog(null, resultado);

        }

        else {
            JOptionPane.showMessageDialog(null, "Los arreglos no tienen el mismo tamaño");
        }

        //Cerrramos el modo gráfico
        System.exit(0);





    }
}
