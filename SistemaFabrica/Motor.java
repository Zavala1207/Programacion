
package SistemaFabrica;


public class Motor {
    
    String marca;
    String modelo;
    
    
    public Motor(String marca, String modelo) {
        
        this.marca = marca;
        this.modelo = modelo;
    }

   
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNunserie() {
        return modelo;
    }

    public void setNunserie(String modelo) {
        this.modelo = modelo;
    }
    
    
}
