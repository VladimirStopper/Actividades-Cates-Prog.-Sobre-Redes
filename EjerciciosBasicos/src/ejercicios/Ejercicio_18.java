package ejercicios;

import java.util.Scanner;

public class Ejercicio_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        StringBuilder binario = new StringBuilder();

        while (numero > 0) {
            binario.insert(0, numero % 2);
            numero /= 2;
        }

        System.out.println("El número en binario es: " + binario);
        scanner.close();
    }
}
