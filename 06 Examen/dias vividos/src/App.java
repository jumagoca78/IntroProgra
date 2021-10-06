import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String textoYear, textoMes, textoDia;
        int yearIngresado, mesIngresado, diaIngresado;
        int yearResultante, mesResultante, diaResultante;


        //Solicitar al usuario los valores y asignarlos  las variables
        textoYear = JOptionPane.showInputDialog (null, "ingresa el año: ");
        textoMes = JOptionPane.showInputDialog (null, "ingresa el mes: ");
        textoDia = JOptionPane.showInputDialog (null, "ingresa el día: ");

        //Convertis los textos a numeros
        yearIngresado = Integer.parseInt (textoYear);
        mesIngresado = Integer.parseInt (textoMes);
        diaIngresado = Integer.parseInt (textoDia);
        
        //Primero determinemos si la fecha nueva es menor o igual a la fecha dada
        yearResultante = 2021 - yearIngresado;
        mesResultante =9-mesIngresado;
        diaResultante =14-diaIngresado;
        
        //Partimos con los escenarios de error, el año es posterior al actual
        if (yearResultante <0)
            JOptionPane.showMessageDialog(null, "La fecha es de un año superior a 2021");
                     
        //el año es el mismo al actual pero el mes posterior    
        else if (yearResultante == 0 && mesResultante <0)
                JOptionPane.showMessageDialog(null, "La fecha es de un mes superior a septiembre 2021");
                     
              //el año es el actual y el mes pero el día posterior   
              else if (yearResultante==0 && mesResultante == 0 && diaResultante <0)
                        JOptionPane.showMessageDialog(null, "La fecha es de un dia superior al 14 septiembre 2021");   
                    
                    //Caso contrario la fecha es correcta
                    else
                        { 
                            //Veamos primero cualquier fecha posterior al 15 de septiembre, pues nuestro contador de años debe 
                            //Modificarse pues ela ño aún no concluye 
                            if (mesIngresado == 9 && diaIngresado > 14)
                                yearResultante = yearResultante-1;             
                            else if (mesIngresado >= 9) 
                                yearResultante = yearResultante-1; 
                      
                            //Tenemos que revisar para los meses de octubre a dicienbre que los contadores de meses sean correctos
                            if (mesResultante<0)
                             mesResultante = mesResultante + 12;
                         
                             //tenemos que revisar que los días posteriores al 15 de agosto y hasta el 14 
                            if (diaResultante <0)
                                   {
                                    diaResultante = diaResultante + 31; 
                                    if (mesResultante==0)
                                        mesResultante=11;
                                    else 
                                        mesResultante=mesResultante-1;  
                                   }    
                                         
                            //Comunicar las variables
                            //Imprimir yearResultante, mesResultante, diaResultante
                            JOptionPane.showMessageDialog(null
                                                        , "Años: "  +  yearResultante +
                                                          "\nMeses: " +  mesResultante  +
                                                          "\nDías: "  +  diaResultante
                                                         );
                        }
        //Terminar programa
        System.exit(0);
            }
}
