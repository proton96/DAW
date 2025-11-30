public class main {
    public static void main(String[] args) throws Exception {
        Coche miCoche = Coche.crearCochePorConsola();
        miCoche.mostrarDetalles();;
        miCoche.encenderMotor();
        miCoche.abrirPuertas();
    }
}
