import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
      
        //Declaración de variables 
        //String para almacenar el texto que introduce el usuario textoCalificacion

        String textoCalificacion;

        //Intger para alamacenar la variable numérica de la nota

        int calificacion;

        //Solciitar al usuario ingresar el valor de la calificación y asignar el resultado en la variable textoCalificacion
        textoCalificacion = JOptionPane.showInputDialog(null
                                                        , "Ingresar la calificación del alumno: ");

        //Convertir la variable de texto "textoCalificacion" a numero entero y lo guardamos en la variable "calificacion"
        calificacion = Integer.parseInt(textoCalificacion);

        //Si la variable "calificacion"  es mayor o igual a 60
        //imprimir "estudiante aprobado" 
        if (  calificacion <=100) {
        
            if (calificacion >=60)
                  JOptionPane.showMessageDialog(null
                                        , "El estudiante aprobo");

            }
        else             
            JOptionPane.showMessageDialog(null
                                        , "La calificacion debe ser menor o igual a 100");

                                        

        System.exit(0);

    }
}
