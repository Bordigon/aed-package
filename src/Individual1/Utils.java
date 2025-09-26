package aed.loops;

public class Utils {
	public boolean equals(Object objeto){
		Integer valor = (Integer) objeto;
		return this == objeto;
	}


  public static int maxNumRepeated(Integer[] a, Integer elem)  {
      // Hay que modificar este metodo
	int result = 0;
	if(elem==null)
		throw new IllegalArgumentException("tienes que introducir un n'umero");
	else if(a.length==0){
		System.out.println("array vacio");
		return 0;
	}


	int counter = 0;
	for(int t = 0; t<a.length; t++){
		if(a[t]!=null && a[t].equals(elem)){
			counter += 1;
			if(result<counter)
				result = counter;
		}

		else			
			counter=0;
	}

    return result;  
  }
}
