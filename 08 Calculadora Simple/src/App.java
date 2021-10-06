import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        //Crear nuestro menú
        String menu= "Bienvenido(a) a nuestra calculadora simple \n" +
                     "Selecciona la opción deseada: \n"+
                     "1- Suma escribe 1 \n" +
                     "2- Resta escribe 2 \n" +   
                     "3- Multiplicacion escribe 3 \n" +
                     "4- División escribe 4 \n" +
                     "5- Salir escribe -1 \n";

        //varible de control de menu
        int opcionMenu=0;

        //Varible para leer el texto de entrada
        String textoOpcionMenu;

        //variables para los numeros a operar 
        String textoNumero1, textoNumero2;
        double numero1, numero2, resultado=0.0;
             
        do{  
            //Mostrar Menu y Seleccionar opcion del menu
            textoOpcionMenu= JOptionPane.showInputDialog(null, menu);
            opcionMenu = Integer.parseInt(textoOpcionMenu);
         
            //Dependendiento de la funcion vamos a realizar la operación
            //Primero consultamos que el valor de la operación esta entre 1 y 4
            if (opcionMenu >=1 && opcionMenu<=4){

                //Lectura y convercion de numeros a operar
                textoNumero1 = JOptionPane.showInputDialog(null, "ingresar el numero 1: ");
                textoNumero2 = JOptionPane.showInputDialog(null, "ingresar el numero 2: ");

                numero1 = Double.parseDouble(textoNumero1);
                numero2 = Double.parseDouble(textoNumero2);
                //Realizamos las operaciones
                switch (opcionMenu){
                    case 1: resultado = numero1+numero2;
                            break;
                    case 2: resultado = numero1-numero2;
                            break;
                    case 3: resultado = numero1*numero2;
                            break;
                    case 4: 
                            //Revisar que no se intente hacer una división por cero
                            //Pedimos el segundo valor tantas veces como sea necesario 
                            while (numero2==0)
                                {
                                    textoNumero2 = JOptionPane.showInputDialog(null, "ingresar el numero 2: ");
                                    numero2 = Double.parseDouble(textoNumero2);
                                }
                            resultado = numero1/numero2;
                            break;
             
                }
                //Mostrar el resultado
                DecimalFormat formato;
                formato = new DecimalFormat ("00.00");
                JOptionPane.showMessageDialog(null, formato.format(resultado));
            }
            else if (opcionMenu != -1)
                    JOptionPane.showMessageDialog(null, "La opción del menu es incorrecta", "Menaje de error", JOptionPane.ERROR_MESSAGE);
            

        }while (opcionMenu != -1);

        System.exit(0);

    }
}
