import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Declarar variables int nota, String textoNota
        String textoNota;
        int nota;

        //Solicitar “Ingresar nota” y asignarla a la variable textoNota
        textoNota= JOptionPane.showInputDialog(null, 
                                    "Ingresar nota: ");

        //Convertir la variable textoNota a entero y asignarlo a nota 
        nota =  Integer.parseInt(textoNota);

        //Si ( nota >= 90 )
        //    Imprimir( "A" );
        //sino  si ( nota >= 80 )
        //	       mprimir( "B" );
        //       sino si ( nota >= 70 )
        //                Imprimir( "C" );
        //            sino  si ( nota >= 60 )
        //                    Imprimir( "D" );
        //                   sino Imprimir( "F" );

        if (nota>=90)
            JOptionPane.showMessageDialog(null, "A");
            else if (nota >=80)
                JOptionPane.showMessageDialog(null, "B");
                else if (nota >=70)
                    JOptionPane.showMessageDialog(null, "C"); 
                     else if (nota >= 60)
                            JOptionPane.showMessageDialog(null, "D"); 
                            else 
                                JOptionPane.showMessageDialog(null, "F");  
        
        //Cerrar modo gráfico
        System.exit(0);

    }
}
