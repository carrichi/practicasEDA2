import java.util.Scanner;

public class Menu{
	public static void main(String[] args) {
		System.out.println(" ### BIENVENIDO A LAS PRACTICAS 8 Y 9 ### ");
		System.out.println("Que desea hacer? Elige con el numero.");
		System.out.println("1. Arboles binarios");
		System.out.println("2. Arboles binarios de busqueda");
		System.out.println("3. Salir");
		System.out.printf("\n > ");
		int opcion = nextInt();
		switch (opcion) {
			case 1:
				System.out.println("\n\t #### Arboles binarios ####");
				System.out.println("1. Crear Arbol");
				System.out.println("2. Agregar dato");
				System.out.println("3. Eliminar dato");
				System.out.println("4. Imprimir arbol (BFS)");
				System.out.println("5. Notacion prefija (preorden)");
				System.out.println("6. Notacion Infija (inorden)");
				System.out.println("7. Notacion postfija (postorden)");
				System.out.printf("\n > ");
			break;
			case 2:
				System.out.println("\n\t #### Arboles binarios de busqueda ####");
				System.out.println("1. Crear Arbol");
				System.out.println("2. Agregar dato");
				System.out.println("3. Eliminar dato");
				System.out.println("4. Buscar");
				System.out.println("5. Imprimir arbol. (BFS)");
				System.out.printf("\n > ");
			break;
			case 3:
				System.out.println("\n\tHas decidido salir, gracias por revisar las practicas. Hasta pronto.\n");
			break;
			default:
				System.out.println("\n\tUPS! Elegiste una opcion invalida. Intenta otra vez.\n");
			break;
		}
		public static 
	}
}