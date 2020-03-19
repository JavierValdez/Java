
package miercoles11;
public class Calculadora {
    String nombre;//Atributos
    int numero1;
    int numero2;
    private float sum,rest,multi,divi;
    public Calculadora(int n1, int n2){//Constructor
        this.numero1=n1;
        this.numero2=n2;
    }
    
    //Metodos
    public void CambioNombre(String nom){//Setter
        this.nombre=nom;
    }
    public void Suma(){
        this.sum=this.numero1+this.numero2;
        System.out.println("La suma es: "+this.sum);
    }
    public float resta(){ //Metodo con retorno
        this.rest=this.numero1-this.numero2;
        return this.rest;
    }
    public void Multiplicacion(){
        this.multi=this.numero1*this.numero2;
        System.out.println("La multiplicacion es: "+this.multi);
    }
    public void Division(){
        this.divi=this.numero1/this.numero2;
        System.out.println("La division es: "+this.divi);
    }
}
