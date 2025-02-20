package co.edu.uniquindio.empresaTransporte.empresaTransporte.factory;
import co.edu.uniquindio.empresaTransporte.empresaTransporte.model.EmpresaTransporte;
import co.edu.uniquindio.empresaTransporte.empresaTransporte.model.Propietario;
import co.edu.uniquindio.empresaTransporte.empresaTransporte.model.VehiculoCarga;

import java.util.Scanner;

public class ModelFactory {
    private static ModelFactory instancia;
    private EmpresaTransporte empresaTransporte;
    private ModelFactory() {
        empresaTransporte = new EmpresaTransporte();
        inicializarDatos();
    }
    public static ModelFactory getInstancia() {
        if (instancia == null) {
            instancia = new ModelFactory();
        }
        return instancia;
    }
    public EmpresaTransporte getEmpresaTransporte() {
        return empresaTransporte;
    }
    public void inicializarDatos() {
        Propietario propietario1 = new Propietario("ANDRES", "18238712893", "andes@gmail.com", 10, "321570");
        Propietario propietario2 = new Propietario("FORTIS", "14927837828", "fortista@gmail.com", 80, "321341");
        Propietario propietario3 = new Propietario("AMANDA", "1690252982", "amanda@gmail.com", 14, "211562");
        VehiculoCarga vehiculoCarga1 = new VehiculoCarga("BMW1", "2001", "PAN1", "BLANCO", "as54", "pepito", 45.5, 3);
        VehiculoCarga vehiculoCarga2 = new VehiculoCarga("BMW2", "2002", "PAN2", "ROSADO", "fc55", "pedro", 34.6, 4);
        VehiculoCarga vehiculoCarga3 = new VehiculoCarga("MERCEDES", "2003", "PAN3", "NEGRO", "ea66", "fedrick", 6.26, 5);
        propietario1.agregarVehiculo(vehiculoCarga1);
        propietario2.agregarVehiculo(vehiculoCarga2);
        propietario3.agregarVehiculo(vehiculoCarga3);
        propietario1.asignarVehiculoPrincipal("PAN1");
        propietario2.asignarVehiculoPrincipal("PAN2");
        propietario3.asignarVehiculoPrincipal("PAN3");
        this.empresaTransporte.getPropietarios().add(propietario1);
        this.empresaTransporte.getPropietarios().add(propietario2);
        this.empresaTransporte.getPropietarios().add(propietario3);
        this.empresaTransporte.getVehiculosCarga().add(vehiculoCarga1);
        this.empresaTransporte.getVehiculosCarga().add(vehiculoCarga2);
        this.empresaTransporte.getVehiculosCarga().add(vehiculoCarga3);
    }
    public void ingresarPropietario(Scanner scanner) {
        System.out.print("Ingrese el nombre del propietario: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la cédula del propietario: ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese el email del propietario: ");
        String email = scanner.nextLine();
        System.out.print("Ingrese la edad del propietario: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el celular del propietario: ");
        String celular = scanner.nextLine();

        Propietario nuevoPropietario = new Propietario(nombre, cedula, email, edad, celular);
        empresaTransporte.getPropietarios().add(nuevoPropietario);

        System.out.println("✅ Propietario agregado correctamente.");
    }
    public void ingresarVehiculoCarga(Scanner scanner) {
        System.out.print("Ingrese la cédula del propietario: ");
        String cedula = scanner.nextLine();
        Propietario propietario = null;
        for (Propietario p : empresaTransporte.getPropietarios()) {
            if (p.getCedula().equals(cedula)) {
                propietario = p;
                break;
            }
        }
        if (propietario == null) {
            System.out.println("❌ Propietario no encontrado. Debe registrar el propietario primero.");
            return;
        }
        System.out.print("Ingrese la placa del vehículo: ");
        String placa = scanner.nextLine();
        for (VehiculoCarga v : empresaTransporte.getVehiculosCarga()) {
            if (v.getPlaca().equals(placa)) {
                System.out.println("❌ Ya existe un vehículo con esta placa.");
                return;
            }
        }
        System.out.print("Ingrese la marca del vehículo: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el modelo del vehículo: ");
        String modelo = scanner.nextLine();
        System.out.print("Ingrese el color del vehículo: ");
        String color = scanner.nextLine();
        System.out.print("Ingrese el número de chasis: ");
        String numeroChasis = scanner.nextLine();
        System.out.print("Ingrese la capacidad de carga: ");
        double capacidadCarga = scanner.nextDouble();
        System.out.print("Ingrese el número de ejes: ");
        int numeroEjes = scanner.nextInt();
        scanner.nextLine();
        VehiculoCarga nuevoVehiculo = new VehiculoCarga(marca, modelo, placa, color, numeroChasis, propietario.getCedula(), capacidadCarga, numeroEjes);
        propietario.agregarVehiculo(nuevoVehiculo);
        empresaTransporte.getVehiculosCarga().add(nuevoVehiculo);
        System.out.println("✅ Vehículo agregado correctamente al propietario " + propietario.getNombre());
    }




}
