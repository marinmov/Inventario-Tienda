package model;

import java.util.ArrayList;
import java.util.List;

public class Venta {
    private List<Producto> productosVendidos = new ArrayList<>();
    private double total = 0.0;

    public void agregarProducto(Producto p) {
        productosVendidos.add(p);
        total += p.getPrecio();
    }

    public double getTotal() {
        return total;
    }

    public List<Producto> getProductosVendidos() {
        return productosVendidos;
    }
}
