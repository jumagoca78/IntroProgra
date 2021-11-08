import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        
        int opcion = mostrar_menu ();
        boolean salir = false;
        do{

            switch (opcion){
                case -1: JOptionPane.showMessageDialog(null, "Gracias por usar nuestra calculadora");
                         salir = true;   
                        break;
                case 1: JOptionPane.showMessageDialog(null, "La suma es "+ suma2Numeros(10, 10));
                        break;
                case 2: JOptionPane.showMessageDialog(null, "La resta es :"+resta2Numeros(10, 15));
                        break;
                default:
                        JOptionPane.showMessageDialog(null, "Esa opción no existe");
                        break;
            }
            if (!salir){
                opcion = mostrar_menu ();
            }
        }
        while (!salir); 

        System.exit(0);

    }

    //Menu de opciones
    public static int mostrar_menu(){
        
        String menu =  "Calculadora \n" + 
                       "Selecciona el número deseado \n" +
                       "1.- Suma \n" +
                       "2.-Resta \n "+
                       "-1 Para salir\n";


        String textoOpcion = JOptionPane.showInputDialog(null, menu);
        int opcion;
        opcion = Integer.parseInt(textoOpcion);

        return opcion;
    }

    //funcion de sumar dos numeros
    public static int suma2Numeros (int num1, int num2){
        int resultado;
        resultado = num1+num2;

        return resultado;
    }

    //funcion que resta dos numeros
    public static int resta2Numeros (int num1, int num2){
        int resultado;
        resultado = num1-num2;
        return resultado;

    }


}
