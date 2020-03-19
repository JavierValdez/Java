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
import java.util.*;
public class Objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner hielo = new Scanner(System.in);
        String NombreBallena;
        //System.out.println("Ingrese un nombre para su ballena: ");
        //NombreBallena= hielo.nextLine();
        Ballena blue = new Ballena("Orca","Larga","Blanco y Negro","Mediano");//Instancia
        System.out.println("La ballena se llama "+blue.Nombre);
        Ballena black=new Ballena("Preciosa","Pequeña","Azul","Pequeña");
        System.out.println("El color de "+blue.Nombre+" es: "+blue.Color);
        System.out.println("El color de "+black.Nombre+" es: "+black.Color);
    }
    
}
