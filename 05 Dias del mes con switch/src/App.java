
    import javax.swing.JOptionPane;

    public class App {
        public static void main(String[] args) throws Exception {
            
             //Solcitar al usuario el mes
            //Declarar variables int mes, String textoMes
            String textoMes, textoYear;

           //Solicitar “Ingresar año” y asignarla a la variable textoYear
            textoYear= JOptionPane.showInputDialog(null, 
                                        "Ingresar el año: ");


            //Solicitar “Ingresar mes” y asignarla a la variable textoMes
            textoMes= JOptionPane.showInputDialog(null, 
                                        "Ingresar el número de mes: ");
    
            //Convertimos los textos a enteros y asignarlos a las variables segun corresponde
            //textoMes a mes y textoYear a year  
            int mes= Integer.parseInt (textoMes);
            int year Integer.parseInt(textoYear);
    
            switch (mes){
                    case 1: case 3: case 5:
                    case 7: case 8: case 10:
                    case 12:
                        JOptionPane.showMessageDialog(null, "El mes tiene 31 días");
                        break;
                    case 4: case 6:
                    case 9: case 11:
                    JOptionPane.showMessageDialog(null, "El mes tiene 30 días");
                        break;
                    case 2:
                        if ( ( (year % 4 == 0) && !(year % 100 == 0) )
                             || (year % 400 == 0)
                           )
                            JOptionPane.showMessageDialog(null, "El mes tiene 29 días");
                        else 
                            JOptionPane.showMessageDialog(null, "El mes tiene 28 días");
                        break;
                    default:
                    JOptionPane.showMessageDialog(null, "Mes no válido.");
                        break;
                }
            
            
            
    
            //Cerrar modo gráfico
            System.exit(0);
    
        }
    }

