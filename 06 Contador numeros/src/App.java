import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
      
        //Hacer un programa que dados 10 números sumar solo los positivos

        //Declarar las variables de almacenamiento de los 10 numeros enteros naturales
        int numero1, numero2, numero3, numero4, numero5, numero6, numero7, numero8, numero9, numero10;

        int sumaPositivos=0, sumaNegativos=0;

        //Solicitar al usuario el minimo y maxio del rango de aleatorios
        String textoMin, textoMax;

        textoMin = JOptionPane.showInputDialog(null, "Ingresar el valor mínimo: " );
        textoMax = JOptionPane.showInputDialog(null, "Ingresar el valor máximo: " );

        //Declarar variable min max y convertir texto a entero y asignalo a la variables
        int min, max;

        min = Integer.parseInt(textoMin);
        max = Integer.parseInt(textoMax);

        //Generar numeros aleatorios -200 y 200 y asignarlo a cada variable 
        numero1 = min + (int) (Math.random()*(max-min));

        numero2 = min + (int) (Math.random()*(max-min));

        numero3 = min + (int) (Math.random()*(max-min));

        numero4 = min + (int) (Math.random()*(max-min));

        numero5 = min + (int) (Math.random()*(max-min));

        numero6 = min + (int) (Math.random()*(max-min));

        numero7 = min + (int) (Math.random()*(max-min));

        numero8 = min + (int) (Math.random()*(max-min));

        numero9 = min + (int) (Math.random()*(max-min));

        numero10 = min + (int) (Math.random()*(max-min));


        // Determinar si un numero es positivo sumar sino sumar los negativos
        
        if (numero1>=0)
            sumaPositivos = sumaPositivos + numero1;
        else 
            sumaNegativos = sumaNegativos + numero1;

        
        if (numero2>=0)
            sumaPositivos = sumaPositivos + numero2;
        else 
            sumaNegativos = sumaNegativos + numero2;

        
        if (numero3>=0)
            sumaPositivos = sumaPositivos + numero3;
        else 
            sumaNegativos = sumaNegativos + numero3;

        
        if (numero4>=0)
            sumaPositivos = sumaPositivos + numero4;
        else 
            sumaNegativos = sumaNegativos + numero4;

        
        if (numero5>=0)
            sumaPositivos = sumaPositivos + numero5;
        else 
            sumaNegativos = sumaNegativos + numero5;

            
        if (numero6>=0)
            sumaPositivos = sumaPositivos + numero6;
        else 
            sumaNegativos = sumaNegativos + numero6;
     
        if (numero7>=0)
            sumaPositivos = sumaPositivos + numero7;
        else 
            sumaNegativos = sumaNegativos + numero7;
        
        if (numero8>=0)
            sumaPositivos = sumaPositivos + numero8;
        else 
            sumaNegativos = sumaNegativos + numero8;

        if (numero9>=0)
            sumaPositivos = sumaPositivos + numero9;
        else 
            sumaNegativos = sumaNegativos + numero9;

                  
        if (numero10>=0)
            sumaPositivos = sumaPositivos + numero10;
        else 
            sumaNegativos = sumaNegativos + numero10;

        
        //comunicar el resultado    
        JOptionPane.showMessageDialog(null
                                     ,"Numero 1: " + numero1 +
                                      "\nNumero 2: " + numero2 +
                                      "\nNumero 3: " + numero3 +
                                      "\nNumero 4: " + numero4 +
                                      "\nNumero 5: " + numero5 +
                                      "\nNumero 6: " + numero6 +
                                      "\nNumero 7: " + numero7 +
                                      "\nNumero 8: " + numero8 +
                                      "\nNumero 9: " + numero9 +
                                      "\nNumero 10: " + numero10 +
                                      "\nResultado suma de positivos es: " + sumaPositivos+
                                      "\nResultado suma de negativos es: " + sumaNegativos
                                      , "Suma de enteros"
                                     , JOptionPane.INFORMATION_MESSAGE);

        //cerramos el modo gráfico
        System.exit(0);
    }
}
