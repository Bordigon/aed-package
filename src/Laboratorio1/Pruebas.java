package aed.almacen;
import aed.almacen.Almacen;

public class Pruebas{
	String pene;
	public Pruebas(){
		this.pene = "pene";
	}

	public static void joda(){
	Almacen a = new Almacen();
 a.reabastecerProducto("t-shirt", 1); System.out.println(a.getProductos());
 a.reabastecerProducto("t-shirt", 3); System.out.println(a.getProductos());
 a.reabastecerProducto("libro", 4);
  a.reabastecerProducto("helado", 2);
  a.pedir("jorge", "libro", 1); System.out.println(a.getProductos());
a.comprasProducto("libro"); System.out.println(a.getProductos());
   a.reabastecerProducto("t-shirt", 3); System.out.println(a.getProductos());
 a.getProducto("helado"); System.out.println(a.getProductos());
  a.getCompra(34); System.out.println(a.getProductos());
  a.getProducto("libro"); System.out.println(a.getProductos());
  a.comprasProducto("libro"); System.out.println(a.getProductos());
  a.getProducto("helado")  ; System.out.println(a.getProductos());
  a.getCompras()  ; System.out.println(a.getProductos());
  a.getProductos(); System.out.println(a.getProductos());
	}

	public static void main (String[] args){
	
		System.out.println("holaaa");
		joda();
	}
}