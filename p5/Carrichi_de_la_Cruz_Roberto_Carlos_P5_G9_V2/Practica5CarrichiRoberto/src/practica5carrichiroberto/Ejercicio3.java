/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5carrichiroberto;

/**
 *
 * @author carl
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
	public void main(){
		// Instancias de apoyo
		Scanner scan = new Scanner(System.in);

		ArrayList<ArrayList<Integer>> lista = new ArrayList<ArrayList<Integer>>();
             
                // Método que permite rellenar con almenos un valor nulo para que tenga una extensión definida.
                extenderLista(lista,15); 

		System.out.println("\n\t¡Tienes una lista de 15 listas a tu disposición!");
		int opc;
		do{
	        System.out.println("\n¿Qué deseas hacer?");
	    	System.out.println("\t1. Agregar elementos.");
	    	System.out.println("\t2. Volver al menú principal.");
	    	System.out.printf("\nEscoge tu opción con el número: \n > ");
	    	opc = scan.nextInt();
	    	switch(opc){
	    		case 1:
	    			System.out.println("\n\t #### Agregar elementos #### ");
	    			System.out.printf("\nCuéntanos, ¿cuántos elementos deseas añadir?\n > ");
	    			int elementos = scan.nextInt();
	    			
	    			Encadenamiento encadenamiento = new Encadenamiento();

	    			for(int i=0;i<elementos;i++){
	    				System.out.printf("\nIngresa el valor que quieres agregar: \n > ");
	    				int valor = scan.nextInt();
	    			 // encadenamiento.agregar(<Donde se añade>,<Con que valor>);
	    				encadenamiento.agregar(lista, valor);
	    				System.out.printf(" ("+(i+1)+"/"+elementos+")\n");
	    			}
	    			System.out.println("\nHas terminado de añadir.");
	    			System.out.println("El estado de la lista es el siguiente: ");
	    			imprimirListaPrincipal(lista);
	    		break;
	    		case 2:
	    		break;
	    		default:
	    			System.out.println("\n\t¡FATAL! Has elegido una opción inválida, intenta de nuevo.");
	    		break;
	    	}
    	}while(opc!=2);		
    	System.out.println("\n Has decidido volver.\n");
	}
        
	public void extenderLista(ArrayList<ArrayList<Integer>> lista, int tamaño){
		// Añadir listas en la lista principal.
		for(int i=0;i<tamaño;i++){
			ArrayList<Integer> listaDerivada = new ArrayList<Integer>();
			listaDerivada.add(null);
			lista.add(listaDerivada);
		}
	}
	public void imprimirListaPrincipal(ArrayList<ArrayList<Integer>> lista){
		// Este proceso solo imprimirá renglón por renglón.
		for(ArrayList<Integer> elemento: lista){
                    System.out.printf("Lista derivada -> ");
		    imprimirListaDerivada(elemento);
		}
	}

	public void imprimirListaDerivada(ArrayList<Integer> lista){
		// Este proceso imprimirá por columnas.
		for(Integer elemento: lista){
                    if(elemento==null){
                        System.out.printf("[ ] ");
                    }else{
                        System.out.printf("["+elemento+"] ");                        
                    }
		}	
		System.out.printf("\n");
	}
}
