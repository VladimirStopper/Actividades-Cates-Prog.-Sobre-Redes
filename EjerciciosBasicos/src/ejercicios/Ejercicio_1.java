package ejercicios;
import java.util.Scanner;
public class Ejercicio_1 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu peso en la Tierra (kg): ");
        double pesoTierra = scanner.nextDouble();
        double pesoLuna = pesoTierra * 0.17;
        System.out.println("Tu peso en la Luna sería: " + pesoLuna + " kg");
        scanner.close();
    }
}