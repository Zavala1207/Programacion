import java.util.InputMismatchException;
import java.util.Scanner;
 
public class Moneda {
    double valor;
    String nombre;
    
    public static void main(String[] args) {
        
        moneda.valor = 0;
 
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        double dolares = 0, colones = 0, euros;
        while (!salir) {
 
            System.out.println("1. Colones a Dolares");
            System.out.println("2. Colones a euros");
            System.out.println("3. Salir");
 
            try {
 
                System.out.println("Seleccione una opcion");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese la cantidad de colones");
                        colones = sn.nextDouble();
                        break;
                    case 2:
                        System.out.println("Ingrese la cantidad de colones");
                        colones = sn.nextDouble();
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 2");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
            double equivalencia = colones / 500;
            System.out.printf("%f colones equivalen a %f dolares\n", colones, equivalencia);
        }
 
    }
 
}