package aed.indexedlist;
import es.upm.aedlib.indexedlist.*;

public class Utils {

  public static <E> IndexedList<E> deleteRepeated(IndexedList<E> l) {
      // Hay que modificar este metodo
	IndexedList<E> result = new ArrayIndexedList<E>();
	int counter = 0;
	for(int t = 0; t<l.size();t++){
		E elementoAux = l.get(t);
		boolean yaEsta = false;
		for(int k = 0; k < result.size(); k++){
			E elementoAuxDeResult = result.get(k);
			if(elementoAux.equals(elementoAuxDeResult))
				yaEsta = true;
		}
		if(!yaEsta){
			result.add(counter, elementoAux);
			counter++;
		}
			
	}
    return result;
  }
}
