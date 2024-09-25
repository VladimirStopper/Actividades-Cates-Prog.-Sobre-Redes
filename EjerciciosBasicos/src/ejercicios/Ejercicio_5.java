package ejercicios;

public class Ejercicio_5 {
    public static void main(String[] args) {
        int n1 = 1, n2 = 1;
        System.out.println("Los primeros 20 números de la sucesión de Fibonacci son:");
        System.out.print(n1 + ", " + n2);

        for (int i = 3; i <= 20; i++) {
            int n3 = n1 + n2;
            System.out.print(", " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }
}
