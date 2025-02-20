package co.edu.uniquindio.empresaTransporte.empresaTransporte.factory;

import co.edu.uniquindio.empresaTransporte.empresaTransporte.model.EmpresaTransporte;
import co.edu.uniquindio.empresaTransporte.empresaTransporte.model.Propietario;

public class ModelFactory {
    private static ModelFactory instancia;
    private EmpresaTransporte empresaTransporte;

    private ModelFactory() {
        empresaTransporte = inicializarDatos();
    }


    public static ModelFactory getInstancia() {
        if(instancia == null) {
            instancia = new ModelFactory();
        }
        return instancia;
    }

    private EmpresaTransporte inicializarDatos() {
        EmpresaTransporte empresaTransporte = new EmpresaTransporte();
        empresaTransporte.setNombre("Transporte UQ");
        Propietario propietario = new Propietario(null,"1234","jean@",19,"12342","asdwe");
        propietario.setNombre("Pedro");
        Propietario propietario2 = new Propietario(null,"1454564","jean@",19,"12342","ABC123");
        propietario2.setNombre("Ana");
        empresaTransporte.getPropietarios().add(propietario);
        empresaTransporte.getPropietarios().add(propietario2);

        return empresaTransporte;
    }

    public EmpresaTransporte getEmpresaTransporte() {
        return empresaTransporte;
    }
}

