
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanManuel
 */
public class Craps extends JFrame implements ActionListener{

   // graphical user interface componentes 
   static JLabel dado1Label, dado2Label, sumaLabel, pointLabel, mensajeResultado;
   static JTextField dado1TextField, dado2TextField, sumaTextField, pointTextField;
   static JButton roll;
   static int tiroDados = 0;
   static boolean primerLanzamiento=true;
   
   //Constructor de la clase que  hace una ventana
    public Craps()
   {
      Container c = getContentPane();
      c.setLayout( new FlowLayout() );

      dado1Label = new JLabel( "Dado 1" );
      c.add(dado1Label );
      dado1TextField = new JTextField( 10 );
      dado1TextField.setEditable( false );
      c.add(dado1TextField );

      dado2Label = new JLabel( "Dado 2" );
      c.add(dado2Label );
      dado2TextField = new JTextField( 10 );
      dado2TextField.setEditable( false );
      c.add(dado2TextField );

      sumaLabel = new JLabel( "Suma es" );
      c.add(sumaLabel );
      sumaTextField = new JTextField( 10 );
      sumaTextField.setEditable( false );
      c.add(sumaTextField );

      pointLabel = new JLabel( "Punto es" );
      c.add( pointLabel );
      pointTextField = new JTextField( 10 );
      pointTextField.setEditable( false );
      c.add(pointTextField );

      roll = new JButton( "Lanzar Dados" );
      roll.addActionListener(this);
      c.add( roll );
      
     mensajeResultado = new JLabel ("Click to roll");
     c.add(mensajeResultado);
   }
    //funcion obligados estamos a hacer para que cuando alguien de click se ejecute este código
   
    public void actionPerformed( ActionEvent e )
   {
      jugarCraps();
   }
    //Función para lanzar un dado es decir un numero aleatorio entre 1 y 6
    public static int lanzar1Dado (){
        return 1+(int) (Math.random()*6);
    }
    
    //Función que hace el lanzamiento de dos dados
    public static int lanzar2Dados (){
        //lanzamos dos dados
        int dado1=lanzar1Dado ();
        int dado2=lanzar1Dado ();
        //mostramos los valores en los TextFields
        dado1TextField.setText(Integer.toString(dado1));
        dado2TextField.setText(Integer.toString(dado2));
        sumaTextField.setText(Integer.toString(dado1+dado2));
        return  dado1+ dado2;
    }
    
    //Función que hace el lanzamiento de N dados
    public static int lanzarNDados (int n){
        int sumaDados=0;
        for (int i=1; i <=n; i++){
            sumaDados+=lanzar1Dado();
        }
        return sumaDados;
    }
    
    //Funcion lanzamiento recursivo
    public static int LanzarDadosRecursivo (int n){
        if (n==1)
            return lanzar1Dado();
        else 
            return lanzar1Dado()+ LanzarDadosRecursivo (n-1);
        
        
    }
    
    //funcion del juego CRAPS
    public static void jugarCraps(){
        //Declaración varables
        pointTextField.setText("");
        if (primerLanzamiento){
            tiroDados = primerLanzamiento();
            primerLanzamiento= false;
        }
        else 
            segundoTiro(tiroDados);
    }
    
    //Funcion para determinar si ganas en el primer tiro
    public static int primerLanzamiento (){
     
        int sumaDados=lanzar2Dados(); //variable que guarda el total de la suma de los dos datos
            //las reglas nos dices 7 u 11 en el primer lanzamiento, el jugador gana
            //2, 3, o 12 en el primer lanzamiento, el jugador pierde (llamados "craps")
            switch (sumaDados){
                case 7: case 11:
                    System.out.println("Ganador en el primer tiro con: " + sumaDados);
                    mensajeResultado.setText("Ganador en el primer tiro con: " + sumaDados);
                    primerLanzamiento=true;
                    sumaDados=0;
                    break;
                case 2: case 3: case 12:
                    System.out.println("Perdedor en el primer lanzamiento con: " +sumaDados);
                    mensajeResultado.setText("Perdedor en el primer lanzamiento con: " +sumaDados);
                    primerLanzamiento=true;
                    sumaDados=0;
                    break;
                default:
                    System.out.println("El juego debe entrar en fase 2 el valor es " + sumaDados);
                    mensajeResultado.setText("El juego debe entrar en fase 2");
                    pointTextField.setText(Integer.toString(sumaDados));
                    break;
            }
            return sumaDados;
    }
    
    
    //Funcion para el segundo tiro donde si saca el valor en los dados gana 
    //Pierde si saca 7
    public static void segundoTiro (int valor){
        int valorLanzamiento=lanzar2Dados(); 
           if (valorLanzamiento == valor){
                System.out.println("Ganador con el valor "+ valorLanzamiento);
                mensajeResultado.setText("Ganador con el valor "+ valorLanzamiento);
                primerLanzamiento=true;
                tiroDados=0;
            }
            else if (valorLanzamiento==7){
                  System.out.println("Perdiste con el valor 7");
                  mensajeResultado.setText("Perdiste con el valor 7");
                  primerLanzamiento=true;
                  tiroDados=0;
                 }
            System.out.println("El juego sigue ya que tu debes obtener " + valor+
                                 " y en el lanzamiento obtuviste " + tiroDados);
            mensajeResultado.setText("El juego sigue ya que tu debes obtener " + valor+
                                 " y en el lanzamiento obtuviste " + tiroDados);
    }
    
    
    public static void main (String args []){
        
        //vamos a crear una ventana del juego Craps 
        Craps craps = new Craps();
        craps.setSize(370, 200);//Definimos el tamapo x  y de la ventana
        craps.setVisible(true);//Indicamos que la ventana sea visible
        //código para que cuando se cierre la ventana se cierre el modo gráfico de Java
        craps.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

  
    
}
