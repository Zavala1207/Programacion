import java.util.InputMismatchException;
import java.util.Scanner;
 
public class Moneda2 {
 
    public static void main(String[] args) {
 
        Scanner tc =new Scanner (System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        while (!salir) {
 
            System.out.println("1. Conversion");
            System.out.println("2. Salir");
            
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = tc.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese la moneda"); 
                        int numero = tc.nextInt();
                        System.out.println("Ingrese la conversion");
                        double conversion = tc.nextDouble();
                        double equivalencia = conversion / 500
                        System.out.println("La conversion es:"\n equivalencia);
                        break;
                    case 2:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                tc.next();
            }
        }
 
    }
 
}