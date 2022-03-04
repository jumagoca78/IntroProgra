/*
 * Este programa se encuetra protegido por la licencia de la UDLAP
para más detalles visite nuestro sitio www.udlap.mx.
 */


/**
 *
 * @author Juan Gonzalez Calleros
 */
public class CalculoDeFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=2;
        int y=3;
        int z=6;
        
        int funcion = CalcularFuncion.funcion(x, y, z);

        System.out.println ("Este programa calcula la funcion 5 * (x+y) - 4*y / (z+6)");
        System.out.println ("Con los valores x= 2; y=3; z=6");
        System.out.println ("El resultado es  " + funcion);
        
    }
    
}
