package ejercicios;

import java.util.Scanner;

public class Ejercicio_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una hora en formato hh:mm:ss: ");
        String[] hora = scanner.nextLine().split(":");
        
        int horas = Integer.parseInt(hora[0]);
        int minutos = Integer.parseInt(hora[1]);
        int segundos = Integer.parseInt(hora[2]);

        System.out.print("Ingrese la cantidad de segundos a agregar: ");
        int n = scanner.nextInt();
        
        segundos += n;
        minutos += segundos / 60;
        horas += minutos / 60;

        segundos %= 60;
        minutos %= 60;
        horas %= 24;

        System.out.printf("La nueva hora es: %02d:%02d:%02d%n", horas, minutos, segundos);
        scanner.close();
    }
}
