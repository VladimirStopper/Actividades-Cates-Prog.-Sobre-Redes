package ejercicios;
public class Ejercicio_4 
{
    public static void main(String[] args) 
    {
        int count = 0;
        for (int i = 30; i <= 126; i++) 
        {
            System.out.printf("%c ", (char)i);
            count++;
            if (count % 15 == 0) 
            {
                System.out.println();
            }
        }
    }
}
