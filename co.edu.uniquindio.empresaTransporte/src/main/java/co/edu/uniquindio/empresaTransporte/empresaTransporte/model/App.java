package co.edu.uniquindio.empresaTransporte.empresaTransporte.model;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        EmpresaTransporte empresa= new EmpresaTransporte();
        inicializarDatos(empresa);
        int opcion=0;
        while (opcion!=10 && opcion <10) {
            System.out.println("\nMenú:");
            System.out.println("1. Ingresar Vehiculo de carga");
            System.out.println("2. Ingresar vehiculo de transporte");
            System.out.println("3. Ingresar usuario");
            System.out.println("4. Buscar vehiculo por placa");
            System.out.println("5. Mostrar Vehiculos registrados ");
            System.out.println("6. Obtener usuarios por peso ");
            System.out.println("7. Obtener propietarios mayores de 40 años ");
            System.out.println("8. ingresar un numero de pasajeros a un vehiculo transporte");
            System.out.println("9. Mostrar número de pasajeros transportados por vehículo");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    ingresarVehiculoCarga(scanner,empresa);
                    break;
                case 2:
                    ingresarVehiculoTransporte(scanner,empresa);
                    break;
                case 3:
                    ingresarUsuario(scanner,empresa);
                    break;
                case 4:
                    buscarVehiculoPlaca(scanner,empresa);
                    break;

                case 5:
                    mostrarVehiculos(scanner, empresa);
                    break;
                case 6:
                    obtenerUsuariosPorPeso(scanner, empresa);
                    break;
                case 7:
                    obtenerPropietariosMayoresDe40(empresa);
                    break;
                case 8:
                    ingresarPasajerosaVehiculoTransporte(scanner, empresa);
                    break;
                case 9:
                    mostrarPasajerosTransportados(scanner, empresa);
                    break;
            }
        }
    }
    public static void inicializarDatos(EmpresaTransporte empresa){
        Propietario propietario1= new Propietario("ANDRES", "18238712893", "andes@gmail.com", 10,"321570", null);
        Propietario propietario2= new Propietario("FORTIS", "14927837828", "fortista@gmail.com", 80,"321341", null);
        Propietario propietario3= new Propietario("AMANDA", "1690252982", "amanda@gmail.com", 14,"211562", null);
        Propietario propietario4= new Propietario("PEDRO", "1390279983", "pedro@gmail.com", 42,"651563", null);
        Propietario propietario5= new Propietario("SAMUEL", "1090212984", "samuel@gmail.com", 23,"321294", null);
        VehiculoCarga vehiculoCarga1= new VehiculoCarga("BMW1","2001","PAN1",   "BLANCO","as54","pepito", 45.5, 3);
        propietario1.vehiculoRegistrado=vehiculoCarga1.placa;
        VehiculoCarga vehiculoCarga2= new VehiculoCarga("BMW2", "2002", "PAN2", "ROSADO", "fc55"," pedro",34.6,4 );
        propietario2.vehiculoRegistrado=vehiculoCarga2.placa;
        VehiculoCarga vehiculoCarga3= new VehiculoCarga("MERCEDES", "2003", "PAN3", "NEGRO","ea66", "fedrick",6.26 , 5);
        propietario3.vehiculoRegistrado=vehiculoCarga3.placa;
        VehiculoCarga vehiculoCarga4= new VehiculoCarga("BMW3", "2004", "PAN4", "CAFE","wa488", "hasdf",7.26 , 6 );
        propietario4.vehiculoRegistrado=vehiculoCarga4.placa;
        VehiculoCarga vehiculoCarga5= new VehiculoCarga("TOYOTA", "2005", "PAN5", "AMARILLO","gt56", "wilson", 8.26 , 7);
        propietario5.vehiculoRegistrado=vehiculoCarga5.placa;
        Usuario usuario1 = new Usuario("jean",19,72.0,"BMW1");
        Usuario usuario2 = new Usuario("jonny",23,40,"BMW2");
        Usuario usuario3 = new Usuario("jes",34,90,"TOYOTA");
        empresa.usuarios.add(usuario1);
        empresa.usuarios.add(usuario2);
        empresa.usuarios.add(usuario3);
        empresa.propietarios.add(propietario1);
        empresa.propietarios.add(propietario2);
        empresa.propietarios.add(propietario3);
        empresa.propietarios.add(propietario4);
        empresa.propietarios.add(propietario5);
        empresa.vehiculosCarga.add(vehiculoCarga1);
        empresa.vehiculosCarga.add(vehiculoCarga2);
        empresa.vehiculosCarga.add(vehiculoCarga3);
        empresa.vehiculosCarga.add(vehiculoCarga4);
        empresa.vehiculosCarga.add(vehiculoCarga5);
        Propietario propietario6= new Propietario("ander", "109027210", "ander@gmail.com", 56 ,"321570", null);
        Propietario propietario7= new Propietario("juan", "109027211", "juan@gmail.com", 32,"347838", null);
        Propietario propietario8= new Propietario("pepe", "1090272212", "pepe@gmail.com", 20,"3232038", null);
        VehiculoTransporte vehiculoTransporte1= new VehiculoTransporte("TOYOTA","2020","ABC123",   "MORADO","nj16","kdnjiwd",9 );
        propietario6.vehiculoRegistrado=vehiculoTransporte1.placa;
        VehiculoTransporte vehiculoTransporte2= new VehiculoTransporte("TOYOTA","2020","ABC234",   "AZUL","nk12","edckmd", 6);
        propietario7.vehiculoRegistrado=vehiculoTransporte2.placa;
        VehiculoTransporte vehiculoTransporte3= new VehiculoTransporte("TOYOTA","2020","ABC345",   "ROJO","cd28", "msdjns",  40);
        propietario8.vehiculoRegistrado=vehiculoTransporte3.placa;
        empresa.propietarios.add(propietario6);
        empresa.propietarios.add(propietario7);
        empresa.propietarios.add(propietario8);
        empresa.vehiculosTransporte.add(vehiculoTransporte1);
        empresa.vehiculosTransporte.add(vehiculoTransporte2);
        empresa.vehiculosTransporte.add(vehiculoTransporte3);
    }
    public static void ingresarVehiculoCarga(Scanner scanner, EmpresaTransporte empresa){
        Propietario propietario= new Propietario(null, null, null,0,null, null);
        VehiculoCarga vehiculoCarga= new VehiculoCarga(null, null, null, null,null,null,0.0, 0);
        scanner.nextLine();
        System.out.println("Ingrese el nombre del propietario : ");
        propietario.nombre = scanner.nextLine();
        System.out.print("Ingrese la cedula del propietario : ");
        propietario.cedula = scanner.nextLine();
        vehiculoCarga.responsable=propietario.cedula;
        System.out.print("Ingrese el email del propietario : ");
        propietario.email  = scanner.nextLine();
        System.out.print("Ingrese la edad del propietario : ");
        propietario.edad = scanner.nextInt();
        System.out.print("Ingrese el telefono del propietario : ");
        propietario.celular = scanner.nextLine();
        System.out.print("Ingrese la placa del vehiculo de carga : ");
        propietario.vehiculoRegistrado = scanner.nextLine();
        vehiculoCarga.placa=propietario.vehiculoRegistrado;
        System.out.print("Ingrese el modelo del Vehiculo ");
        vehiculoCarga.modelo = scanner.nextLine();
        System.out.print("Ingrese la marca del vehiculo: ");
        vehiculoCarga.marca = scanner.nextLine();
        System.out.print("Ingrese el color del vehiculo: ");
        vehiculoCarga.color = scanner.nextLine();
        System.out.print("Ingrese la capacidad del vehiculo: ");
        vehiculoCarga.capacidadCarga = scanner.nextDouble();
        System.out.println("Ingrese el numero del chasis: ");
        vehiculoCarga.numeroChasis = scanner.nextLine();
        System.out.print("Ingrese el numero de ejes del vehiculo: ");
        vehiculoCarga.numeroEjes = scanner.nextInt();
        empresa.propietarios.add(propietario);
        empresa.vehiculosCarga.add(vehiculoCarga);
    }
    public static void ingresarVehiculoTransporte(Scanner scanner, EmpresaTransporte empresa){
        Propietario propietario= new Propietario(null, null, null, 0,null, null);
        VehiculoTransporte vehiculoTransporte= new VehiculoTransporte(null, null, null,null, null,null, 0);
        scanner.nextLine();
        System.out.println("Ingrese el nombre del propietario : ");
        propietario.nombre = scanner.nextLine();
        System.out.println("Ingrese la cedula del propietario : ");
        propietario.cedula = scanner.nextLine();
        vehiculoTransporte.responsable=propietario.cedula;
        System.out.println("Ingrese el email del propietario : ");
        propietario.email  = scanner.nextLine();
        System.out.print("Ingrese la edad del propietario : ");
        propietario.edad = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el telefono del propietario : ");
        propietario.celular = scanner.nextLine();
        System.out.println("Ingrese la placa del vehiculo de transporte: ");
        propietario.vehiculoRegistrado = scanner.nextLine();
        vehiculoTransporte.placa=propietario.getVehiculoRegistrado();
        System.out.println("Ingrese el modelo del Vehiculo ");
        vehiculoTransporte.modelo = scanner.nextLine();
        System.out.println("Ingrese la marca del vehiculo: ");
        vehiculoTransporte.marca = scanner.nextLine();
        System.out.println("Ingrese el color del vehiculo: ");
        vehiculoTransporte.color = scanner.nextLine();
        System.out.println("Ingrese el numero del chasis: ");
        vehiculoTransporte.numeroChasis = scanner.nextLine();
        System.out.println("Ingrese la capacidad maxima de pasajeros del vehiculo: ");
        vehiculoTransporte.maximoPasajeros= scanner.nextInt();
        empresa.propietarios.add(propietario);
        empresa.vehiculosTransporte.add(vehiculoTransporte);
    }
    public static void ingresarUsuario(Scanner scanner, EmpresaTransporte empresa) {
        Usuario usuario = new Usuario(null, 0, 0.0, null);
        scanner.nextLine();
        System.out.println("Ingrese el nombre del usuario: ");
        usuario.nombre = scanner.nextLine();
        System.out.println("Ingrese la edad del usuario: ");
        usuario.edad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el peso del usuario: ");
        usuario.peso = scanner.nextDouble();
        scanner.nextLine();
        String placa;
        VehiculoTransporte vehiculoAsociado = null;
        do {
            System.out.println("Ingrese la placa del vehículo registrado: ");
            placa = scanner.nextLine();
            for (VehiculoTransporte vehiculo : empresa.getVehiculosTransporte()) {
                if (vehiculo.getPlaca().equals(placa)) {
                    vehiculoAsociado = vehiculo;
                    break;
                }
            }
            if (vehiculoAsociado == null) {
                System.out.println(" Vehículo no encontrado. Intente nuevamente.");
            }
        } while (vehiculoAsociado == null);
        usuario.vehiculoRegistrado = placa;
        empresa.usuarios.add(usuario);
        System.out.println("Usuario registrado correctamente y asociado al vehículo con placa: " + placa);
    }


    public static void buscarVehiculoPlaca(Scanner scanner, EmpresaTransporte empresa){
        String placa = null;
        scanner.nextLine();
        System.out.print("Ingrese la placa del vehiculo a buscar: ");
        placa = scanner.nextLine();
        for(VehiculoCarga vehiculoCarga:empresa.vehiculosCarga){
            if(vehiculoCarga.placa.equals(placa)){
                System.out.print("El vehiculo buscado es \n ");
                System.out.println("Placa: "+vehiculoCarga.placa+" Modelo: "+vehiculoCarga.modelo+" Marca: "+vehiculoCarga.marca+" Capacidad Maxima: "+vehiculoCarga.capacidadCarga+" Numero de ejes: "+vehiculoCarga.numeroEjes);
                for (Propietario propietario:empresa.propietarios){
                    if(propietario.vehiculoRegistrado.equals(placa)){
                        System.out.println("Nombre: "+propietario.nombre+" Cedula: "+propietario.cedula+" Email: "+propietario.email+" Telefono: "+propietario.celular);
                    }
                }
            }
        }
        for(VehiculoTransporte vehiculoTransporte:empresa.vehiculosTransporte){
            if(vehiculoTransporte.placa.equals(placa)){
                System.out.print("El vehiculo buscado es \n ");
                System.out.println("Placa: "+vehiculoTransporte.placa+" Modelo: "+vehiculoTransporte.modelo+" Marca: "+vehiculoTransporte.marca+" Maximo pasajeros: "+vehiculoTransporte.maximoPasajeros);
                for (Propietario propietario:empresa.propietarios){
                    if(propietario.vehiculoRegistrado.equals(placa)){
                        System.out.println("Nombre: "+propietario.nombre+" Cedula: "+propietario.cedula+" Email: "+propietario.email+" Telefono: "+propietario.celular);
                    }
                }
            }
        }
    }
    public static void mostrarVehiculos(Scanner scanner, EmpresaTransporte empresa){
        for(VehiculoCarga vehiculoCarga:empresa.vehiculosCarga){
            System.out.println("Placa: "+vehiculoCarga.placa+" Modelo: "+vehiculoCarga.modelo+" Marca: "+vehiculoCarga.marca+" Color: "+vehiculoCarga.color+" Numero chasis: "+vehiculoCarga.numeroChasis+" Capacidad Maxima: "+vehiculoCarga.capacidadCarga+" Numero de ejes: "+vehiculoCarga.numeroEjes);
        }
        for(VehiculoTransporte vehiculoTransporte:empresa.vehiculosTransporte){
            System.out.println("Placa: "+vehiculoTransporte.placa+" Modelo: "+vehiculoTransporte.modelo+" Marca: "+vehiculoTransporte.marca+" Color: "+vehiculoTransporte.color+" Numero chasis"+vehiculoTransporte.numeroChasis+" Maximo pasajeros: "+vehiculoTransporte.maximoPasajeros);
        }
    }
    public static void obtenerUsuariosPorPeso(Scanner scanner, EmpresaTransporte empresa) {
        System.out.print("Ingrese el valor de peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Usuarios que superan el peso de " + peso + ":");
        for (Usuario usuario : empresa.usuarios) {
            if (usuario.peso > peso) {
                System.out.println("Nombre: " + usuario.nombre + ", Peso: " + usuario.peso);
            }
        }
    }
    public static void obtenerUsuariosPorPlaca(Scanner scanner, EmpresaTransporte empresa) {
        System.out.print("Ingrese la placa del vehículo: ");
        String placa = scanner.next();
        int contador = 0;
        for (Usuario usuario : empresa.usuarios) {
            if (usuario.vehiculoRegistrado.equals(placa)) {
                contador=contador+1;
            }
        }
        System.out.println("Número de usuarios movilizados en el vehículo con placa " + placa + ": " + contador);
    }
    public static void obtenerPropietariosMayoresDe40(EmpresaTransporte empresa) {
        int contador = 0;
        for (Propietario propietario : empresa.propietarios) {
            if (propietario.edad > 40) {
                contador++;
            }
        }
        System.out.println("Número de propietarios mayores de 40 años: " + contador );
    }
    public static void mostrarPasajerosTransportados(Scanner scanner, EmpresaTransporte empresa) {
        System.out.print("Ingrese la placa del vehículo: ");
        String placa = scanner.next();
        for (VehiculoTransporte vehiculoTransporte : empresa.getVehiculosTransporte()) {
            if (vehiculoTransporte.getPlaca().equals(placa)) {
                System.out.println("El vehículo con placa " + placa +
                        " ha transportado " + vehiculoTransporte.getPasajerosTransportados() + " pasajeros.");
                return;
            }
        }
        System.out.println("No se encontró un vehículo con la placa especificada.");
    }
    public static void ingresarPasajerosaVehiculoTransporte(Scanner scanner, EmpresaTransporte empresa) {
        scanner.nextLine();
        System.out.print("Ingrese la placa del vehículo: ");
        String placa = scanner.nextLine();
        for (VehiculoTransporte vehiculo : empresa.getVehiculosTransporte()) {
            if (vehiculo.getPlaca().equalsIgnoreCase(placa)) {
                System.out.print("Ingrese el número de pasajeros: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Error: Debe ingresar un número válido.");
                    scanner.next();
                }
                int pasajeros = scanner.nextInt();
                scanner.nextLine();
                if (pasajeros <= 0) {
                    System.out.println("Error: El número de pasajeros debe ser mayor a 0.");
                    return;
                }
                if (pasajeros <= vehiculo.getMaximoPasajeros()) {
                    vehiculo.transportarPasajeros(pasajeros);
                    System.out.println("Pasajeros ingresados correctamente.");
                } else {
                    System.out.println("Error: Los pasajeros sobrepasan el máximo permitido (" + vehiculo.getMaximoPasajeros() + ").");
                }
                return;
            }
        }
        System.out.println("Error: Vehículo con placa " + placa + " no encontrado.");
    }

}





