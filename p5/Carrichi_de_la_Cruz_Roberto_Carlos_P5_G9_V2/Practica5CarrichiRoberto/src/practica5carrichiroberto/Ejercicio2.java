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

public class Ejercicio2 {
    public void main(){
    	// Clases de apoyo
    	Scanner scan = new Scanner(System.in);
		HashModulo hash = new HashModulo();

    	ArrayList<Integer> lista = new ArrayList<>();
    	extenderTamaño(lista,15);
    	System.out.println("\n\t¡Se acaba de crear una lista de 15 elementos para ti!");

    	int opc;
    	do{
	        System.out.println("\n¿Qué deseas hacer?");
	    	System.out.println("\t1. Agregar elementos.");
		   	System.out.println("\t2. Imprimir lista.");
	    	System.out.println("\t3. Buscar elementos.");
	    	System.out.println("\t4. Volver al menú principal.");
	    	System.out.printf("\nEscoge tu opción con el número: \n > ");
	    	opc = scan.nextInt();
	    	switch(opc){
	    		case 1:
	    			System.out.println("\n\t #### Agregar elementos #### ");
	    			int elementos;
	    			do{
		    			System.out.printf("\nCuéntanos, ¿cuántos elementos deseas añadir?\n > ");
		    			elementos = scan.nextInt();
		    			if(elementos>15){
		    				System.out.println("\n¡CHISPAS! Has sobrepasado el tamaño de la lista. Intenta otra vez.");
		    			}
	    			}while(elementos>15);
	    			
	    			for(int i=0;i<elementos;i++){
	    				System.out.printf("\nIngresa el valor que quieres agregar: \n > ");
	    				int valor = scan.nextInt();
	    			 // hash.agregar(<Donde se añade>,<Con que valor>);
	    				hash.agregar(lista, valor);
	    				System.out.printf(" ("+(i+1)+"/"+elementos+")\n");
	    			}
	    			System.out.println("\n\n Has terminado de añadir.");
	    		break;
	    		case 2:
			    	System.out.println("\n\t #### Imprimir lista ####\n");
			    	imprimirLista(lista);
	    		break;
	    		case 3:
	    			System.out.println("\n\t #### Buscar elementos ####");
	    			if(isEmpty(lista)==true){
	    				System.out.println("\n Estás tratando de buscar elementos en una lista vacía. Intenta añadir elementos primero.");
	    			}else{
		    			System.out.printf("\nEscribe la cantidad que estás buscando:\n > ");
		    			int valor = scan.nextInt();
		    			int indice = hash.buscar(lista,valor);
		    			if(indice<0){
		    				System.out.println("\nLo siento, no ha sido encontrado.");
		    			}else{
	    					System.out.printf("\nLa cantidad que ingresaste se encuentra en el índice "+indice+".\n");
		    			}
	    			}
	    		break;
	    		case 4:
	    		break;
	    		default:
	    			System.out.println("\n\t¡FATAL! Has elegido una opción inválida, intenta de nuevo.");
	    		break;
	    	}
    	}while(opc!=4);

    	System.out.println("\n Has decidido volver.\n");
    }

	public void extenderTamaño(ArrayList<Integer> lista, int tamaño){
		// Se rellenará con null cada posición para extender su tamaño.
		for(int i=0;i<tamaño;i++){
			lista.add(null);
		}
	}
	
	public void imprimirLista(ArrayList<Integer> lista){
		// Verificar si ya tiene valores añadidos.
		boolean vacia = isEmpty(lista);
		if(vacia==false){
			System.out.printf("[ ");
			for(int i=0; i<lista.size();i++){
				if(i+1==lista.size()){
					System.out.printf(""+lista.get(i)+" ");
				}else{
					System.out.printf(lista.get(i)+", ");
				}
			}
			System.out.printf("]");
		}else{
			System.out.println("\nAún no has agregado elementos a la lista. ):");
		}
		System.out.println("");
	}

	public boolean isEmpty(ArrayList<Integer> lista){
		// Verificar si ya tiene valores añadidos.
		for(int i=0; i<lista.size();i++){
			if(lista.get(i)!=null){
				return false;
			}
		}
		return true;		
	}
}