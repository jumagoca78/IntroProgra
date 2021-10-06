import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
      //declarar cadenas p,n,m,i
      String valorP,valorN,valorM,valorI;

      //La variable p es el valor de dinero a ahorrrar
      valorP= JOptionPane.showInputDialog(null, "Ingresar dinero a ahorrar:");
      int p;
      p= Integer.parseInt(valorP);

      //Variable para clacular el interes 
      valorI =  JOptionPane.showInputDialog(null, "Ingresar el interés bancario:");
      int enteroI;
      enteroI = Integer.parseInt(valorI);
      double i = enteroI/100.0;

      //variable para el numero de años a invertir
      valorN =  JOptionPane.showInputDialog(null, "Ingresar el numero de años a invertir el dinero:");
      int n;
      n = Integer.parseInt(valorN);

      //Variable para conocer las veces al año que me devuelven el dinero
      valorM =  JOptionPane.showInputDialog(null, "Ingresar el número de veces que el banco te entrega intereses al año:");
      int m;
      m= Integer.parseInt(valorM);

      int exponente;
      exponente = n*m;
      System.out.println("Valor de exponente: " + exponente);

      double fraccion;
      
      fraccion = i/m;
      System.out.println("Valor de fraccion: " + fraccion);

      double parente;

      parente = 1+ fraccion;

      double si;

      si= Math.pow(parente, exponente);

      double resultado;

      resultado = p*si;
      
      JOptionPane.showMessageDialog(null
                                   , "El resultado es: " + resultado
                                   , "Calculadora de interés bancario"
                                   , JOptionPane.INFORMATION_MESSAGE);


      System.exit(0);
    }
}
