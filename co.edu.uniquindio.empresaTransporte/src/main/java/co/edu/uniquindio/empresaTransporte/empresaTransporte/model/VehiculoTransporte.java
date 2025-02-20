package co.edu.uniquindio.empresaTransporte.empresaTransporte.model;

public class VehiculoTransporte extends Vehiculo{
    private int maximoPasajeros;
    private int pasajerosTransportados;
    public VehiculoTransporte(String marca, String modelo, String placa, String color, String numeroChasis,String responsable,int maximoPasajeros) {
        super(marca,modelo,placa,color,numeroChasis,responsable);
        this.maximoPasajeros = maximoPasajeros;
        this.pasajerosTransportados = 0;
    }
    public int getMaximoPasajeros() {
        return maximoPasajeros;
    }
    public void setMaxPasajeros(int maximoPasajeros) {
        this.maximoPasajeros = maximoPasajeros;
    }
    public int getPasajerosTransportados() {
        return pasajerosTransportados;
    }
    public void setPasajerosTransportados(int pasajerosTransportados) {
        this.pasajerosTransportados = pasajerosTransportados;
    }
    @Override
    public String toString() {
        return super.toString()+
                ", MaximoPasajeros= "+maximoPasajeros+'\''+
                ", PasajerosTransportados= "+pasajerosTransportados+
                "}";

    }

}
