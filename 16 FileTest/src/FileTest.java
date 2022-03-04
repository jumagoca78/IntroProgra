// Fig. 17.4: FileTest.java
// Demonstrating the File class.
import java.io.*;
import javax.swing.*;

public class FileTest  {

    static String output=""; 
    
   public static void abrirArchivo ( String nombre )
   {
      File name = new File( nombre );
  
      // if name exists, output information about it
      if ( name.exists() ) {
         if ( name.isFile() ) {

            // append contents of file to outputArea
            try {
               BufferedReader input = new BufferedReader(
                  new FileReader( name ) );
               StringBuffer buffer = new StringBuffer();
               String text;
               output += "\n\n" ;
   
               while ( ( text = input.readLine() ) != null ) 
                  buffer.append( text + "\n" );
   
               output += buffer.toString() ;
            }

            // process file processing problems
            catch( IOException ioException ) {
               JOptionPane.showMessageDialog( null, "FILE ERROR",
                  "FILE ERROR", JOptionPane.ERROR_MESSAGE );
            }

         } // end if

         // output directory listing
         else if ( name.isDirectory() ) {
            String directory[] = name.list();
   
            output += "\n\nDirectory contents:\n";
   
            for ( int i = 0; i < directory.length; i++ )
               output += directory[ i ] + "\n" ;
         }

      } // end outer if

      // not file or directory, output error message
      else {
         JOptionPane.showMessageDialog( null,
            nombre + " Does Not Exist",
            "ERROR", JOptionPane.ERROR_MESSAGE );
      }
      
      System.out.println (output); 

   } // end method actionPerformed

   public static void main( String args[] )
   {
      
      abrirArchivo (JOptionPane.showInputDialog("Ingresa nombre o ruta del archivo: ")); 
      System.exit(0);
   }

} // end class FileTest

/**************************************************************************
 * (C) Copyright 1992-2003 by Deitel & Associates, Inc. and               *
 * Prentice Hall. All Rights Reserved.                                    *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
