import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
       
        int total = 0;
        double promedio = 0.0;
        String textoCalificacion;
        int calificacion;
        int numeroAlumnos=3;
        int n=1;   // variable de control del ciclo while



        while (n<=numeroAlumnos){
            textoCalificacion=JOptionPane.showInputDialog(null, "Ingresar Calificacion");
            calificacion = Integer.parseInt(textoCalificacion);

            if (calificacion <=100 && calificacion >=0){
                total = total + calificacion;
                n++;
               }
            else     
                JOptionPane.showMessageDialog(null , "Error el número debe ser entre 0 y 100" );

        }

        promedio = total / numeroAlumnos;
        JOptionPane.showMessageDialog(null , "El promedio es " + promedio);
        System.exit(0);
    }
}
