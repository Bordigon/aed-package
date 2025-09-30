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

    public Producto getProducto(String productoId) {
        if (productoId == null) {
            throw new IllegalArgumentException("Invalid Id");
        }
	Producto producto;
	int cantidad = -1;
        for (int t = 0; t < productos.size(); t++) {
            producto = productos.get(t);
            if (producto.getProductoId().equals(productoId)) {
		cantidad = producto.getCantidadDisponible();;
            }
        }
		
	if(cantidad == -1)
		return null;
        return new Producto(productoId, cantidad);
    }


	public Compra getCompra(Integer compraId){
		Compra result = new Compra("n","h",-1);
        	if (compraId == null) {
        	    throw new IllegalArgumentException("Invalid Id");
        	}
		
		for(int t = 0; t<compras.size(); t++){
			Compra compra = compras.get(t);
			if(compra.getCompraId().equals(compraId))
				result = compra;
		}
		if(result.getCantidad() == -1)
			return null;
		return result;
	}




	public IndexedList<Producto> getProductos(){
		IndexedList<Producto> listaProductos = new ArrayIndexedList<>();
		boolean agregado;
		for(int t = 0; t < productos.size(); t++){
			agregado = false;
			for(int k = listaProductos.size()-1; k > -1; k--){
				if(listaProductos.size() >= 1 && productos.get(t).getProductoId().compareTo(listaProductos.get(k).getProductoId())>=1){
					listaProductos.add(k+1, productos.get(t));
					agregado = true;
					k = -1;
				}
			}
			if(!agregado)
				listaProductos.add(0, productos.get(t));	
		}
		return listaProductos; 
	}

	public IndexedList<Compra> getCompras(){
		IndexedList<Compra> listaCompras = new ArrayIndexedList();
		for(int t = 0; t < compras.size(); t++)
			listaCompras.add(t, this.getCompra(compras.get(t).getCompraId()));
		return listaCompras; 	
	}
	
	
	public IndexedList<Compra> comprasCliente(String clienteId){
		IndexedList<Compra> listaCompras = new ArrayIndexedList();
		Compra unaCompra;
		for(int t = 0; t < compras.size(); t++){
			unaCompra = compras.get(t);
			if(unaCompra.getClienteId().equals(clienteId))
				listaCompras.add(listaCompras.size(), unaCompra);
		}
		return listaCompras; 		
	}
	
	
	public IndexedList<Compra> comprasProducto(String productoId){
		IndexedList<Compra> listaComprasProducto = new ArrayIndexedList();
		Compra unaCompra;
		for(int t = 0; t < compras.size(); t++){
			unaCompra = compras.get(t);
			if(unaCompra.getProductoId().equals(productoId))
				listaComprasProducto.add(0, unaCompra);
		}
		return listaComprasProducto;	
	}

	
  	public void reabastecerProducto(String productoId, int cantidad){
		Producto productoAux;
		Producto productoAct = new Producto(productoId, cantidad);
		boolean hayStock = false;
		for(int t = 0; t < productos.size() ; t++){
			productoAux = productos.get(t);
			if(productoAux.getProductoId().equals(productoId)){
				productoAct = new Producto(productoId, cantidad + productoAux.getCantidadDisponible());
				productos.remove(productoAux);
				productos.add(t, productoAct);
				hayStock = true;
			}		
		}
		
		if(!hayStock){
			productos.add(0, productoAct); 
		}
	}

	public Integer pedir(String clienteId, String productoId, int cantidad){
		Producto productoAux;
		Producto productoAct;
		Compra productoComprado = new Compra(clienteId, productoId, cantidad);
		boolean hayStock = false;
		for(int t = 0; t < productos.size(); t++){
			productoAux = productos.get(t);
			if(productoAux.getProductoId().equals(productoId)){
				if(productoAux.getCantidadDisponible() >= cantidad){
					hayStock = true;
					productoAct = new Producto(productoId, productoAux.getCantidadDisponible() - cantidad);
					productos.remove(productoAux);
					productos.add(t, productoAct);
					compras.add(compras.size(), productoComprado);
				}
			}
		}
		if(!hayStock)
			return null;
		else
			return productoComprado.getCompraId();
	}



    // Implementa los métodos necesarios aqui ...
}
