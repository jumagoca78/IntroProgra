import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;

public class App extends JFrame{

    public void paint (Graphics pincel){

        pincel.setColor(Color.BLUE);

        int x1= 100;
        int y1=100;
        int x2=250;
        int y2;
        //necesito contar del 100 al 200 de 10 en 10
        

         for (int contador=100; contador <=200; contador+=10 ){
                y2=contador;
                pincel.drawLine(x1, y1, x2, y2);
         }


        
    }


    public static void main(String[] args) throws Exception{
        App miVentana = new App ();
        miVentana.setSize(1280, 600);
        miVentana.setVisible(true);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

    }
}
