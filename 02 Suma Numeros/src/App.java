import javax.swing.JOptionPane;

/*
Autor: Juan Gonzalez
Descripción programa:
Este es una programa que suma dos numeros que son ingresados a traves de ventanas de dialogo
El resultado se muestra igual en una ventana de dialogo (JOptionPane)
*/

public class App {
    public static void main(String[] args) throws Exception {
        
        //variables de tipo cadena (texto) para guardar lo que ingresa el usuario en las cajas de dialogo
        

        // Ventana de dialogo para solicitar el primer valor de la suma y guardarlo en la variable valor1
        String valor1=JOptionPane.showInputDialog(null
                                   , "Ingresar el valor del numero 1:");
        // Ventana de dialogo para solicitar el segundo valor de la suma y guardarlo en la variable valor2
        String valor2=JOptionPane.showInputDialog(null
                                   , "Ingresar el valor del numero 2:");

        //declaracion y asignacion de los numeros a sumar                            
        int numero1;
        int numero2;

        //Try catch nos permite gestionar errores y aqui lo usamos para revisar si el texto corresponde a un numero
        //en caso contrario (ctach) evitamos que el programa se interrumpa y mandamos un mensaje y asignamos un valor a la varible numero
        try {
            numero1 = Integer.parseInt(valor1);
            
            
        } catch (Exception e) {
            //TODO: handle exception
            JOptionPane.showMessageDialog(null
                                          , "El valor 1 no es numerico, recuerda ingresar valores enteros"
                                          , "Mensaje de error"
                                          , JOptionPane.ERROR_MESSAGE);
            numero1=0;

        }

        try {
            numero2 = Integer.parseInt(valor2); 
        } catch (Exception e) {
            //TODO: handle exception
            JOptionPane.showMessageDialog(null
                                          , "El valor 2 no es numerico, recuerda ingresar valores enteros"
                                          , "Mensaje de error"
                                          , JOptionPane.ERROR_MESSAGE);
            numero2=0;
        }
          
            


        //Variable que guarda el resultado de la suma
        int suma = numero1+numero2; 


        // Ventana de dialogo para comunicar el resultado de la suma        
        JOptionPane.showMessageDialog(  null
                                      , "La suma de " + numero1 + " + " + numero2 + " es: " + suma
                                      , "Suma de numeros"
                                      , JOptionPane.INFORMATION_MESSAGE);

        //Cerrar el modo grafico de Java
        System.exit (0);


    }
}
