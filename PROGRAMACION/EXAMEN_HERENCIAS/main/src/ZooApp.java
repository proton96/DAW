public class ZooApp {
    public static void main(String[] args) throws Exception {

        System.out.println("\r\n" + //
                        "██████╗░██╗███████╗███╗░░██╗██╗░░░██╗███████╗███╗░░██╗██╗██████╗░░█████╗░\r\n" + //
                        "██╔══██╗██║██╔════╝████╗░██║██║░░░██║██╔════╝████╗░██║██║██╔══██╗██╔══██╗\r\n" + //
                        "██████╦╝██║█████╗░░██╔██╗██║╚██╗░██╔╝█████╗░░██╔██╗██║██║██║░░██║██║░░██║\r\n" + //
                        "██╔══██╗██║██╔══╝░░██║╚████║░╚████╔╝░██╔══╝░░██║╚████║██║██║░░██║██║░░██║\r\n" + //
                        "██████╦╝██║███████╗██║░╚███║░░╚██╔╝░░███████╗██║░╚███║██║██████╔╝╚█████╔╝\r\n" + //
                        "╚═════╝░╚═╝╚══════╝╚═╝░░╚══╝░░░╚═╝░░░╚══════╝╚═╝░░╚══╝╚═╝╚═════╝░░╚════╝░");

        // Crear un Perro.
        System.out.println("VAMOS A CREAR UN PERRO: ");
        Perro miPerro = Perro.crearPerroPorConsola();

        System.out.println("_________________________________________________________________________________________");
        // Perro → mostrarDetalles().
        miPerro.mostrarDetalles();
        // Perro → sonido, alimentarse, moverCola(3)
        miPerro.hacerSonido();
        miPerro.alimentarse();
        miPerro.moverCola(3);
         System.out.println("_________________________________________________________________________________________");

        // Crear un Gato.
        System.out.println("VAMOS A CREAR UN GATO: ");
        Gato miGato = Gato.crearGatoPorConsola();
         System.out.println("_________________________________________________________________________________________");
        // Gato → mostrarDetalles().
        miGato.mostrarDetalles();
        miGato.hacerSonido();
        miGato.alimentarse();
        miGato.saltar(3);
         System.out.println("_________________________________________________________________________________________");

        // Crear un Loro.
        Loro loro1 = new Loro("Polly", "Loro Gris Africano", 4, "Gris con rojo", true);
         System.out.println("_________________________________________________________________________________________");
        // Loro → mostrarDetalles().
        loro1.mostrarDetalles();
        loro1.hacerSonido();
        loro1.alimentarse();
         System.out.println("_________________________________________________________________________________________");

        // Comparar edades con esMayor().
        miPerro.esMayor(miGato);
        miGato.esMayor(loro1);

         System.out.println("_________________________________________________________________________________________");
    }
}
