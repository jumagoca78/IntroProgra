import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Definir variables para leer una calificación en Letra
        //String textoCalificacion para leer la entrada de datos del usuario
        String textoCalificacion;
        
        //char cablificacion con la calificacion del alumno
        char calificacion;

        //Solicitar al usuario ingresar la calificacion y guardarla en la variable textoCalificacion
        textoCalificacion= JOptionPane.showInputDialog(null, "Ingresar Califcacion: ");

        //Extraer el primer caracter de la cadena de texto  textoCalificacion y asignarla a la variable calificacion
        calificacion = textoCalificacion.charAt(0);

        //Si ( calificacion es 'A' )
        //   Imprimir( "Esta nota en el sistema mexicano es equivalente a obtener entre 90 y 100" )
        //sino si ( calificacion es 'B' )
        //   Imprimir( "Esta nota en el sistema mexicano es equivalente a obtener entre 80 y 89" )
        //     sino si ( calificacion es 'C' )
        //              Imprimir( "Esta nota en el sistema mexicano es equivalente a obtener entre 70 y 79" )
        //          sino si ( calificacion es 'D' )
        //                  Imprimir( "Esta nota en el sistema mexicano es equivalente a obtener entre 60 y 69" )
        //                sino si ( calificacion es 'F' )
        //                          Imprimir( "Esta nota en el sistema mexicano es equivalente a obtener una nota reprobatoria" )
        //                      sino Imprimir( "Error la letra ingresada no corresponde a las opciones" )

        switch (calificacion){

            case 'a' :
            case 'A' :   JOptionPane.showMessageDialog(null, "Esta nota en el sistema mexicano es equivalente a obtener entre 90 y 100", "Calificacion Final", JOptionPane.INFORMATION_MESSAGE);
                        break;

            case 'b':            
            case 'B':   JOptionPane.showMessageDialog(null, "Esta nota en el sistema mexicano es equivalente a obtener entre 80 y 89", "Calificacion Final", JOptionPane.INFORMATION_MESSAGE);
                        break;
            
            case 'c' :           
            case 'C' :   JOptionPane.showMessageDialog(null, "Esta nota en el sistema mexicano es equivalente a obtener entre 70 y 79", "Calificacion Final", JOptionPane.INFORMATION_MESSAGE);
                        break;
            
            case 'd' :            
            case 'D' :   JOptionPane.showMessageDialog(null, "Esta nota en el sistema mexicano es equivalente a obtener entre 60 y 69", "Calificacion Final", JOptionPane.INFORMATION_MESSAGE);
                        break;
            
            case 'f' :           
            case 'F' :   JOptionPane.showMessageDialog(null, "Esta nota en el sistema mexicano es equivalente a obtener una nota reprobatoria", "Calificacion Final", JOptionPane.INFORMATION_MESSAGE);
                        break;
                        
        
            default :   JOptionPane.showMessageDialog(null, "Error la letra ingresada no corresponde a las opciones", "Calificacion Final", JOptionPane.ERROR_MESSAGE);
                        break;

        }

        //Cerramos el modo gráfico
        System.exit (0);

    }
}
