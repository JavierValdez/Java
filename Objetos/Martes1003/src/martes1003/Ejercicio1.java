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
public class Ejercicio1 {
    int s=0,m=0,h=0;
    public Ejercicio1(int h){
        while(h>3600){
            h-=3600;
            this.h++;
        }
        while(h>60){
            h-=60;
            this.m++;
        }
        this.s=h;
    System.out.println("Las horas son "+this.h+" Los minutos son "+m+" los segundos son "+s);
}
}
