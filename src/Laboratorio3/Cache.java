package aed.cache;

import es.upm.aedlib.Entry;
import es.upm.aedlib.Position;
import es.upm.aedlib.map.*;
import es.upm.aedlib.positionlist.*;

public class Cache<Key,Value> {

  // Tamano de la cache
  private int maxCacheSize;

  // NO MODIFICA ESTOS ATTRIBUTOS, NI CAMBIA SUS NOMBRES: mainMemory, cacheContents, keyListLRU

  // Para acceder a la memoria M
  private Storage<Key,Value> mainMemory;
  // Un 'map' que asocia una clave con un ``CacheCell''
  private Map<Key,CacheCell<Key,Value>> cacheContents;
  // Una PositionList que guarda las claves en orden de
  // uso -- la clave mas recientemente usado sera el keyListLRU.first()
  private PositionList<Key> keyListLRU;

  // Constructor de la cache. Especifica el tamano maximo 
  // y la memoria que se va a utilizar
  public Cache(int maxCacheSize, Storage<Key,Value> mainMemory) {
    this.maxCacheSize = maxCacheSize;

    // NO CAMBIA
    this.mainMemory = mainMemory;
    this.cacheContents = new HashTableMap<Key,CacheCell<Key,Value>>();
    this.keyListLRU = new NodePositionList<Key>();
  }

  // Devuelve el valor que corresponde a una clave "Key"
  public Value get(Key key) {
    CacheCell<Key,Value> newCell=cacheContents.get(key);
    Value value=null;
    Position<Key> posicion;

    if(newCell!=null){
      value=newCell.getValue();
      posicion = newCell.getPos();
      keyListLRU.addFirst(keyListLRU.remove(posicion));
      cacheContents.get(key).setPos(keyListLRU.first());
    }
    else
      if(mainMemory.read(key)!=null){
        value=mainMemory.read(key);
        put(key,value);
      }
    return value;
  }

  // Establece un valor nuevo para la clave en la memoria cache
  public void put(Key key, Value value) {
    boolean dirty=false;
    Value valor=mainMemory.read(key);

    if(valor!=null){
      dirty=!value.equals(valor);
    }


    CacheCell<Key,Value> newCell;

    if(maxCacheSize>keyListLRU.size() && !cacheContents.containsKey(key)){
      keyListLRU.addFirst(key);

      newCell = new CacheCell(value, dirty, keyListLRU.first()); 

      cacheContents.put(key, newCell);
    }

    else{

      if(cacheContents.containsKey(key)){
        Position<Key> posicion;
        newCell=cacheContents.get(key);

        posicion = newCell.getPos();
        keyListLRU.addFirst(keyListLRU.remove(posicion));
        cacheContents.get(key).setPos(keyListLRU.first());
        newCell.setValue(value);

        if(dirty){
          newCell.setDirty(dirty);
        }
      }

      else{
        mainMemory.write(keyListLRU.last().element(),cacheContents.get(keyListLRU.last().element()).getValue());

        cacheContents.remove(keyListLRU.last().element());
        keyListLRU.remove(keyListLRU.last());
        keyListLRU.addFirst(key); 

        newCell = new CacheCell(value, dirty, keyListLRU.first());
        cacheContents.put(key, newCell);
      }
    }
  }

  // NO CAMBIA
  @Override
  public String toString() {
    return "cache";
  }
}
