package ejercicios;

import java.util.Scanner;

public class Ejercicio_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese el valor de c: ");
        double c = scanner.nextDouble();

        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.printf("Las raíces son: %.2f y %.2f%n", raiz1, raiz2);
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a);
            System.out.printf("La raíz es: %.2f%n", raiz);
        } else {
            System.out.println("No hay raíces reales.");
        }
        scanner.close();
    }
}
