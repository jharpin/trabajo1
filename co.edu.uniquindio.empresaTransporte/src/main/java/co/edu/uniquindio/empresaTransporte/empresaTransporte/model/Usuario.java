package co.edu.uniquindio.empresaTransporte.empresaTransporte.model;

public class Usuario {
    private String nombre;
    private int edad;
    private double peso;
    private String vehiculoRegistrado;
    public Usuario(String nombre, int edad, double peso, String vehiculoRegistrado) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.vehiculoRegistrado = vehiculoRegistrado;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public String getVehiculoRegistrado() {
        return vehiculoRegistrado;
    }
    public void setVehiculoRegistrado(String vehiculoRegistrado){
        this.vehiculoRegistrado = vehiculoRegistrado;
    }

    @Override
    public String toString(){
        return "Usuario{" +
                ", Nombre= "+nombre+'\''+
                ", Edad= "+edad+'\''+
                ", Peso= "+peso+'\''+
                ", Vehiculo Registrado= "+vehiculoRegistrado+
                "}";
    }
}
