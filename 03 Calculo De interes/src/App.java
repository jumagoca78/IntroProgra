import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        //Necesito estas variables para leer lo que ingresa el usuario en las cajas de dialogo (JOptionPane)
        String textoP, textoI, textoN, textoM;
        double total, p, i, n, m ;


        //solicitar el dinero a ahorrrar y convertir el valor de String a double
        textoP=JOptionPane.showInputDialog(null, "Ingresar cantidad a ahorrar (p):");    
        p = Double.parseDouble (textoP);


        //solicitar el interes y convertir el valor de String a double
        textoI=JOptionPane.showInputDialog(null, "Ingresar el interés bancario (i):");    
        i = Double.parseDouble (textoI);
        i=i/100.0;

        //solicitar el numero de añor a a ahorrar y convertir el valor de String a double
        textoN=JOptionPane.showInputDialog(null, "Ingresar el numero de años a ahorrar (n):");    
        n = Double.parseDouble (textoN);

        //solicitar el numero de veces que me van a devolver el dinero al año y convertir el valor de String a double
        textoM=JOptionPane.showInputDialog(null, "Ingresar el número de veces que me regresan el dinero al año (m):");    
        m = Double.parseDouble (textoM);

        //Calcular el interes p * (1+i/m)^n*m
        total = p * Math.pow( 1+(i/m), n*m);
        
        //Comunicar el resultado del programa
        JOptionPane.showMessageDialog(null
                                     , "Para tu inversion de : " + p +  ", con un interes anual de " + i*100.0 + "%"+
                                       ", durante " + n + " años y con un depósito al año de " + m + " veces."+
                                       "\n Tu ahorro será: " + total  
                                     , "Caculadora de interés"
                                     , JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }
}
