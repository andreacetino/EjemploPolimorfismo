/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

/**
 *
 * @author Maria
 */
public class EjemploPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gallina gallina = Gallina("Plumas", "omnivora",4);
        Serpiente serpiente = Serpiente("Luci","Carnivoro", 6);
        
        gallina.Alimentarse();
        serpiente.Alimentarse();
    }
    
}
