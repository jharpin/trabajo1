package co.edu.uniquindio.empresaTransporte;

public class Vehiculo {
    public String marca;
    public String modelo;
    public String placa;
    public String color;
    public int numeroChasis;

    public Vehiculo(String marca, String modelo, String placa, String color, int numeroChasis) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.color = color;
        this.numeroChasis = numeroChasis;
    }

    public String mostrarVehiculo() {
        String info="la info del vehiculo es "+toString();
        System.out.println(info);
        return info;
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
    public int getNumeroChasis() {
        return numeroChasis;
    }
    public void setNumeroChasis(int numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public String toString() {
        return "modelo: "+modelo +" ,placa: "+placa+" ,color: "+color+" ,numeroChasis: "+numeroChasis;
    }
}
