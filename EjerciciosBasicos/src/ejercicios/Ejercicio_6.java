package ejercicios;

public class Ejercicio_6 {
    public static void main(String[] args) {
        long poblacionActual = 7309784505L;
        long crecimientoAnual = 24807909;

        System.out.println("Población mundial en los próximos 5 años:");
        for (int i = 1; i <= 5; i++) {
            poblacionActual += crecimientoAnual;
            System.out.printf("Año %d: %d%n", i, poblacionActual);
        }
    }
}
