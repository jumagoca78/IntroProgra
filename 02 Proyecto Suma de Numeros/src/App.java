import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        int numero1=18;
        int numero2=30;
        int resta = numero1-numero2; 

        JOptionPane.showMessageDialog(  null
                                      , "La resta de " + numero1 + " - " + numero2 + " es: " + resta
                                      , "Resta de numeros"
                                      , JOptionPane.INFORMATION_MESSAGE);


        System.out.println("La suma de " + numero1 + " + " + numero2 + " es:" + resta);
    }
}
