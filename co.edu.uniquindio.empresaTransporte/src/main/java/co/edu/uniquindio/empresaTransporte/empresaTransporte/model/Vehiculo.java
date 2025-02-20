package co.edu.uniquindio.empresaTransporte.empresaTransporte.model;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String placa;
    private String color;
    private String numeroChasis;
    private String responsable;
    public Vehiculo(String marca, String modelo, String placa, String color, String numeroChasis, String responsable) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.color = color;
        this.numeroChasis = numeroChasis;
        this.responsable = responsable;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;

    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getNumeroChasis() {
        return numeroChasis;
    }
    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }
    public String getResponsable() {
        return responsable;
    }
    public void setResponsable(String responsable){
        this.responsable = responsable;
    }

    @Override
    public String toString() {
        return"Vehiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", numeroChasis='" + numeroChasis + '\'' +
                ", responsable='" + responsable + '\'' ;
    }
}
