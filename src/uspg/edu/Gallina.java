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
public class Gallina extends Animal {

    public Gallina(String Nombre, String Tipo_Alimentación, int Edad) {
        super(Nombre, Tipo_Alimentación, Edad);
    }
    @Override
     public void Alimentarse(){
        System.out.println("Me aliemnto de insectos, concentado y otras cosas");
     }
    
    
    @Override
    public void Correr(){
        System.out.println("Corro con mis dos patas");
    }
}
