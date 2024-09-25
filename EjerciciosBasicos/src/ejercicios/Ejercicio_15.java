package ejercicios;

import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de segundos: ");
        int segundos = scanner.nextInt();

        int horas = segundos / 3600;
        segundos %= 3600;
        int minutos = segundos / 60;
        segundos %= 60;

        System.out.printf("%d horas, %d minutos y %d segundos%n", horas, minutos, segundos);
        scanner.close();
    }
}
