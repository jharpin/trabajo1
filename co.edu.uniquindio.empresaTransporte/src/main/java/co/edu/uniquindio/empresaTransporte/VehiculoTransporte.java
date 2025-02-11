package co.edu.uniquindio.empresaTransporte;

public class VehiculoTransporte extends Vehiculo{
    public int maxPasajeros;

    public VehiculoTransporte(String marca, String modelo, String placa, String color, int numeroChasis, int maxPasajeros) {
        super(marca,modelo,placa,color,numeroChasis);
        this.maxPasajeros=numeroChasis;
    }

    public int getMaxPasajeros() {
        return maxPasajeros;
    }
    public void setMaxPasajeros(int maxPasajeros) {
        this.maxPasajeros = maxPasajeros;
    }
    public String toString(){
        return super.toString()+" ,maxPasajeros: "+maxPasajeros;
    }
}
