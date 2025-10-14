package aed.multisets;



public class Pruebas{
 /*   Pair elementoPrimero = new Pair(1, 2);
    MultiSet lista = new MultiSetList(elementoPrimero);
  */
  /*MultiSet<String> lista = new MultiSetList<String>();
    lista.add("hola", 1);
    lista.add("hola", 1);
  */
  public static void main(String[] args){
    MultiSet<String> set_0 = new MultiSetList<String>();
    MultiSet<String> set_1 = new MultiSetList<String>();
      set_0.add("hej", 3);
      set_0.add("hola", 1);
      set_0.add("hi", 3);
      set_0.add("hi", 1);
      set_1.add("hola", 3);
      set_0.add("hej", 0);
      set_0.add("hej", 2);
      set_1.add("hi", 0);
      set_0.add(null, 3);
      set_0.add("hola", 2);
      set_1.add("hi", 0);
      set_1.add(null, 2);
      set_1.add("hi", 1);
      set_0.add("hi", 3);
      set_0.add("hola", 2);
      set_0.add("hi", 3);
      set_0.add("hej", 1);
      set_0.add("hi", 0);
      set_1.multiplicity("hola");
      set_1.add(null, 1);
      set_1.isEmpty();  
      set_0.add(null, 0);
      set_1.add("hi", 3);
      set_0.add("hola", 0);
      set_1.add("hi", 2);
    System.out.println(set_0.elements() + " es el set_0");
      System.out.println(set_1.elements() + " es el set_1");
      set_1.subsetEqual(set_0);
  }
}