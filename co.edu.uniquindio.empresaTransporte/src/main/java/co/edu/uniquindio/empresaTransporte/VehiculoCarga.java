package co.edu.uniquindio.empresaTransporte;

public class VehiculoCarga extends Vehiculo {
    public double capacidadCarga;
    public int numeroEjes;
    public VehiculoCarga(String marca, String modelo, String placa, String color, int numeroChasis, double capacidadCarga, int numeroEjes) {
        super(marca, modelo, placa, color, numeroChasis);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }
    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    public int getNumeroEjes() {
        return numeroEjes;
    }
    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }
     public String toString() {
        return super.toString()+" ,Capcacidad de carga: " + capacidadCarga +" toneladas"+ ", ejes: " + numeroEjes;
     }
}

