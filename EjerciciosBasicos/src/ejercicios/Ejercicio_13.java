package ejercicios;

import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        int original = numero, reverso = 0;

        while (numero > 0) {
            reverso = reverso * 10 + (numero % 10);
            numero /= 10;
        }

        if (original == reverso) {
            System.out.println(original + " es un número capicúa.");
        } else {
            System.out.println(original + " no es un número capicúa.");
        }
        scanner.close();
    }
}
