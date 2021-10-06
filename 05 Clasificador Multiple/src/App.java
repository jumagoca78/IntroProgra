import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //Declarar variables
        //Variable String para guardar el Texto solicicitado el usuario
        //Variable entera para guardar la calificacion 
        String textoCalificacion;
        int calificacion;

        //Solicitar al usuario la calificación
        textoCalificacion = JOptionPane.showInputDialog(null, "Ingresar la calificacion: ");

        //Convertir el texto a numero 
        calificacion  = Integer.getInteger(textoCalificacion);

        //Si la nota es mayor o igual a 90 imprimir A
        //Sino  si la nota es mayor o igual a 80 imprimir B
        //      Sino si la nota es mayor o igual a 70 imprimir C
        //           Sino si la nota es mayyor o igual a 60 imprimir D
        //                sino imprimir F
        if (calificacion >= 90)
            JOptionPane.showMessageDialog(null, "A");
        else if (calificacion >=80)
                JOptionPane.showMessageDialog(null, "B");
             else if (calificacion >=70)
                     JOptionPane.showMessageDialog(null, "C"); 
                  else if (calificacion >= 60)
                          JOptionPane.showMessageDialog(null, "D");  
                       else 
                          JOptionPane.showMessageDialog(null, "F");     


        //Cerrar modo gráfico
        System.exit(0);
        
    }
}
