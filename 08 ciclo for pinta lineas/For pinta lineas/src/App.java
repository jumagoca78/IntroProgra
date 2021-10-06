import java.awt.Graphics;
import javax.swing.JFrame;


public class App extends javax.swing.JFrame{


 
    public void paint( Graphics g ) {
             //int counter = 1;             // initialization
             int x1=150;
             int y1=150;
             int x2=250;
             int y2=0;

            /* while ( counter <= 10 ) {    // repetition condition
                y2= 140 + counter * 10;
                g.drawLine( x1, y1, x2, y2 );
                ++counter;                // increment
*/
                
             for (int counter=1; counter <=100; counter+=10)
             {
                y2= 140 + counter * 10;
                g.drawLine( x1, y1, x2, y2 );
             }
        
             g.draw3DRect(200, 400, 50, 60, true);   
                
           }
           
    

    
    public static void main (String args []){
        App ventana = new App();
        ventana.setSize(1280, 820);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
          
    }
}
