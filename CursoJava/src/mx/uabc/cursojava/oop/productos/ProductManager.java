package mx.uabc.cursojava.oop.productos;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta es la clase para gestionar los productos
 * Autor: Carlos Ivan Chavez Fuentes
 * Fecha: 11 de Octubre
 */
public class ProductManager {
    public  static List<Product> inventario=new ArrayList<>();

    public List<Product> getInventario() {
        return inventario;
    }

    public void setInventario(List<Product> inventario) {
        this.inventario = inventario;
    }

    public static void agregarProducto(Product product) {
        inventario.add(product);
    }

    public static void listarProductos() {
        System.out.println(inventario.toString());
    }

    public static void removerProducto(int clave) {
        inventario.removeIf(prod -> prod.getClave()==clave);
    }

    public final class Product {

        private final int clave;

        private final String nombre;

        private final double precio;

        private final Categoria categoria;

        public Product(int clave, String nombre, double precio, Categoria categoria) {
            this.clave = clave;
            this.nombre = nombre;
            this.precio = precio;
            this.categoria = categoria;
        }

        public Categoria getCategoria() {
            return categoria;
        }

        public int getClave() {
            return clave;
        }


        public String getNombre() {
            return nombre;
        }


        public double getPrecio() {
            return precio;
        }


        @Override
        public String toString() {
            return "Product{" +
                    "clave=" + clave +
                    ", nombre='" + nombre + '\'' +
                    ", precio=" + precio +
                    ", categoria=" + categoria +
                    '}';
        }
    }
}
