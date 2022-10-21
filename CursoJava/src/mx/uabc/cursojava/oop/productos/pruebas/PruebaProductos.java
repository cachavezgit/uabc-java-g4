package mx.uabc.cursojava.oop.productos.pruebas;

import mx.uabc.cursojava.oop.productos.Categoria;
import mx.uabc.cursojava.oop.productos.ProductManager;

public class PruebaProductos {
    public static void main(String args[]){

        ProductManager pm = new ProductManager();
        ProductManager.agregarProducto(pm.new Product(1,"Zapatos",2345, Categoria.ROPA));
        ProductManager.agregarProducto(pm.new Product(2,"Chamarra",5345, Categoria.ROPA));
        ProductManager.agregarProducto(pm.new Product(3,"Sombrero",1345, Categoria.ROPA));

        ProductManager.removerProducto(3);

        ProductManager.listarProductos();

    }
}
