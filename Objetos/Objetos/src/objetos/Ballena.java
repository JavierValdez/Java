/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author Usuario
 */
public class Ballena {
    //Atributos
    String AletaDorsal;
    String Color;
    String Tamanio;
    String Nombre;
    //Constructor
    public Ballena(String n,String a, String c, String t){
        this.Nombre=n;
        this.Color=c;
        this.Tamanio=t;
        this.AletaDorsal=a;
    }
    
    //Metodos
    public void Migrar(){
        System.out.println("La ballena esta migrando");
    }
    public void Comer(){
        System.out.println("La ballena esta comiendo");
    }
    public void Comunicarse(){
        System.out.println("La ballena esta comunicandose");
    }
    public void Sumergirse(){
        System.out.println("La ballena se esta sumerguiendo");
    }
    
}
