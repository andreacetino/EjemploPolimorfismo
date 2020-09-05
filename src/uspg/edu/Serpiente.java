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
public class Serpiente extends Animal {

    public Serpiente(String Nombre, String Tipo_Alimentación, int Edad) {
        super(Nombre, Tipo_Alimentación, Edad);
    }

    @Override
    public void Alimentarse() {
        System.out.println("Me aliemto de mamiferos y aves");
    }

    @Override
    public void Correr() {
        System.out.println("utilizo mi cuerpo para desplazarme");
    }
    
}
