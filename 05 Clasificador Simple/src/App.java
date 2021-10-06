import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
 
        //Declarar variables para leer una nota
        //String para lo que ingresa el usuario
        //Int para las operaciones y almacenar la nota numerica
        
        String textoCalificacion;
        int calificacion;

        //Solicitar la calificación al usuario
        textoCalificacion = JOptionPane.showInputDialog(null, "Ingresar la calificación: ");

        //Convertir el textoCalificacion a entero y guardarlo en la variable calificacion
        calificacion = Integer.parseInt (textoCalificacion);

        //Preguntar Si la calificación del estudiante es mayor o igual a 60 
        // imprimir “Paso”

        if (calificacion >= 60 )  
            JOptionPane.showMessageDialog(null, "Paso");

        //Cerrar modo gráfico
        System.exit(0);

    }
}
