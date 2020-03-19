package miercoles11;
import java.util.Scanner;//Importada la clase Scanner
public class Miercoles11 {
    public static void main(String[] args) {
        int dato1,dato2;
        Scanner entrada=new Scanner(System.in);//Instanciando un objeto entrada de tipo Scanner
        System.out.print("Ingrese dos numeros");
        dato1 = entrada.nextInt();
        dato2= entrada.nextInt();
        Calculadora chebo = new Calculadora(dato1,dato2);//Instanciar objeto chebo de tipo calculadora
        chebo.Suma();
        float b=chebo.resta();
        System.out.println("El valor de la resta es: "+b);
        chebo.Multiplicacion();
        chebo.Division();
        chebo.CambioNombre("Calculadorita");
        System.out.println("El nombre es "+chebo.nombre);
    }
}
