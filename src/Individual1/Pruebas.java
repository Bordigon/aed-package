package aed.loops;


public class Pruebas{
	static Integer[] prueba1 = {1,1,1,1,2,3,5,3,6,1,1,1,1,1,1};
	static Integer[] vacio = {};
	static Integer[] noVacio = {1000};
	static Utils prueba = new Utils();
	

	public static void main(String[] args){
		System.out.println(prueba.maxNumRepeated(noVacio,1000));
	
	}
}
