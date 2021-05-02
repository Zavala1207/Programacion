import java.util.Arrays;
import java.util.Scanner;

public class BusquedaBinaria
{
    public static void main(String[] args)
    {
        int i;
        int[] numeros = new int[5];

        Scanner teclado = new Scanner(System.in);

        for(i=0; i<numeros.length; i++)
        {
            System.out.printf("Introduzca número %d: ", i+1);
            numeros[i] = teclado.nextInt();
        }

        for(i=0; i<numeros.length; i++)
        {
            System.out.println(numeros[i]);
            int numberToSearch = 0;
            
            if (Arrays.binarySearch(numeros, numberToSearch)>0)
  System.out.println("El número " + numberToSearch + " está en el Array");
else 
  System.out.println("El número " + numberToSearch + " NO está en el Array");
        }
    }
}