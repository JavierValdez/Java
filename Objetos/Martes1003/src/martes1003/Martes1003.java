/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martes1003;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Martes1003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int valor;
        valor = entrada.nextInt();
        Ejercicio1 n = new Ejercicio1(valor);
        Ejercicio2 n1 = new Ejercicio2();
    }
    
}
