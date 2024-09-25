package ejercicios;
public class Ejercicio_3 
{
    public static void main(String[] args) 
    {
        System.out.printf("%-10s %-10s %-10s%n", "Número", "Cuadrado", "Cubo");
        System.out.println("-----------------------------------");
        for (int i = 0; i <= 10; i++) 
        {
            int cuadrado = i * i;
            int cubo = i * i * i;
            System.out.printf("%-10d %-10d %-10d%n", i, cuadrado, cubo);
        }
    }
}