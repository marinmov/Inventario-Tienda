package view;

import java.util.Scanner;

public class MenuPrincipal {
    public static void iniciar() {
        Scanner scanner = new Scanner(System.in);
        String opcion;
        do {
            System.out.println("\n-- Punto de Venta --");
            System.out.println("1. Administrar productos");
            System.out.println("2. Realizar venta");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    VistaProducto.mostrarMenuProductos();
                    break;
                case "2":
                    VistaVenta.mostrarMenuVenta();
                    break;
                case "3":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (!opcion.equals("3"));
    }
}

