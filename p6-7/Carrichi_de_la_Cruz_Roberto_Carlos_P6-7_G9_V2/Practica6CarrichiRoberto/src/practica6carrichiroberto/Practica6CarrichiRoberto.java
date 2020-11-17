/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6carrichiroberto;

import java.util.Scanner;

/**
 *
 * @author carl
 */
public class Practica6CarrichiRoberto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Ejercicios ejercicios = new Ejercicios();
        System.out.println("Bienvenido a la práctica 6 y 7:");
        int opc;
        System.out.println("¿Que práctica deseas probar?");
        System.out.println("1. Práctica 6");
        System.out.println("2. Práctica 7");
        opc = scan.nextInt();
        switch(opc){
            case 6:
                ejercicios.practica6();
            break;
            case 7:
                ejercicios.practica7();
            break;
        }
        System.out.println("");
    }
    
}
