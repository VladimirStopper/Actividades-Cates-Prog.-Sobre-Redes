package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Articulo {
    String nombre;
    int cantidad;
    double precioUnitario;

    Articulo(String nombre, int cantidad, double precioUnitario) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    double total() {
        return cantidad * precioUnitario;
    }
}

public class Ejercicio_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Articulo> articulos = new ArrayList<>();
        double totalFactura = 0;

        System.out.print("Ingrese la cantidad de diferentes artículos: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre del artículo: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese la cantidad: ");
            int cantidad = scanner.nextInt();
            System.out.print("Ingrese el precio unitario: ");
            double precioUnitario = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer

            Articulo articulo = new Articulo(nombre, cantidad, precioUnitario);
            articulos.add(articulo);
            totalFactura += articulo.total();
        }

        System.out.println("\nFactura:");
        System.out.printf("%-20s %-10s %-10s %-10s%n", "Artículo", "Cantidad", "Precio Unit.", "Total");
        System.out.println("---------------------------------------------------");

        for (Articulo articulo : articulos) {
            System.out.printf("%-20s %-10d %-10.2f %-10.2f%n", articulo.nombre, articulo.cantidad, articulo.precioUnitario, articulo.total());
        }

        System.out.printf("Total a pagar: %.2f%n", totalFactura);
        scanner.close();
    }
}
