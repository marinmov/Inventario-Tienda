package model;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private static List<Producto> productos = new ArrayList<>();

    public static void agregarProducto(Producto p) {
        productos.add(p);
    }

    public static List<Producto> obtenerProductos() {
        return productos;
    }

    public static Producto buscarPorId(String id) {
        return productos.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }
}
