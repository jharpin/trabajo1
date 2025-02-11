package co.edu.uniquindio.empresaTransporte;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        VehiculoTransporte vh=new VehiculoTransporte("toyota","2002","123ACD","azul",5,12);
        VehiculoCarga Vc=new VehiculoCarga("hiunday","2024","567GHJ","MORADO",3,7,8);
        vh.mostrarVehiculo();
        Vc.mostrarVehiculo();
    }

}
