import java.util.LinkedList;
import java.util.List;

public class Ejercicio2{
	public static void main (String[] args){
		BusquedaLineal busquedaLin = new BusquedaLineal();

		List<Integer> lista = new LinkedList<>();

		System.out.println("********** BÚSQUEDA LINEAL ********************");

// ***********************************************************************************************************
		System.out.println("\n a) Método que verifica la existencia de un elemento en la lista.");
		lista.add(14);
		lista.add(29);
		lista.add(892);
		lista.add(9);
		lista.add(38);
		int clave=9;
		System.out.printf("\nVerificarás si existe la clave: "+clave+" en ");
		print(lista);
		System.out.println(busquedaLin.booleanSearch(lista,clave));

// ***********************************************************************************************************
		System.out.println("\n b) Método que devuelve el índice donde se encuentra elemento a buscar.");
		lista = new LinkedList<>();
		lista.add(29);
		lista.add(8);
		lista.add(9);
		lista.add(248);
		lista.add(23);
		lista.add(53);
		Integer clave2 = 9;
		System.out.printf("\nBuscarás la clave: "+clave+" en ");
		print(lista);

		Integer index = busquedaLin.indexSearch(lista,clave2);
		if(index>0){
			System.out.println("El elemento "+clave+" se encuentra en el índice "+index);
		}else{
			System.out.println("No se encontró.");
		}

// ***********************************************************************************************************
		System.out.println("\n c) Método que devuelve la cantidad de veces que se repite de un elemento en la lista.");
		lista = new LinkedList<>();
		lista.add(2);
		lista.add(8);
		lista.add(9);
		lista.add(3);
		lista.add(2);
		lista.add(2);
		clave = 2;
		System.out.printf("\nBuscarás cuantas veces se repite: "+clave+" en ");
		print(lista);
		int repeticiones = busquedaLin.repeatSearch(lista,clave);
		if(repeticiones>0){
			System.out.println("El elemento se repite en "+repeticiones+" ocasion(es).");
		}else{
			System.out.println("No se encontró.");
		}
	}
	public static void print(List<Integer> lista){
		for(int i=0;i<lista.size();i++){
			System.out.printf("["+lista.get(i)+"]");			
		}
		System.out.println();
	}
}