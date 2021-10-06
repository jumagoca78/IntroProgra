import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        //Declaración de variable acumulador de calificaciones
        int total=0;

        //Declarar la  variable que guarda el promedio de calificacaciones
        double promedio=0.0;

        //Declaración de string  e int para guardar el valor de cada calificacion
        String textoCalificacion;
        int calificacion;

        //Definición de variables de control y contador
        int numAlumnos = 11;
        

        //El grupo de 11 alumnos de java hacen un quiz. Las calificaciones  (enteros en el rango 0 a 100) para este quiz son 
        //desconocidas hay que determinar el promedio del grupo.

        for  (int n=1; n<=numAlumnos; n++)
        {
            textoCalificacion = JOptionPane.showInputDialog(null, "Ingresar calificación");
            try {
                calificacion = Integer.parseInt(textoCalificacion);
                if (calificacion >=0 && calificacion <=100)
                            {
                                total = total + calificacion;  //acumulador
                                //Incrementar variable de control
                                
                            }
                            else
                                JOptionPane.showMessageDialog(null, "EL número debe ser un valor entre 0 y 100"); 
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null
                                            , "El número debe ser enetero positivo\n" + e.getMessage()
                                            , "error"
                                            , JOptionPane.ERROR_MESSAGE);
            }            
        }

        try {

            promedio = total/numAlumnos;
            JOptionPane.showMessageDialog(null
                                         , "EL PROMEDIO ES: "+ promedio
                                         , "Promedio de notas"
                                         , JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);  
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null
                                            , "Tienes cero alumnos no hay promedio que calcular\n"+  e.getMessage()
                                            , "error"
                                            , JOptionPane.ERROR_MESSAGE);
        }

    }
}


