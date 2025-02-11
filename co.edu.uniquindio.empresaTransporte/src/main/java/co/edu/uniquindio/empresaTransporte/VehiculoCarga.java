package co.edu.uniquindio.empresaTransporte;

public class VehiculoCarga extends Vehiculo {
    public double capacidadCarga;
    public int numeroEjes;
    public VehiculoCarga(String marca, String modelo, String placa, String color, String numeroChasis,String responsable, double capacidadCarga, int numeroEjes) {
        super(marca, modelo, placa, color, numeroChasis,responsable);
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
}

