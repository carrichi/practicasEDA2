import java.util.LinkedList;
import java.util.List;

public class Ejercicio3{
	public static void main (String[] args){
		BusquedaBinaria busquedaBin = new BusquedaBinaria();

		List<Integer> lista = new LinkedList<>();

		System.out.println("********** BÚSQUEDA BINARIA ********************");
// ***********************************************************************************************************
		System.out.println("\n a) Método que devuelve la cantidad de veces que se repite un número. ");
		lista.add(14);
		lista.add(17);
		lista.add(19);
		lista.add(17);
		lista.add(14);
		int clave = 17;
		System.out.printf("\nBuscarás cuantas veces se repite: "+clave+" en ");
		print(lista);
		int repeticiones = busquedaBin.repeatSearch(lista,0,lista.size()-1,clave,0);
		if(repeticiones>0){
			System.out.println("El elemento se repite en "+repeticiones+" ocasion(es).");
		}else{
			System.out.println("No se encontró.");
		}

// ***********************************************************************************************************
		System.out.println("\n b) Método que verifica la existencia de un elemento en la lista.");
		System.out.println(busquedaBin.booleanSearch(lista,19));
	}
	public static void print(List<Integer> lista){
		for(int i=0;i<lista.size();i++){
			System.out.printf("["+lista.get(i)+"]");			
		}
		System.out.println();
	}
}