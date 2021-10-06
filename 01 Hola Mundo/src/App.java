import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args)  {
        
        
        //Declaracion de variable para guardar un nombre
        String nombre;

        //solicitamos al usuario escribir un nombre y lo asignamos a la variable nombre
        nombre = JOptionPane.showInputDialog(null, "Ingresa tu nombre");
        
        //se imprime en una ventana de dialogo el mensaje de bienvenida y asociado al nombre que leimos previamente
        JOptionPane.showMessageDialog(null, "Hola " + nombre + "\nBienvenido al \ncurso de java"); 

        //anunciamos la terminaciom del programa
        System.exit(0);

    }
}
