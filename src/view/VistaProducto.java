package view;

import java.util.Scanner;
import controller.ProductoController;
import model.Inventario;

public class VistaProducto {
    private static Scanner scanner = new Scanner(System.in);

    public static void mostrarMenuProductos() {
        System.out.println("\n-- Menú de Productos --");
        System.out.println("1. Registrar producto");
        System.out.println("2. Ver inventario");
        System.out.println("3. Volver al menú principal");
        System.out.print("Seleccione una opción: ");

        String opcion = scanner.nextLine();
        switch (opcion) {
            case "1":
                registrarProducto();
                break;
            case "2":
                Inventario.obtenerProductos().forEach(System.out::println);
                break;
            case "3":
                return;
            default:
                System.out.println("Opcion no válida.");
        }
        mostrarMenuProductos();
    }

    private static void registrarProducto() {
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Precio: ");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.print("Stock: ");
        int stock = Integer.parseInt(scanner.nextLine());

        ProductoController.registrarProducto(id, nombre, precio, stock);
        System.out.println("Producto registrado exitosamente!");
    }
}
