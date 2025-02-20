package co.edu.uniquindio.empresaTransporte.empresaTransporte.model;

import java.util.ArrayList;
public class EmpresaTransporte {
    private String nombre;
    public ArrayList<Propietario>propietarios;
    public ArrayList<VehiculoCarga>vehiculosCarga;
    public ArrayList<VehiculoTransporte>vehiculosTransporte;
    public ArrayList<Usuario>usuarios;
    public EmpresaTransporte() {
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Propietario> getPropietarios() {
        return propietarios;
    }
    public void setPropietarios(ArrayList<Propietario> propietarios) {
        this.propietarios = propietarios;
    }
    public ArrayList<VehiculoCarga> getVehiculosCarga() {
        return vehiculosCarga;
    }
    public void setVehiculosCarga(ArrayList<VehiculoCarga> vehiculosCarga) {
        this.vehiculosCarga = vehiculosCarga;
    }
    public ArrayList<VehiculoTransporte> getVehiculosTransporte() {
        return vehiculosTransporte;
    }
    public void setVehiculosTransporte(ArrayList<VehiculoTransporte> vehiculosTransporte) {
        this.vehiculosTransporte = vehiculosTransporte;
    }
}
