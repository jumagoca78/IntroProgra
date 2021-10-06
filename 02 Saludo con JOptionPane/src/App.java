import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        //Variable usada para almacenar el nombre de una persona
        String nombre="Juan"; 

        //Usamos JOptionPane para solicitar al usuario ingresar su nombre 
        //Asignamos el texto que introduce el usuario en la variable nombre
        nombre= JOptionPane.showInputDialog(   null
                                             , "¿Cómo te llamas?"
                                             );

        //Comunicamos un saludo usando la variable nombre
        System.out.println("Hola " + nombre);
        JOptionPane.showMessageDialog( null
                                     , "Hola " + nombre
                                     , "Saludo"
                                     , JOptionPane.PLAIN_MESSAGE);

        System.exit(0);
    }
}

