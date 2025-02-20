package co.edu.uniquindio.empresaTransporte;

import co.edu.uniquindio.empresaTransporte.empresaTransporte.factory.ModelFactory;
import co.edu.uniquindio.empresaTransporte.empresaTransporte.model.EmpresaTransporte;
import java.util.Scanner;

public class MainTransporte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ModelFactory modelFactory = ModelFactory.getInstancia(); // ✅ Obtener instancia de ModelFactory
        EmpresaTransporte empresa = modelFactory.getEmpresaTransporte(); // ✅ Obtener empresa

        int opcion = 0;
        while (opcion != 10) {
            System.out.println("\nMenú:");
            System.out.println("0. Registrar propietario");
            System.out.println("1. Ingresar Vehiculo de carga");
            System.out.println("2. Ingresar vehiculo de transporte");
            System.out.println("3. Ingresar usuario");
            System.out.println("4. Buscar vehiculo por placa");
            System.out.println("5. Mostrar Vehiculos registrados ");
            System.out.println("6. Obtener usuarios por peso ");
            System.out.println("7. Obtener propietarios mayores de 40 años ");
            System.out.println("8. Ingresar un número de pasajeros a un vehículo de transporte");
            System.out.println("9. Mostrar número de pasajeros transportados por vehículo");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // ✅ Limpiar buffer después de `nextInt()`

            switch (opcion) {
                case 0:
                    modelFactory.ingresarPropietario(scanner);
                    break;
                case 1:
                    modelFactory.ingresarVehiculoCarga(scanner);
                    break;

                case 10:
                    System.out.println("✅ Saliendo del programa...");
                    break;
                default:
                    System.out.println("❌ Opción no válida. Intente nuevamente.");
            }
        }
        scanner.close(); // ✅ Cerrar Scanner al final del programa
    }
}
