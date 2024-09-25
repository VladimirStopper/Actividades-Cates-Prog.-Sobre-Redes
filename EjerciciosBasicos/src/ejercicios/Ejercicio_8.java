package ejercicios;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        int radio = scanner.nextInt();
        
        double pi = 3.14159;
        double diametro = 2 * radio;
        double circunferencia = 2 * pi * radio;
        double area = pi * radio * radio;

        System.out.printf("Diámetro: %.2f%nCircunferencia: %.2f%nÁrea: %.2f%n", diametro, circunferencia, area);
        scanner.close();
    }
}
