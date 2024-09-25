package ejercicios;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor del préstamo: ");
        double prestamo = scanner.nextDouble();
        System.out.print("Ingrese el porcentaje de interés anual: ");
        double interesAnual = scanner.nextDouble();
        System.out.print("Ingrese el pago mensual: ");
        double pagoMensual = scanner.nextDouble();

        double interesMensual = interesAnual / 100 / 12;
        int meses = 0;

        while (prestamo > 0) {
            prestamo = prestamo * (1 + interesMensual) - pagoMensual;
            meses++;
        }

        int años = meses / 12;
        meses = meses % 12;
        System.out.printf("Se tardará %d años y %d meses en pagar el préstamo.%n", años, meses);
        scanner.close();
    }
}
