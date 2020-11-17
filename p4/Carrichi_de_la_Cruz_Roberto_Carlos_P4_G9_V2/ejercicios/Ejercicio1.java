import java.util.LinkedList;
import java.util.List;

public class Ejercicio1{
	public static void main (String[] args){
		List<Integer> lista1 = new LinkedList<>();
		
		// Añadir elementos a la lista.
		lista1.add(15);
		
		lista1.add(14);
		lista1.add(17);
		lista1.add(27);
		lista1.add(30);
		lista1.add(31);

		lista1.add(80);

		System.out.println(" Estado 1 ");
		imprimirLista(lista1);
		System.out.println(" ************************ ");

		// Añadir elementos en un ìndice determinado.
		// Recorre a la derecha la información si en dicho índice hay contenido.
		lista1.add(2,300);
		lista1.add(4,500);
		lista1.add(5,700);

		System.out.println(" Estado 2 ");
		imprimirLista(lista1);
		System.out.println(" ************************ ");

		// Método para reemplazar el contenido dado el índice y contenido nuevo.
		lista1.set(1,4);		
		lista1.set(2,16);		
		lista1.set(7,18);		

		System.out.println(" Estado 3 ");
		imprimirLista(lista1);
		System.out.println(" ************************ ");

		System.out.printf("De la lista: ");
		imprimirLista(lista1);
		System.out.println("- > Se crearán dos sublistas.");
		List<Integer> lista2, lista3;
		// Crear una sublista desde el índice 2 hasta el índice 4 pero este último SE EXCLUYE DE LA SUBLISTA
		lista2 = lista1.subList(2,4);
		lista3 = lista1.subList(2,4);
		System.out.printf("Sublista 1:");
		imprimirLista(lista2);
		System.out.println(" ************************ ");
		System.out.printf("Sublista 2:");
		imprimirLista(lista3);

		System.out.println(lista1.equals(lista2));

		System.out.println("- > Se crearán dos sublistas.");

		System.out.println("- > Se crearán dos sublistas.");
		System.out.println("- > Se crearán dos sublistas.");

	}
	public static void imprimirLista(List<Integer> listaAImprimir){
		for(Integer elemento : listaAImprimir){
			System.out.printf("["+elemento+"] ");
		}
		System.out.println("");
	}
}