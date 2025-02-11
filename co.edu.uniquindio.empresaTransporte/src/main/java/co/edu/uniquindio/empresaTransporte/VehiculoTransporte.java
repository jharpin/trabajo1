package co.edu.uniquindio.empresaTransporte;

public class VehiculoTransporte extends Vehiculo{
    public int maxPasajeros;
    private int pasajerosTransportados;

    public VehiculoTransporte(String marca, String modelo, String placa, String color, String numeroChasis, int maxPasajeros,String responsable,int maximoPasajeros) {
        super(marca,modelo,placa,color,numeroChasis,responsable);
        this.maxPasajeros = maxPasajeros;
        this.pasajerosTransportados = 0;
    }

    public void transportarPasajeros(int numeroPasajeros) {
        this.pasajerosTransportados += numeroPasajeros;
    }

    public int getMaxPasajeros() {
        return maxPasajeros;
    }
    public void setMaxPasajeros(int maxPasajeros) {
        this.maxPasajeros = maxPasajeros;
    }

}
