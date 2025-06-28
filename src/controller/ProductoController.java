package controller;

import model.Inventario;
import model.Producto;

public class ProductoController {
    public static void registrarProducto(String id, String nombre, double precio, int stock) {
        Producto nuevo = new Producto(id, nombre, precio, stock);
        Inventario.agregarProducto(nuevo);
    }
}

