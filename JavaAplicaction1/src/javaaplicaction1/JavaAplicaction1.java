/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaaplicaction1;

/**
 *
 * @author Usuario
 */
public class JavaAplicaction1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Variable Usada para explicar la Herencia
        int i= 0;
        MiClase imprimir=new MiClase();
        MiNuevaClase j = new MiNuevaClase();
        
        NewJPanel az= new NewJPanel();
        az.setVisible(true);
        az.setEnabled(true);
        j.Suma_a_i(10);
        imprimir.mensaje="Hola a todos";
        System.out.println("El  mensaje es:  " +imprimir.mensaje); 
    }
    
}
