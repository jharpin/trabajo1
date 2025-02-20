package co.edu.uniquindio.empresaTransporte.empresaTransporte.model;

public class VehiculoTransporte extends Vehiculo{
    public int maximoPasajeros;
    public int pasajerosTransportados;
    public VehiculoTransporte(String marca, String modelo, String placa, String color, String numeroChasis,String responsable,int maximoPasajeros) {
        super(marca,modelo,placa,color,numeroChasis,responsable);
        this.maximoPasajeros = maximoPasajeros;
        this.pasajerosTransportados = 0;
    }
    public String transportarPasajeros(int numeroPasajeros) {
        if (numeroPasajeros <= maximoPasajeros) {  // Se usa maximoPasajeros sin el getter
            this.pasajerosTransportados += numeroPasajeros;
            return "Pasajeros agregados correctamente";  // MENSAJE MODIFICADO
        } else {
            return "No se pueden agregar " + numeroPasajeros + " pasajeros. Máximo permitido: " + maximoPasajeros;
        }
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

}
