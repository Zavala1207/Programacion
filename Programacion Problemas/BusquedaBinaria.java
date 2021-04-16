import java.util.Arrays;
 
public class BusquedaBinaria {
 
    public static void main(String[] args) {
        int[] array = { 10, 15, 20, 40, 50, 100, 120, 200, 400, 500, 600, 800, 2222 };
        int result = Arrays.binarySearch(array, 400);
        System.out.println(String.format("Result %d", result));
    }
}