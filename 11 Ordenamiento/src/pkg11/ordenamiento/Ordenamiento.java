/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.ordenamiento;

/**
 *
 * @author JuanManuel
 */
public class Ordenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SortAlgorith ascendente  = new SortAscending ();
        SortAlgorith descendente = new SortDescending();
        
        ascendente.sortAlgorithm();
        descendente.sortAlgorithm();
        
    }
    
}
