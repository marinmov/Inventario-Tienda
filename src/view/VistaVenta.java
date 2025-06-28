package view;

import controller.VentaController;
import java.util.Scanner;

public class VistaVenta {
    private static Scanner scanner = new Scanner(System.in);

    public static void mostrarMenuVenta() {
        System.out.println("\n-- Menú de Ventas --");
        System.out.println("1. Agregar producto a la venta");
        System.out.println("2. Finalizar venta");
        System.out.println("3. Volver al menú principal");
        System.out.print("Seleccione una opción: ");
        String opcion = scanner.nextLine();

        switch (opcion) {
            case "1":
                System.out.print("ID del producto: ");
                String id = scanner.nextLine();
                VentaController.agregarProductoAVenta(id);
                break;
            case "2":
                VentaController.finalizarVenta();
                break;
            case "3":
                return;
            default:
                System.out.println("Opción no válida.");
        }
        mostrarMenuVenta();
    }
}
