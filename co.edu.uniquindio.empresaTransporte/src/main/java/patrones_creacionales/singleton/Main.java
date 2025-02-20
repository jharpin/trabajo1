package patrones_creacionales.singleton;

import patrones_creacionales.singleton.model.Conexion;

public class Main {
    public static void main(String[] args) {
        ejemplo1();
    }

    private static void ejemplo1() {
        //Instanciación por constructor prohíbido por ser "private"
        //Conexion c = new Conexion();
        Conexion c = Conexion.getInstancia();
        c.conectar();
        c.desconectar();

        Conexion c2 = Conexion.getInstancia();

        boolean rpta = c instanceof Conexion;
        System.out.println(rpta);
    }
}
