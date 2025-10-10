package aed.multisets;

import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.positionlist.NodePositionList;


/**
 * Una implementacion de un multiset (multiconjunto) a traves de una lista
 * de posiciones.
 */
public class MultiSetList<E> implements MultiSet<E> {
  
  /**
   * La estructura de datos que guarda los elementos del multiset.
   */
  private PositionList<Pair<E,Integer>> elements;
  
  /**
   * El tamaño del multiset.
   */
  private int size;
  
  /**
   * Construye un multiset vacio.
   */
  public MultiSetList() {
    this.elements = new NodePositionList<Pair<E,Integer>>();
    this.size = 0;
  }
  
  
}
