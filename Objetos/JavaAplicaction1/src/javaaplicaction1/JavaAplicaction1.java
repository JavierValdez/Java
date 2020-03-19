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
import javax.swing.JOptionPane;
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
        
         j.Suma_a_i(10);
        imprimir.mensaje= JOptionPane.showInputDialog(null,"Ingrese una frase");
        
        i=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero en la variable i"));
        JOptionPane.showMessageDialog(null, "El mensaje es "+imprimir.mensaje+"\nel valor introducido es"+i);
        
    }
    
}
