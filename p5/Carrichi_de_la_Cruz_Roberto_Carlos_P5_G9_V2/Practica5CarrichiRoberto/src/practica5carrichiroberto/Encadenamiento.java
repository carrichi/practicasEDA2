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

public class Encadenamiento {
	public void agregar(ArrayList<ArrayList<Integer>> lista,int valor){
            int indice = encontrarIndice();
            boolean hayColision = verificar(lista,indice);
            if(hayColision==false){
            	System.out.printf("¡Valor añadido con éxito! ");
		agregarEnDerivada(lista.get(indice),valor,false);
            }else{
            	System.out.println("Tenemos una colisión en la lista del índice: "+indice);
            	System.out.println("El valor ingresado se añadirá al final de esta lista.");
		agregarEnDerivada(lista.get(indice),valor,true);
            }
	}
 //             agregarEnDerivada(<Lista derivada donde se agregará>,<El valor que tendrá>,<Indica si esta generando colisión>) 
	public void agregarEnDerivada(ArrayList<Integer>lista,int valor,boolean colision){
            if(colision==true){
		// Si está generando colisión, se añadirá al final de la lista.
		lista.add(valor);
            }else{
		// Si no genera colisión, se añade en el primer elemento de la lista.
		lista.set(0,valor);
            }
	}

	public int encontrarIndice(){
            int indice = (int) Math.floor(Math.random()*14);
            System.out.println("Se agregará en la lista con el índice: "+indice);
            return indice;
	}

    public boolean verificar(ArrayList<ArrayList<Integer>> lista,int posicion){
    	ArrayList<Integer> listaAVerificar = lista.get(posicion);
    	boolean estaLibre = isEmpty(listaAVerificar);
    	if(estaLibre==true){
	    return false; // Como el es un espacio dispobible NO GENERA colisión.
	}else{
            return true; // ESTÁ GENERANDO COLISIÓN.
	}
    }

    public boolean isEmpty(ArrayList<Integer> lista){
    	if(lista.get(0)==null){
    		return true; /*El primer valor de la lista está libre.*/
    	}
    	return false; /*La posición de la lista derivada ya está siendo ocupada.*/
    }
}
