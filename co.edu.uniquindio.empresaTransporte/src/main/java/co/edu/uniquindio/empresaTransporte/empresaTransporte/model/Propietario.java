package co.edu.uniquindio.empresaTransporte.empresaTransporte.model;

public class Propietario {
    public String nombre;
    public String cedula;
    public String email;
    public int edad;
    public String celular;
    public String vehiculoRegistrado;
    public Propietario(String nombre, String cedula, String email, int edad, String celular, String vehiculoRegistrado) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.edad = edad;
        this.celular = celular;
        this.vehiculoRegistrado = vehiculoRegistrado;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula){
        this.cedula=cedula;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular){
        this.celular=celular;
    }
    public String getVehiculoRegistrado() {
        return vehiculoRegistrado;
    }
    public void setVehiculoRegistrado(String vehiculoRegistrado) {
        this.vehiculoRegistrado = vehiculoRegistrado;
    }

}
