import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Generar n alumnos con un peso aleatorio
        int alumnos =10;

        int peso1, peso2,peso3, peso4, peso5, peso6, peso7, peso8, peso9, peso10;

        peso1 = 50;
        peso2 = 34;
        peso3 = 88;
        peso4 = 70;
        peso5 = 55;
        peso6 = 66;
        peso7 = 73;
        peso8 = 40;
        peso9 = 78;
        peso10= 61;
        
        //declaracion de contadores
        int contadorMenos40=0, contadorEntre40y50=0, contadorEntre50y60=0, contadorMas60=0; 


        if (peso1<40)
            contadorMenos40 = contadorMenos40 + 1;
            else if (peso1 >= 40 && peso1 < 50)
                    contadorEntre40y50 = contadorEntre40y50 + 1;
                 else if (peso1>=50 && peso1 < 60 )
                         contadorEntre50y60 = contadorEntre50y60 + 1;
                      else    
                         contadorMas60 = contadorMas60 + 1;   
        

        if (peso2<40)
            contadorMenos40 = contadorMenos40 + 1;
            else if (peso2 >= 40 && peso2 < 50)
                    contadorEntre40y50 = contadorEntre40y50 + 1;
                 else if (peso2>=50 && peso2 < 60 )
                         contadorEntre50y60 = contadorEntre50y60 + 1;
                      else    
                         contadorMas60 = contadorMas60 + 1;                         

        if (peso3<40)
            contadorMenos40 = contadorMenos40 + 1;
            else if (peso3 >= 40 && peso3 < 50)
                    contadorEntre40y50 = contadorEntre40y50 + 1;
                 else if (peso3>=50 && peso3 < 60 )
                         contadorEntre50y60 = contadorEntre50y60 + 1;
                      else    
                         contadorMas60 = contadorMas60 + 1;

        if (peso4<40)
            contadorMenos40 = contadorMenos40 + 1;
            else if (peso4 >= 40 && peso4 < 50)
                    contadorEntre40y50 = contadorEntre40y50 + 1;
                 else if (peso4>=50 && peso4 < 60 )
                         contadorEntre50y60 = contadorEntre50y60 + 1;
                      else    
                         contadorMas60 = contadorMas60 + 1;
        if (peso5<40)
            contadorMenos40 = contadorMenos40 + 1;
            else if (peso5 >= 40 && peso5 < 50)
                    contadorEntre40y50 = contadorEntre40y50 + 1;
                 else if (peso5>=50 && peso5 < 60 )
                         contadorEntre50y60 = contadorEntre50y60 + 1;
                      else    
                         contadorMas60 = contadorMas60 + 1;
        if (peso6<40)
            contadorMenos40 = contadorMenos40 + 1;
            else if (peso6 >= 40 && peso6 < 50)
                    contadorEntre40y50 = contadorEntre40y50 + 1;
                 else if (peso6>=50 && peso6 < 60 )
                         contadorEntre50y60 = contadorEntre50y60 + 1;
                      else    
                         contadorMas60 = contadorMas60 + 1;

        if (peso7<40)
            contadorMenos40 = contadorMenos40 + 1;
            else if (peso7 >= 40 && peso7 < 50)
                    contadorEntre40y50 = contadorEntre40y50 + 1;
                 else if (peso7>=50 && peso7 < 60 )
                         contadorEntre50y60 = contadorEntre50y60 + 1;
                      else    
                         contadorMas60 = contadorMas60 + 1;

        if (peso8<40)
            contadorMenos40 = contadorMenos40 + 1;
            else if (peso8 >= 40 && peso8 < 50)
                    contadorEntre40y50 = contadorEntre40y50 + 1;
                 else if (peso8>=50 && peso8 < 60 )
                         contadorEntre50y60 = contadorEntre50y60 + 1;
                      else    
                         contadorMas60 = contadorMas60 + 1;
        if (peso9<40)
            contadorMenos40 = contadorMenos40 + 1;
            else if (peso9 >= 40 && peso9 < 50)
                    contadorEntre40y50 = contadorEntre40y50 + 1;
                 else if (peso9>=50 && peso9 < 60 )
                         contadorEntre50y60 = contadorEntre50y60 + 1;
                      else    
                         contadorMas60 = contadorMas60 + 1;

        if (peso10<40)
            contadorMenos40 = contadorMenos40 + 1;
            else if (peso10 >= 40 && peso10 < 50)
                    contadorEntre40y50 = contadorEntre40y50 + 1;
                 else if (peso10>=50 && peso10 < 60 )
                         contadorEntre50y60 = contadorEntre50y60 + 1;
                      else    
                         contadorMas60 = contadorMas60 + 1;

JOptionPane.showMessageDialog(null, 
                              "\n"+ peso1+
                              "\n"+ peso2+
                              "\n"+ peso3+
                              "\n"+ peso4+
                              "\n"+ peso5+
                              "\n"+ peso6+
                              "\n"+ peso7+
                              "\n"+ peso8+
                              "\n"+ peso9+
                              "\n"+ peso10+
                              "\nTotales menores a 40: (peso < 40)"+ contadorMenos40+
                              "\nTotales entre 40 y menores a 50 (49) : "+ contadorEntre40y50+
                              "\nTotales entre 50 y menores a 60  (59): "+ contadorEntre50y60+
                              "\nTotales mayores a 60: "+ contadorMas60
                              );

                              System.exit(0);
    }
}
