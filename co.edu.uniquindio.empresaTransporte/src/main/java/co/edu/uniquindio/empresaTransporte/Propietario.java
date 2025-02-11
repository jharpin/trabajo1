package co.edu.uniquindio.empresaTransporte;

public class Propietario {
    private String nombre;
    private String cedula;
    private String email;
    private String edad;
    private String celular;
    private String vehiculoRegistrado;

    public Propietario(String nombre, String cedula, String email, String edad, String celular, String vehiculoRegistrado) {
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
    public String getEdad() {
        return edad;
    }
    public void setEdad(String edad){
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
