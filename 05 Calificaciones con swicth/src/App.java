import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
         //Solcitar al usuario una nota por letra y según la letra indicar en México el rango de calificaciones al que pertenece

        //Declarar variables int nota, String textoNota
        String textoNota;

        //Solicitar “Ingresar nota” y asignarla a la variable textoNota
        textoNota= JOptionPane.showInputDialog(null, 
                                    "Ingresar nota (A, B, C, D o F): ");

        //definimos una variable de tipo caracter y le asignamos la primer letra de la variable textoNota
        char notaChar= textoNota.charAt(0);

        switch (notaChar){
            case 'A' : 
                     JOptionPane.showMessageDialog(null, "En México esto equivale a una nota entre 90 y 100");
                     break;
            case 'a' : 
                     JOptionPane.showMessageDialog(null, "En México esto equivale a una nota entre 90 y 100");
                     break;
            case 'B' :
                     JOptionPane.showMessageDialog(null, "En México esto equivale a una nota entre 80 y 89");
                     break;
            case 'b' :
                     JOptionPane.showMessageDialog(null, "En México esto equivale a una nota entre 80 y 89");
                     break;
            case 'C' :
                     JOptionPane.showMessageDialog(null, "En México esto equivale a una nota entre 70 y 79");
                     break;
            case 'c' :
                     JOptionPane.showMessageDialog(null, "En México esto equivale a una nota entre 70 y 79");
                     break;
            case 'D' :
                     JOptionPane.showMessageDialog(null, "En México esto equivale a una nota entre 60 y 69");
                     break;
            case 'd' :
                     JOptionPane.showMessageDialog(null, "En México esto equivale a una nota entre 60 y 69");
                     break;
            case 'F' :
                     JOptionPane.showMessageDialog(null, "En México esto equivale a una nota menor a 60");
                     break;
            case 'f' :
                     JOptionPane.showMessageDialog(null, "En México esto equivale a una nota menor a 60");
                     break;
            default:
                    JOptionPane.showMessageDialog(null, "La letra ingresada no coresponde a ninguna calificación");
                    break;

        }
        

        //Cerrar modo gráfico
        System.exit(0);

    }
}