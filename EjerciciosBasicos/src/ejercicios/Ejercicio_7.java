package ejercicios;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cantidad en pesos: ");
        int cantidad = scanner.nextInt();

        int[] billetes = {1000, 500, 200, 100, 50, 20, 10, 5, 1};
        System.out.println("Cantidad mínima de billetes y monedas:");

        for (int billete : billetes) {
            int cantidadBilletes = cantidad / billete;
            if (cantidadBilletes > 0) {
                System.out.printf("%d billetes de %d pesos%n", cantidadBilletes, billete);
                cantidad %= billete;
            }
        }
        scanner.close();
    }
}
