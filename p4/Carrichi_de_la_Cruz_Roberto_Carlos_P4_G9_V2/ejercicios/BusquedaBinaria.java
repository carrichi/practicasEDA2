import java.util.LinkedList;
import java.util.List;
public class BusquedaBinaria{
	public boolean booleanSearch(List<Integer> lista,int clave){
		System.out.printf("\nSe está buscando: "+clave+" en: ");
		print(lista);
		int limIzquierdo=0;
		int limDerecho=lista.size()-1;
		while(limIzquierdo<=limDerecho){
			int intermedio = (limIzquierdo+limDerecho)/2;
			if(clave == lista.get(intermedio)){
				return true;
			}
			if(clave<lista.get(intermedio)){
				limDerecho=intermedio-1;
			}
			if(clave>lista.get(intermedio)){
				limIzquierdo=intermedio+1;
			}
		}
		return false;
	}
	public int repeatSearch(List<Integer> lista,int limIzquierdo,int limDerecho, int clave,int repeticiones){
		ordenar(lista);
		int resultado=repetidos(lista,limIzquierdo,limDerecho,clave,repeticiones);
		return resultado;
	}
	public void ordenar(List<Integer> lista){
		for (int i = 0; i < lista.size()-1; i++){
            for (int j = 0; j < lista.size()-i-1; j++){
                if (lista.get(j) > lista.get(j+1)){ 
                    Integer aux = lista.get(j); 
                    lista.set(j,lista.get(j+1)); 
                    lista.set(j+1,aux); 
                }
        	}
		}
	}
	public int repetidos(List<Integer> lista,int limIzquierdo,int limDerecho, int clave,int repeticiones){
		// System.out.printf("\n");
		// print(lista);
		// System.out.println("Límites: ["+limIzquierdo+","+limDerecho+"]");
		while(limDerecho>=limIzquierdo){
			int intermedio = (limIzquierdo+limDerecho)/2;
			// System.out.println("Intermedio: "+intermedio);
			if(clave == lista.get(intermedio)){
				repeticiones=repeticiones+1;
				lista.remove(intermedio);
				return repeatSearch(lista,0,lista.size()-1,clave,repeticiones);
			}
			if(lista.get(intermedio)>clave){
				return repeatSearch(lista,limIzquierdo,intermedio-1,clave,repeticiones);
			}
			return repeatSearch(lista,intermedio+1,limDerecho,clave,repeticiones);
		}
		if(repeticiones>=1){
			return repeticiones;
		}else{
			return -1;
		}
	}
	public static void print(List<Integer> lista){
		for(int i=0;i<lista.size();i++){
			System.out.printf("["+lista.get(i)+"]");			
		}
		System.out.println();
	}
}