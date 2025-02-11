package co.edu.uniquindio.empresaTransporte;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        EmpresaTransporte empresa= new EmpresaTransporte();
        inicializarDatos(empresa);
        int opcion=0;

        while (opcion!=5) {
            System.out.println("\nMenú:");
            System.out.println("1. Ingresar Vehiculo de Transporte");
            System.out.println("2. Ingresar vehiculo de Carga");
            System.out.println("3. Buscar vehiculo por placa");
            System.out.println("4. Mostrar Vehiculos registrados ");
            System.out.println("5. Obtener usuarios por peso ");
            System.out.println("6. Obtener usuarios por placa ");
            System.out.println("7. Obtener propietarios mayores de 40 años ");
            System.out.println("8. Mostrar número de pasajeros transportados por vehículo");
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
                    buscarVehiculoPlaca(scanner,empresa);
                    break;

                case 4:
                    mostrarVehiculos(scanner, empresa);
                    break;
                case 5:
                    obtenerUsuariosPorPeso(scanner, empresa);
                    break;
                case 6:
                    obtenerUsuariosPorPlaca(scanner, empresa);
                    break;
                case 7:
                    obtenerPropietariosMayoresDe40(empresa);
                    break;
                case 8:
                    mostrarPasajerosTransportados(scanner, empresa);
                    break;
            }
        }

    }
    public static void inicializarDatos(EmpresaTransporte empresa){
        //Se crean 5 propietarios y 5 vehiculos de carga y se guardan en empresa
        Propietario propietario1= new Propietario("sandro", "182387128938980", "sandro@gmail.com", 12,"321560", null);
        Propietario propietario2= new Propietario("roberta", "1092783782871", "roberta@gmail.com", 60,"321561", null);
        Propietario propietario3= new Propietario("ruka", "1090272982", "ruka@gmail.com", 18,"321562", null);
        Propietario propietario4= new Propietario("carlos", "1090272983", "carlos@gmail.com", 24,"321563", null);
        Propietario propietario5= new Propietario("manuel", "1090272984", "manuel@gmail.com", 41,"321564", null);

        VehiculoCarga vehiculoCarga1= new VehiculoCarga("FTP56", "2000", "SUZUKI", "Negro","as54","pepito", 45.5, 3);
        propietario1.vehiculoRegistrado=vehiculoCarga1.placa;

        VehiculoCarga vehiculoCarga2= new VehiculoCarga("HJK42", "2001", "SUZUKI2", "Rojo", "fc55"," pedro",34.6,4 );
        propietario2.vehiculoRegistrado=vehiculoCarga2.placa;

        VehiculoCarga vehiculoCarga3= new VehiculoCarga("MKSJ3", "2012", "SUZUKI3", "Gris","ea66", "fedrick",6.26 , 5);
        propietario3.vehiculoRegistrado=vehiculoCarga3.placa;

        VehiculoCarga vehiculoCarga4= new VehiculoCarga("KLÑ4", "2015", "SUZUKI4", "Cafe","wa488", "hasdf",7.26 , 6 );
        propietario4.vehiculoRegistrado=vehiculoCarga4.placa;

        VehiculoCarga vehiculoCarga5= new VehiculoCarga("GHJ5", "2020", "SUZUKI5", "Negro","gt56", "wilson", 8.26 , 7);
        propietario5.vehiculoRegistrado=vehiculoCarga5.placa;

        Usuario usuario1 = new Usuario("jean",19,83.0,"HGSK");
        Usuario usuario2 = new Usuario("jonny",23,60,"DAKJA");
        Usuario usuario3 = new Usuario("jes",34,90,"KOJOS");

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


        Propietario propietario6= new Propietario("riki", "109027220", "riki@gmail.com", 34 ,"321560", null);
        Propietario propietario7= new Propietario("gomez", "109027221", "gom@gmail.com", 23 ,"321561", null);
        Propietario propietario8= new Propietario("maria", "1090272222", "maria@gmail.com", 14,"321562", null);

        VehiculoTransporte vehiculoTransporte1= new VehiculoTransporte("YAMAHA","2000","FPI9",   "Negro","nj12","fgh",9 );
        propietario6.vehiculoRegistrado=vehiculoTransporte1.placa;

        VehiculoTransporte vehiculoTransporte2= new VehiculoTransporte("YAMAHA","2000","FPI7",   "Azul","nk14","errt", 6);
        propietario7.vehiculoRegistrado=vehiculoTransporte2.placa;

        VehiculoTransporte vehiculoTransporte3= new VehiculoTransporte("YAMAHA","2000","FPI10",   "Negro","cd23", "ajhga",  40);
        propietario8.vehiculoRegistrado=vehiculoTransporte3.placa;
        vehiculoTransporte1.transportarPasajeros(2);
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
        propietario.edad = Integer.parseInt(scanner.nextLine());

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
        vehiculoCarga.capacidadCarga = Double.parseDouble(scanner.nextLine());

        System.out.println("Ingrese el numero del chasis: ");
        vehiculoCarga.numeroChasis = scanner.nextLine();

        System.out.print("Ingrese el numero de ejes del vehiculo: ");
        vehiculoCarga.numeroEjes = scanner.nextInt();
        // guardo lista

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
        vehiculoTransporte.maximoPasajeros= Integer.parseInt(scanner.nextLine());
        // guardo lista

        empresa.propietarios.add(propietario);
        empresa.vehiculosTransporte.add(vehiculoTransporte);
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
                contador++;
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

}



