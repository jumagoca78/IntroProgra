import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //Declaración de los numeros de mis operaciones
        int numero1, numero2;
        //Declaración de variable que almacena el resultado de las operaciones
        int resultadoSuma, resultadoResta, resultadoMult, resultadoDiv;

        //Solicitar al usuario ingresar los valores a traves de una ventana de dialogo
        String valor1= JOptionPane.showInputDialog( null
                                   ,"Ingresa el primer número: "); 
        
        try {
             numero1 = Integer.parseInt(valor1);  
        } catch (Exception e) {
          //TODO: handle exception
          numero1 = 0;
          JOptionPane.showMessageDialog( null
                                        , "El valor 1 ingresado  no es número"
                                        , "Error"
                                        , JOptionPane.ERROR_MESSAGE);
        }
        
        

        String valor2 = JOptionPane.showInputDialog( null
                                                   , "Ingresar el segndo valor: ");
        numero2 = Integer.parseInt(valor2);

        //Realizamos la suma de dos numeros
        resultadoSuma = numero1 + numero2;

        //Realizamos la resta de dos numeros
        resultadoResta = numero1- numero2;

        //Comunicamos el resultado de laa cuatro operaciones de dos numeros
        JOptionPane.showMessageDialog( null
                                     , "La suma de " + numero1 + " y " + numero2 + " es : " + resultadoSuma +
                                       "\nLa resta de " + numero1 + " y " + numero2 + " es : " + resultadoResta
                                     , "Suma de dos numeros"
                                     , JOptionPane.INFORMATION_MESSAGE);

        System.exit (0);

    }
}
