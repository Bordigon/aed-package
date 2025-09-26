package aed.almacen;

import es.upm.aedlib.indexedlist.IndexedList;
import es.upm.aedlib.indexedlist.ArrayIndexedList;


/**
 * Implementa la logica del almacen.
 */
public class Almacen implements ClienteAPI, AlmacenAPI, ProductorAPI {

  // Compras (sin ningun orden especial)
  private ArrayIndexedList<Compra> compras;
  // Productos ordenados ascendamente usando el productoId de un Product.
  private ArrayIndexedList<Producto> productos;

  // No es necesario cambiar el constructor
  /**
   * Crea un almacen.
   */
  public Almacen() {
    this.compras = new ArrayIndexedList<>();
    this.productos = new ArrayIndexedList<>();
  }


  // Implementa los métodos necesarios aqui ...
}
