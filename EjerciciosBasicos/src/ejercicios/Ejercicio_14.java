package ejercicios;

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la fecha en formato dd mm aaaa: ");
        String fecha = scanner.nextLine();
        String[] partes = fecha.split(" ");
        
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int año = Integer.parseInt(partes[2]);

        String[] mesesTexto = {
            "", "enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        };

        System.out.printf("%d de %s de %d%n", dia, mesesTexto[mes], año);
        scanner.close();
    }
}
