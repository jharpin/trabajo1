package co.edu.uniquindio.empresaTransporte;

public class Vehiculo {
    public String marca;
    public String modelo;
    public String placa;
    public String color;
    public String numeroChasis;
    public String responsable;
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
    public String getCorlor() {
        return color;
    }
    public void setCorlor(String corlor){
        this.color = corlor;
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
    public void setResponsable(String responsbale){
        this.responsable = responsable;
    }
}
