import java.util.LinkedList;
import java.util.List;

public class BusquedaLineal{
	public boolean booleanSearch(List<Integer> lista, int clave){
		for(int i=0;i<lista.size();i++){
			if(lista.get(i)==clave){
				return true;
			}			
		}
		return false;
	}
	public int indexSearch(List<Integer> lista, Integer clave){
		for(Integer i=0;i<lista.size();i++){
			Integer aux = lista.get(i);
			if(aux==clave){
				return i;
			}
		}
		return -1;	
	}
	public int repeatSearch(List<Integer> lista, int clave){
		int repeticiones=0;
		for(int i=0;i<lista.size();i++){
			if(lista.get(i)==clave){
				repeticiones=repeticiones+1;
			}			
		}
		return repeticiones;
	}

}