
package SistemaFabrica;

public class VehiculosControlador {
    Vehiculo v;
    Motor m;
    Neumatico l;
    SistemaVehiculos fv = new SistemaVehiculos();
    VehiculosVista w = new VehiculosVista(fv);
    


    public void iniciar() {
        while (true) {

            int option = w.mostrarMenu();
            
            switch (option) {
                case 1:{
                    fv.vehiculosBodega();
                    break;
                }
                case 2:{
                    fv.agregarVehiculo(v);
                    
                    break;
                }
                case 3:{
                    fv.agregarMotor(m);
                    
                    break;
                }
                case 4:{
                    fv.agregarNeumatico(l);
                    
                    break;
                }
                case 5:{
                    fv.vehiculoVendido();
                    break;
                }
                case 6:{
                    fv.establecerEstado();
                    
                    break;
                }
                   
            }
        }
    }
}
