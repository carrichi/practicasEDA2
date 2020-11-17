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
import java.util.Scanner;

public class Practica5CarrichiRoberto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	    // Instancia de apoyo
	    Scanner scan = new Scanner(System.in);
	    
	    // Inicio del programa
	    System.out.println("\n\t####### Bienvenido #######\n");
	    int opc=2;
    	do{	
    		System.out.println("¿Qué quieres hacer?");
	    	System.out.println("1. Manejo de tablas hash en Java.");
	    	System.out.println("2. Función hash por módulo.");
	    	System.out.println("3. Encadenamiento.");
	    	System.out.println("4. Salir del programa.");
	    	System.out.printf("\nEscoge tu opción con el número: \n > ");
	    	opc = scan.nextInt();

	    	switch(opc){
	    		case 1:
	    			System.out.println("\n\t #### Manejo de tablas hash en Java #### ");
	    			Ejercicio1 ejericio1 = new Ejercicio1();
	    			ejericio1.main();
	    		break;
	    		case 2:
			    	System.out.println("\n\t #### Función hash por módulo ####");
			    	Ejercicio2 ejercicio2 = new Ejercicio2();
			    	ejercicio2.main();
	    		break;
	    		case 3:
	    			System.out.println("\n\t #### Encadenamiento ####");
	    			Ejercicio3 ejercicio3 = new Ejercicio3();
	    			ejercicio3.main();
	    		break;
	    		case 4:
	    		break;
	    		default:
	    			System.out.println("\n\t¡FATAL! Has elegido una opción inválida, intenta de nuevo.");
	    		break;
	    	}
    	}while(opc!=4);
    
		System.out.println();
		System.out.println("\t _________________________________________________");
		System.out.println("\t| Gracias por utilizar el programa.               |");
		System.out.println("\t|                                                 |");
		System.out.println("\t| Elaborado por:                                  |");
		System.out.println("\t|    -> Carrichi de la Cruz, Roberto Carlos       |");
		System.out.println("\t|                                                 |");
		System.out.println("\t| Estudiante de la Facultad de Ingeniería, UNAM.  |");
		System.out.println("\t|_________________________________________________|");
		System.out.println();
    }
}
