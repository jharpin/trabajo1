package co.edu.uniquindio.empresaTransporte;

public class Usuario {
    public String nombre;
    public int edad;
    public double peso;
    public String vehiculoRegistrado;


    public Usuario(String nombre, int edad, double peso, String vehiculoRegistrado) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.vehiculoRegistrado = vehiculoRegistrado;

    }
    public String getNombre() {
        return nombre;
    }
    public void serNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void serEdad(int edad){
        this.edad = edad;
    }
    public double getPeso() {
        return peso;
    }
    public void serPeso(double peso){
        this.peso = peso;
    }
    public String getVehiculoRegistrado() {
        return vehiculoRegistrado;
    }
    public void serVehiculoRegistrado(String vehiculoRegistrado){
        this.vehiculoRegistrado = vehiculoRegistrado;
    }

}
