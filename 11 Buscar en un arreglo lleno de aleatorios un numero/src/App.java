import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class App {
    public static void main(String[] args) throws Exception {
      //Un arreglo de 50 numeros 

      int arreglo [] = new int [50];
      //Queremos llenarlo de número aleatorios entre 1 y 50
      for (int i=0; i <= arreglo.length-1; i++){
          arreglo[i] = 1 + (int)(Math.random()*50);
      }  

      int numeroABuscar = 0;

      do{
      //Vamos a preguntar al usuario el número que quiere buscar
      String textoNumeroABuscar = JOptionPane.showInputDialog(null, "¿Qué número buscas?");
      numeroABuscar = Integer.parseInt(textoNumeroABuscar);

      //En caso de que encontremos el número en el arreglo
      //indicar que si encontramos el numero y cual es el indice de la ubicacion del numero
      //en caso contrario pues simplemente indicar que el número no existe en el arreglo
      int indice = -1;
      for (int i = 0 ; i <= arreglo.length-1; i++){
          if (numeroABuscar == arreglo[i]){
              indice= i;
              break; //Salir del ciclo for
          }       
      }


      //Para poder comprobar que es correcta la respuesta hay que imprimir en pantalla el arrreglo
      String resultado = "Los numeros del arreglo \n";
      resultado += "Indice \t valor \n";

      for (int i=0; i<= arreglo.length-1;i++){
          resultado += i + "\t" + arreglo[i]+"\n";
      }  

      if (indice == -1){
        resultado += "El numero no se encuentra en el arreglo";
      }
      else{
          resultado += "El numero se encuentra en el indice"+ indice;
      }
      

      JTextArea salidaTexto = new JTextArea();
      
      salidaTexto.setText(resultado);

      JOptionPane.showMessageDialog(null, salidaTexto);

    

    } while (numeroABuscar!=-1);

    System.exit(0);

    }
}
