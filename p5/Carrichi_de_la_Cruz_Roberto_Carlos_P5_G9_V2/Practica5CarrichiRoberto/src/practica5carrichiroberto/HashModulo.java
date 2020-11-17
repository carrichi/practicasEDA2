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

public class HashModulo {

	public void agregar(ArrayList<Integer> lista, int valor){
    	// Encontrar el índice donde se guardará el elemento.
 	 			  // encontrarIndice(<Valor>,<Modulo que se utilizará>);
    	int indice = encontrarIndice(valor,13);
    	boolean hayColision = verificar(lista,indice);
    	if(hayColision==false){
	    	System.out.println("El valor se guardará en el índice: "+indice+".");    	
    		// Se utiliza set para que la lista no aumente de tamaño.
    		lista.set(indice,valor);
	    	System.out.printf("¡Agregado con éxito!");
    	}else{
    		while(hayColision==true){
    			System.out.println("¡COLISIÓN! Ya está ocupada la posición con el índice "+indice+".");	
	    		// Se tratará de encontrar una posición nueva usando prueba lineal.
	    		indice+=1;    		
	    		if(indice==lista.size()){
	    			/*Significa que ya alcanzó el límite de elementos que podía tener la lista.*/
	    			System.out.println("Se tuvo que extender la lista para que ya no existiera colisión. No quedó de otra :/");
	    			lista.add(valor);
	    			break;
	    		}	
	    		hayColision = verificar(lista,indice);
    		}
    		if(indice!=lista.size()){
		    	System.out.println("El valor se guardará en el índice: "+indice+".");
		    	lista.set(indice,valor);
		    	System.out.printf("¡Agregado con éxito!");
    		}
    	}
    }
    public int encontrarIndice(int valor,int modulo){
    	int indice = valor%modulo;
    	return indice;
    }
    public boolean verificar(ArrayList<Integer> lista,int posicion){
    	if(lista.get(posicion)==null){
	    	return false;	
		}else{
    		return true;		
		}
    }

    public int buscar(ArrayList<Integer> lista, int valor){
    	// Se está buscando el índice donde se encuentra el contenido que proporcionó el usuario.
    	int indice = encontrarIndice(valor,13);
		if(lista.get(indice)==null){
	    	return -1;
    	}
    	if(lista.get(indice)==valor){
	    	System.out.printf("¡El número ha sido encontrado!");
	    	return indice;
    	}else{
    		// Llegar aquí significaría que hay una "colición",
    		while(lista.get(indice)!=valor&&indice<lista.size()){
    			indice+=1;
    			if(lista.get(indice)==valor){
	    			System.out.printf("¡El número ha sido encontrado!");
	    			return indice;
    			}
    		}
    	}	

    	return -1; // No se encontró.
    }
}
