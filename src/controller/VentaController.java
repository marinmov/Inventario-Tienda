package controller;

import model.Inventario;
import model.Producto;
import model.Venta;

public class VentaController {
    private static Venta ventaActual = new Venta();

    public static void agregarProductoAVenta(String idProducto) {
        Producto p = Inventario.buscarPorId(idProducto);
        if (p != null && p.getStock() > 0) {
            ventaActual.agregarProducto(p);
            p.setStock(p.getStock() - 1);
        } else {
            System.out.println("Producto no encontrado o sin stock disponible.");
        }
    }

    public static void finalizarVenta() {
        System.out.println("\nVenta finalizada. Total: $" + ventaActual.getTotal());
        System.out.println("Productos vendidos:");
        ventaActual.getProductosVendidos().forEach(System.out::println);
        ventaActual = new Venta();
    }
}
