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
public  abstract class Animal {
    private String Nombre;
    private String Tipo_Alimentación;
    private int Edad;

    public Animal(String Nombre, String Tipo_Alimentación, int Edad) {
        this.Nombre = Nombre;
        this.Tipo_Alimentación = Tipo_Alimentación;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo_Alimentación() {
        return Tipo_Alimentación;
    }

    public void setTipo_Alimentación(String Tipo_Alimentación) {
        this.Tipo_Alimentación = Tipo_Alimentación;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    
    public abstract void Alimentarse();
    
    public abstract void Correr();
}
