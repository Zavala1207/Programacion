
package SistemaFabrica;

import java.util.Scanner;


public class VehiculosVista {

    VehiculosVista(SistemaVehiculos fv) {
        
    }
    
    public int mostrarMenuVehiculo() {
        Scanner s = new Scanner(System.in);
        System.out.println("""
                           Menu
                            1. Color del Vehiculo 
                            2. Marca del Vehiculo
                           3. Modelo del Vehiculo  
                            Salir""");
        int menu = s.nextInt();
        
        return menu;
    }
    
    public int mostrarMenu() {
        Scanner s = new Scanner(System.in);
        System.out.println("""
                           Menu Opciones
                            1. Mostrar Vehiculos en Bodega 
                            2. Mostrar Vehiculos Vendidos
                            3. Mostrar Vehiculos Devueltos 
                            4. Agregar Vehiculo
                            5.  Establecer Estado del Vehiculo 
                            6.Salir""");
        int menu = s.nextInt();
        
        return menu;
    }
}
