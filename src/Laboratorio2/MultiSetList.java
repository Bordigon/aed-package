package aed.multisets;

import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.positionlist.PositionList;

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
  

  /**
   * Añade n copias de elem al multiset. Notad que elem podria ser null.
   * @throws IllegalArgumentException si n<0.
   */
  @Override
  public void add(E elem, int n){
    if(n<0)
      throw new IllegalArgumentException("n no puede ser menor a 0");
    
    if(elements.isEmpty() && n>0){
      elements.addFirst(new Pair<E,Integer>(elem,n));
      size=n;
    }
      
    else{
      Position<Pair<E, Integer>> primero=elements.first();
      boolean yaEsta = false;
      int nAux = 0;
      
      while(!yaEsta && primero != null && n>0){
        if((primero.element().getLeft()==null && elem==null) || (primero.element().getLeft()!=null && primero.element().getLeft().equals(elem))){
          Integer anterior = primero.element().getRight();
          nAux =  n + anterior;
          primero.element().setRight(nAux);
          yaEsta = true;
        }
        primero=elements.next(primero);
      }
      
      if(!yaEsta && n>0){
        elements.addLast(new Pair<E,Integer>(elem,n));
      }
      size = size + n;
    } 
  }

  /**
   * Borra n copias de elem en el multiset. Si no hay al menos n
   * copias no se borra ningun copia. Notad que elem podria ser null.
   * Devuelve true si logro borrar n copias, y false si no.
   *
   * @throws IllegalArgumentException si n<0.
   */
  @Override
  public boolean remove(E elem, int n){
    boolean seRemovio = false;
    if(n<0)
      throw new IllegalArgumentException("n no puede ser menor a 0");

    if(n==0)
      return !seRemovio;
    
    if(elements.isEmpty())
      return seRemovio;
      
    else{
      Position<Pair<E, Integer>> primero=elements.first();
      boolean yaEsta = false;
      int nAux=0;
      
      while(!yaEsta && primero != null){
        
        if((primero.element().getLeft()==null && elem==null) || (primero.element().getLeft()!=null && primero.element().getLeft().equals(elem))){
          Integer anterior = primero.element().getRight();
          nAux =  anterior-n;
          
          if(nAux>=0){
            primero.element().setRight(nAux);
            seRemovio = true;
            size = size - n;
            
            if(nAux==0){
              elements.remove(primero);
              }
            }
          yaEsta = true;
        }
        
        if(!yaEsta)
          primero=elements.next(primero);
      }
    }
    return seRemovio;
  }

  /**
   * Devuelve el numero de copias de elem en el multiset.
   * Notad que elem podria ser null.
   *
   * @throws IllegalArgumentException si n<0.
   */
  @Override
  public int multiplicity(E elem){
    int resultado = 0;

    if(elements.isEmpty()){
      return resultado;
    }

    Position<Pair<E, Integer>> primero=elements.first();
    boolean yaEsta = false;

    while(!yaEsta && primero != null){
      if((primero.element().getLeft()==null && elem==null) || (primero.element().getLeft()!=null && primero.element().getLeft().equals(elem))){
        resultado = primero.element().getRight();
        yaEsta = true;
      }
      primero=elements.next(primero);
    }

    if(resultado<0)
      throw new IllegalArgumentException("resultado es menor a 0");

    return resultado;
  }

  /**
   * Devuelve el numero total de copias de elementos en el multiset.
   * Por ejemplo, si s = {a,b,a,b,b} entonces s.size() devuelve 5.
   */
  @Override
  public int size(){
    return size;
  }

  /**
   * Devuelve true si el multiconjunto es vacio, y false si no es vacio.
   */
  @Override
  public boolean isEmpty(){
     return elements.isEmpty();  
  }

  /**
   * Devuelve una lista con los elementos que tiene una multiplicidad > 0
   * dentro el multiconjunto.
   * El orden de los elementos en el resultado no importa.
   * Por ejemplo, si s = {a,b,a,b,b} entonces devuelve la lista [a,b].
   */
  @Override
  public PositionList<E> elements(){

    PositionList<E> resultado = new NodePositionList<E>();
    Position<Pair<E, Integer>> primero=elements.first();

    while(primero != null){
      if(primero.element().getRight()>0)           
        resultado.addLast(primero.element().getLeft());
      
      primero=elements.next(primero);
    }
    return resultado;
  }

  /**
   * Devuelve un multiset nuevo que es la suma de this y s.
   * Por ejemplo, si this={a,b,b} y s={a,a,c} entonces devuelve el multiconjunto
   * {a,a,a,b,b,c}.
   */
  @Override
  public MultiSet<E> sum(MultiSet<E> s){
    MultiSetList<E> multiconjunto=null;
    
    if(s instanceof MultiSetList<?>){
      multiconjunto = (MultiSetList<E>) s;
    }
      
    MultiSet<E> resultado = new MultiSetList<E>();
    Position<Pair<E, Integer>> primero=multiconjunto.elements.first();
    
    while(primero != null){
        resultado.add(primero.element().getLeft(), primero.element().getRight());
        primero=multiconjunto.elements.next(primero);
    }
    
    primero=this.elements.first();
    while(primero != null){
        resultado.add(primero.element().getLeft(), primero.element().getRight());
        primero=elements.next(primero);
    }
    
    return resultado;
  }

  /**
   * Devuelve un multiset nuevo que es "this resta s".
   * Por ejemplo, si this={a,a,b,b} y s={a,c} entonces devuelve el multiconjunto
   * {a,b,b}.
   */
  @Override
  public MultiSet<E> minus(MultiSet<E> s){
    MultiSetList<E> multiconjunto=null;

    if(s instanceof MultiSetList<?>){
      multiconjunto = (MultiSetList<E>) s;
    }

    MultiSet<E> resultado = new MultiSetList<E>();
    Position<Pair<E, Integer>> primero=this.elements.first();

    while(primero != null){
      resultado.add(primero.element().getLeft(), primero.element().getRight());
      primero=elements.next(primero);
    }
    
    Position<Pair<E, Integer>> primero1= this.elements.first();
    Position<Pair<E, Integer>> primero2;
    E elem1;
    E elem2;
    boolean encontrado;
  
    while(primero1 != null){
      elem1=primero1.element().getLeft();
      primero2= multiconjunto.elements.first();
      encontrado=false;
      
      while(primero2 != null && !encontrado){
        elem2=primero2.element().getLeft();
        
        if(elem1==null && elem2==null || elem1!=null && elem1.equals(elem2)){
          if(primero1.element().getRight() >= primero2.element().getRight())
            resultado.remove(elem2, primero2.element().getRight());
          else
            resultado.remove(elem2, primero1.element().getRight());
          encontrado=true;
        }
        
        primero2=multiconjunto.elements.next(primero2);
      }

      primero1=this.elements.next(primero1);
    }
    
    return resultado;
  }


  
  /**
   * Devuelve un multiset nuevo que es la interseccion de this y s.
   * Por ejemplo, si s={a,a,b,b} y this={a,c} entonces devuelve el multiconjunto {a}.
   */
  @Override
  public MultiSet<E> intersection(MultiSet<E> s){
    MultiSetList<E> multiconjunto=null;

    if(s instanceof MultiSetList<?>){
      multiconjunto = (MultiSetList<E>) s;
    }

    MultiSet<E> resultado = new MultiSetList<E>();
    Position<Pair<E, Integer>> primero1;
    Position<Pair<E, Integer>> primero2=this.elements.first();
    Pair<E, Integer> elemento2; 
    Pair<E, Integer> elemento1;
    boolean encontrado;
    
    while(primero2 != null){
      elemento2 = primero2.element();
      encontrado=false;
      primero1=multiconjunto.elements.first();
      
      while(primero1 != null && !encontrado){
        elemento1 = primero1.element();
          
        if((elemento1.getLeft()==null && elemento2.getLeft()==null) || (elemento1.getLeft()!=null && elemento1.getLeft().equals(elemento2.getLeft()))){
          if(elemento1.getRight() > elemento2.getRight()) 
            resultado.add(elemento2.getLeft(), elemento2.getRight());
          else
              resultado.add(elemento1.getLeft(), elemento1.getRight());
          encontrado = true;
        } 
        
        primero1=multiconjunto.elements.next(primero1);
      }
      
    primero2=elements.next(primero2); 
    }

    return resultado;
  }

  /**
   * Devuelve true si this es un submultiset de s, y false si no.
   * Por ejemplo, si s={a,b} y this={a} devuelve true,
   * si s={a} y this={a} devuelve true,
   * si s={a} y this={a,b} devuelve false,
   * y si s={a} y this={a,a} devuelve false,
   */
  @Override
  public boolean subsetEqual(MultiSet<E> s){
    MultiSetList<E> multiconjunto=null;

    if(s instanceof MultiSetList<?>)
      multiconjunto = (MultiSetList<E>) s;

    if(multiconjunto.elements.equals(elements))
      return true;
    
    
    boolean result = this.size <= multiconjunto.size();

    Position<Pair<E, Integer>> primero1;
    Position<Pair<E, Integer>> primero2=this.elements.first();
    Pair<E, Integer> elemento2; 
    Pair<E, Integer> elemento1;
    boolean seEncontro;
    boolean sonNulls;
    boolean es1Null2no;
    boolean es2Null1no;
    
    while(primero2 != null && result){
      elemento2 = primero2.element();
      primero1=multiconjunto.elements.first();
      seEncontro=false;

      while(primero1 != null && result && !seEncontro){
        elemento1 = primero1.element();
        sonNulls = (elemento1.getLeft() == null && elemento1.getLeft() == null);
        es1Null2no = (elemento1.getLeft() == null && elemento2.getLeft() != null);
        es2Null1no = (elemento1.getLeft() != null && elemento2.getLeft() == null);
        
        if(sonNulls || (!es1Null2no && !es2Null1no && elemento2.getLeft().equals(elemento1.getLeft()))){
          result = elemento2.getRight() <= elemento1.getRight();
          seEncontro = true;
        }
        primero1=multiconjunto.elements.next(primero1);
      }
      if(!seEncontro)
        result = false;
    primero2=elements.next(primero2); 
    }

    return result;
  }
}
