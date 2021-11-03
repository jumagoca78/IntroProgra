import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {


        int [] arreglo1, arreglo2, arreglo3, arreglo4;       

        arreglo1= new int [10];
        Arreglo.llenarArregloAleatorios(arreglo1, 1, 10);

        arreglo2 = new int [20];
        Arreglo.llenarArregloAleatorios(arreglo2, -10, 10);

        arreglo3 = new int [15];
        Arreglo.llenarArregloAleatorios(arreglo3, 1, 100);

        arreglo4 = new int [5];
        Arreglo.llenarArregloAleatorios(arreglo4, 1, 5); 

        String resultado = "Mis arreglos son: \n";

        resultado += Arreglo.impirmirArreglo(arreglo1, "Arreglo 1") + "\n"; 
        resultado += Arreglo.impirmirArreglo(arreglo2, "Arreglo 2") + "\n"; 
        resultado += Arreglo.impirmirArreglo(arreglo3, "Arreglo 3") + "\n"; 
        resultado += Arreglo.impirmirArreglo(arreglo4, "Arreglo 4") + "\n"; 

        JOptionPane.showMessageDialog(null, resultado);

        //Cerramos modo gráfico
        System.exit(0);
    }

    

}
