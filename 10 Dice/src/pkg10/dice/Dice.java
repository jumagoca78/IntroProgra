/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.dice;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author juangonzalezcalleros
 */
import javax.swing.*;
import javax.swing.*;
import javax.swing.*;
import javax.swing.*;

 

/**
 *
 * @author aldair
 */
public class Dice {
    public static void main(String args[]) {
        int frequency1 = 0, frequency2 = 0,
            frequency3 = 0, frequency4 = 0, total=0,
            frequency5 = 0, frequency6 = 0, 
            frequency7 = 0, frequency8 = 0, 
            frequency9 = 0, frequency10 = 0, face=0; //
        
            for (int roll =1; roll<=1000000; roll++){
                face = randomFace(1,10);
                
                    switch(face){
                        case 1:
                            ++frequency1;
                            break;
                       
                        case 2:
                            ++frequency2;
                            break;
                        
                        case 3:
                            ++frequency3;
                            break;
                        
                        case 4:
                            ++frequency4;
                            break;
                        
                        case 5:
                            ++frequency5;
                            break;
                        case 6:
                            ++frequency6;
                            break;
                        case 7:
                            ++frequency7;
                            break;   
                        case 8:
                            ++frequency8;
                            break;
                        case 9:
                            ++frequency9;
                            break;
                        case 10:
                            ++frequency10;
                            break;    
                    }
            }
            JTextArea outputArea = new JTextArea(12,10);
            total = frequency1+
                    frequency2+
                    frequency3+
                    frequency4+
                    frequency5+
                    frequency6+
                    frequency7+
                    frequency8+
                    frequency9+
                    frequency10;
            
            outputArea.setText("\n1\t"+ frequency1 + "\n2\t"+ frequency2 + "\n3\t"+ frequency3 + "\n4\t"+ frequency4 + 
                    "\n5\t"+ frequency5 + "\n6\t"+ frequency6 + "\n7\t"+ frequency7 + "\n8\t"+ frequency8 + 
                    "\n9\t"+ frequency9 + "\n10\t"+ frequency10 + "\nTotal\t"+ total);
            JOptionPane.showMessageDialog(null, outputArea, "Died 1000000 times", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
    }
    
   public static int randomFace(int a,int b){
       return 1+(int)(Math.random()*10);
   }
}
