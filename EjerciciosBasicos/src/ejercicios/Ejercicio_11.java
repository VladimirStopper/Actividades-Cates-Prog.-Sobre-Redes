package ejercicios;

import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la duración de la llamada en minutos: ");
        int minutos = scanner.nextInt();
        double costo;

        if (minutos <= 5) {
            costo = 5;
        } else {
            costo = 5 + (minutos - 5) * 0.5;
        }

        System.out.printf("El monto a pagar por la llamada es: %.2f pesos%n", costo);
        scanner.close();
    }
}
