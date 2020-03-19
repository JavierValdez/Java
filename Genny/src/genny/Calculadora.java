/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genny;

/**
 *
 * @author Usuario
 */
public class Calculadora {
    String nombre;
    int numero1;
    int numero2;
    float rsum,rrest,rmulti,rdivi;
    public Calculadora(int num1,int num2){
        this.numero1=num1;
        this.numero2=num2;
    }
    public void CambioNombre(String nom){
        this.nombre=nom;
    }
    public void Suma(){
        this.rsum=this.numero1+this.numero2;
        System.out.println("El valor de la suma es "+this.rsum);
    }
}
