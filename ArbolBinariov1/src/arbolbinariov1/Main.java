package arbolbinariov1;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int a;
        int dato;
        String nombre;
        ArbolBin n= new ArbolBin();
        while(true) {
            dato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            n.Ingreso(dato,"khj");
        }
    }
}
