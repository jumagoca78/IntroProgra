import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
       
        int total = 0;            //total acumulado de calificaciones
        double promedio = 0.0;    //promedio de calificaciones
        String textoCalificacion; //texto ingresado con la calificación
        int calificacion;    //variable que guarda la calificacion
        int numeroAlumnos=0; // Contador de alumnos



        //Pedir las calificaciones, sacar el promedio y terminar cuando el usuario ingrese -1 como calificación.

        do{
            textoCalificacion = JOptionPane.showInputDialog(null, "Ingresar calificación: ");
            calificacion = Integer.parseInt(textoCalificacion);

            //Verificamos si la nota no es -1 entonces acumulamos la nota y agregamos un alumno al contador
            if (calificacion != -1){
                total = total + calificacion;
                numeroAlumnos ++;
            }
        }
        while (calificacion != -1); //Repetimos hasta que la calificación sea -1


        //Si hay alumnos calculamos el promedio y lo comunicamos
        if (numeroAlumnos >0){
            promedio = total / numeroAlumnos;
            JOptionPane.showMessageDialog(null , "El promedio es " + promedio);
        }
        
        //Si no hay alumnos es decir numeroAlumnos es cero
        else 
            JOptionPane.showMessageDialog(null , "No hay alumnos");
        
        System.exit(0);
    }
}
