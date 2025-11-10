import java.util.Iterator;
import java.util.Arrays;
import java.util.Map;

public class Examen{

public static boolean esSerieFibonacci(Iterable<Integer> iterable){
	
	boolean result = true;
	int size = 0;
	Integer prevNumber = 0;
	Integer nextNumber = 0;
	Integer currentNumber = 0;
	Iterator<Integer> it = iterable.iterator();

	while(it.hasNext()){
		size += 1;
		currentNumber = it.next();
		if(nextNumber != 0 && !nextNumber.equals(currentNumber))
			result = false;
		
		if(prevNumber == 0)
			prevNumber = currentNumber;
		else{
			nextNumber = prevNumber + currentNumber;
			prevNumber = currentNumber;
		}

	}

	if(size<3)
		result = true;

	return result;

}

	public static <E> Iterable<E> obtenerSecuencia(Map<E,E> map, E pos){
	

	}

	public static void main(String[] args){
		Iterable<Integer> numbers = Arrays.asList(0, 1, 1, 2, 3, 5);
		System.out.println(esSerieFibonacci(numbers));

	}


}










