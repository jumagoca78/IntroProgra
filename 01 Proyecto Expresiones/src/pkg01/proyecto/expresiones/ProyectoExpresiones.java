/*
 * Licencia exclusiva de @udlap
 */
package pkg01.proyecto.expresiones;

/**
 *
 * @author Juan Manuel Gonzalez Calleros
 */
public class ProyectoExpresiones {

    /**
     * @param args the command line arguments
     * 
     *  Programa que calcula una expresión matemática
     * 5 * (x+y) - 4*y / (z+6)
     */
        
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int x = 2;
        int y = 2;
        int z = 0;
        
        int funcion=EvaluarExpresiones.funcion1(x,y,z);
        
        System.out.println("El resultado de evaluar la expresión 5 * (x+y) - 4*y / (z+6)");
        System.out.println("Con los valores X=2; Y=2; Z=0 se espera sea 19");
        System.out.println("Es " + funcion);
        
        
    }
    
}
