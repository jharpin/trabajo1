package co.edu.uniquindio.empresaTransporte;

public class VehiculoTransporte extends Vehiculo{
    public int maximoPasajeros;
    public int pasajerosTransportados;

    public VehiculoTransporte(String marca, String modelo, String placa, String color, String numeroChasis,String responsable,int maximoPasajeros) {
        super(marca,modelo,placa,color,numeroChasis,responsable);
        this.maximoPasajeros = maximoPasajeros;
        this.pasajerosTransportados = 0;
    }

    public String transportarPasajeros(int numeroPasajeros) {
        String mensaje;
        if(numeroPasajeros<=getMaximoPasajeros()){
            this.pasajerosTransportados += numeroPasajeros;
            mensaje="los pasajeros se agregaron correctamente";
            System.out.println(mensaje);
        }
        else {
            mensaje="los pasajeros sobrepasan el maximo";
            System.out.println(mensaje);
        }
        return mensaje;
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
