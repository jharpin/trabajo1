package co.edu.uniquindio.empresaTransporte.empresaTransporte.model;

import java.util.ArrayList;

public class Propietario {
    private String nombre;
    private String cedula;
    private String email;
    private int edad;
    private String celular;
    private ArrayList<Vehiculo> vehiculos;
    private Vehiculo vehiculoPrincipal;
    public Propietario(String nombre, String cedula, String email, int edad, String celular) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.edad = edad;
        this.celular = celular;
        this.vehiculos = new ArrayList<>(); // ✅ Inicializar lista vacía
        this.vehiculoPrincipal = null;
    }


    public void agregarVehiculo(Vehiculo vehiculo) {
        if (!vehiculos.contains(vehiculo)) {
            vehiculos.add(vehiculo);
            System.out.println("✅ Vehículo agregado correctamente.");
        } else {
            System.out.println("⚠️ El vehículo ya está registrado con este propietario.");
        }
    }

    // ✅ Método para asignar un vehículo principal por placa
    public boolean asignarVehiculoPrincipal(String placa) {
        for (Vehiculo v : vehiculos) {
            if (v.getPlaca().equals(placa)) {
                this.vehiculoPrincipal = v;
                System.out.println("✅ Vehículo con placa " + placa + " asignado como principal.");
                return true;
            }
        }
        System.out.println("❌ No se encontró un vehículo con esa placa.");
        return false;
    }
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public Vehiculo getVehiculoPrincipal() {
        return vehiculoPrincipal;
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

    @Override
    public String toString() {
        return "Propietario: " + nombre + " | Cédula: " + cedula +
                " | Email: " + email + " | Edad: " + edad +
                " | Celular: " + celular +
                " | Vehículo Principal: " + (vehiculoPrincipal != null ? vehiculoPrincipal.getPlaca() : "Ninguno");
    }


}
