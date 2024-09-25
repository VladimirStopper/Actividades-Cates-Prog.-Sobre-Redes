package ejercicios;
import java.util.Scanner;
public class Ejercicio_2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int num;
        do 
        {
            System.out.print("Ingresa un número entero de 5 dígitos: ");
            num = scanner.nextInt();
        } 
        while (Integer.toString(num).length() != 5);
        int suma = 0;
        int temp = num;
        while (temp > 0)
        {
            suma += temp % 10;
            temp /= 10;
        }
        System.out.println("La suma de los dígitos de " + num + " es: " + suma);
        scanner.close();
    }
}
