
package SistemaFabrica;


public class Vehiculo {
    int annocompra;
    String color;
    String marca;
    String modelo;
    Motor motor;
    Neumatico Neumatico;
    String vendido;

    public String getVendido() {
        return vendido;
    }

    public void setVendido(String vendido) {
        this.vendido = vendido;
    }

    
    public Vehiculo(String color, String marca, String modelo, int annocompra) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.annocompra = annocompra;
    }

    public boolean vendido(boolean vendido) {
        return false;
    }

    Vehiculo() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Vehiculo(Motor motor, Neumatico,) {
        this.motor = motor;
        this.Neumatico = Neumatico;
        
    }

    public int getAñoCompra() {
        return annocompra;
    }

    public void setAñoCompra(int annocompra) {
        this.annocompra = annocompra;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Neumatico getNeumatico() {
        return Neumatico;
    }

    public void setLlanta1(Neumatico) {
        this.Neumatico = Neumatico;
    }

   

}
