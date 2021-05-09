
package SistemaFabrica;


public class SistemaVehiculos {
    
    int veh;
    Vehiculo vehiculo;
    Motor motor;
    Neumatico Neumatico;
    SistemaVehiculos() {

    }

    public void vehiculosBodega() {
        for (int i = 0; i < 1000; i++) {
            if (vehiculo[i].equals("    ") == false) {
                System.out.println(i + "    Vehiculos   " + "  :   " + vehiculo[i]);
            }
        }
    }

    public boolean agregarVehiculo(Vehiculo v) {
        boolean resultado = false;
        if (veh < 10) {
            vehiculo[veh] = v;
            veh++;
            resultado = true;
        }
        return resultado;
    }

    public boolean agregarMotor(Motor m) {
        boolean resultado = false;
        if (veh < 10) {
            motor[veh] = m;
            veh++;
            resultado = true;
        }
        return resultado;
    }

    public boolean agregarNeumatico(Neumatico l) {
        boolean resultado = false;
        if (veh < 10) {
            Neumatico[veh] = l;
            veh++;
            resultado = true;
        }
        return resultado;
    }

    public boolean vehiculoVendido( ) {
        boolean resultado = false;
        if (veh != 0) {
            veh--;
            vehiculo[veh - 1] = null;;
            resultado = true;
        }
        return resultado;
    }

    public void establecerEstado( ) {
        for(int i=0;i<veh; i++){
            if(vehiculo[i]!=null)
            System.out.println(vehiculo[i].getVendido());
            System.out.println(vehiculo[i].toString());
        }

    }

    public SistemaFabrica(Vehiculo,  motor, Neumatico,) {
        this.vehiculo = vehiculo;
        this.motor = motor;
        this.neumatico = neumatico;
    }

    public Vehiculo[] getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Motor[] getMotor() {
        return motor;
    }

    public void setMotor(motor) {
        this.motor = motor;
    }

    public  getNeumatico() {
        return neumatico;
    }

    public void setNeumatico(neumatico) {
        this.neumatico = neumatico;
    }

}
