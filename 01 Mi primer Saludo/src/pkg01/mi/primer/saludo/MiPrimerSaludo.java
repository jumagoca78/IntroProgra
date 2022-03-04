/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.mi.primer.saludo;

/**
 *
 * @author JuanManuel
 */
import javax.swing.JOptionPane;

public class MiPrimerSaludo {
    public static void main(String[] args)  {
        
        //Declaracion de variable para guardar un nombre
        String nombre;

        //solicitamos al usuario escribir un nombre y lo asignamos a la variable nombre
        nombre = JOptionPane.showInputDialog(null, "Ingresa tu nombre");
        
        //se imprime en una ventana de dialogo el mensaje de bienvenida y asociado al nombre que leimos previamente
        JOptionPane.showMessageDialog(null, "Hola " + nombre + "\nBienvenido al \ncurso de java"); 

        System.out.println ("Hola " + nombre + "\nBienvenido al \ncurso de java");
        
        //anunciamos la terminaciom del programa
        System.exit(0);

    }
}
