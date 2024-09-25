package ejercicios;

import java.util.Scanner;

public class Ejercicio_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la velocidad en Km/h: ");
        double kmh = scanner.nextDouble();
        double mps = kmh / 3.6;

        System.out.printf("La velocidad en m/s es: %.2f m/s%n", mps);
        scanner.close();
    }
}
