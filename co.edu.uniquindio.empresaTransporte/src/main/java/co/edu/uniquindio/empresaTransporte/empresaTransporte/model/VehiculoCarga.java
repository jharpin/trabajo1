package co.edu.uniquindio.empresaTransporte.empresaTransporte.model;

public class VehiculoCarga extends Vehiculo {
    private double capacidadCarga;
    private int numeroEjes;
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

    @Override
    public String toString() {
        return super.toString()+
               ", Capacidad Carga= "+capacidadCarga+'\''+
                ", Numero Ejes= "+numeroEjes+
                "}";

    }
}

