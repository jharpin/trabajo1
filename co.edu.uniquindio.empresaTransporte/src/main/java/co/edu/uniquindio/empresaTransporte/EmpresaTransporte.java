package co.edu.uniquindio.empresaTransporte;

import java.util.ArrayList;


public class EmpresaTransporte {
    public ArrayList<Propietario>propietarios;
    public ArrayList<VehiculoCarga>vehiculosCarga;
    public ArrayList<VehiculoTransporte>vehiculosTransporte;
    public ArrayList<Usuario>usuarios;

    public EmpresaTransporte() {
        propietarios = new ArrayList<>();
        vehiculosCarga = new ArrayList<>();
        vehiculosTransporte = new ArrayList<>();
        usuarios = new ArrayList<>();

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
