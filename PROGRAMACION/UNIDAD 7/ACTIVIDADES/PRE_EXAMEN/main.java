import java.util.*;

// Donde ubico el menu y ejecuto.
// Tambien alojare el ArrayList y el MAP para los ejercicios.

public class main {

    //1. Este sera el ArrayList Principal
        static List<Socio> listaSocios = new ArrayList<>();
    //2. Este sera nuestro MAP Principal
        static Map<String, Producto> mapaProductos = new HashMap<>();
    //Metemos un Scanner
        static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        //Llamamos al metodo cumplir condiciones iniciales
        cargarDatosIniciales();
        int opcionPrincipal;


        //Aqui tenemos la logica de nuestro menu
        do {
            System.out.println("\n===== SISTEMA DE GESTIÓN INTEGRAL =====");
            System.out.println("1. Gestión del GIMNASIO (ArrayList)");
            System.out.println("2. Gestión de la TIENDA ONLINE (Map)");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");

            opcionPrincipal = sc.nextInt();
            //Lo utilizamos para limpiar el bufer del scanner ( es buena practica )
            sc.nextLine();

            switch (opcionPrincipal) {
                case 1:
                    //submenu del ejercicio 1
                    menuGimnasio();
                    break;
                case 2:
                    //submenu del ejercicio 2
                    menuTienda();
                    break;
                case 3:
                    System.out.println("Cerrando el sistema. ¡Buen dia!");
                    break;
                default:
                    System.out.println("Opción no valida.");
            }

        } while (opcionPrincipal !=3);
    }




    // Metodo para cumplir con las condiciones iniciales.
    private static void cargarDatosIniciales(){

        // Cargamos 5 socios en el Arraylist
        listaSocios.add(new Socio("Esquirol","123456A", 25 , "01/01/2024"));
        listaSocios.add(new Socio("Mario","123456B", 26 , "01/01/2025"));
        listaSocios.add(new Socio("Cristina","123456C", 27 , "01/01/2022"));
        listaSocios.add(new Socio("Alejandro","123456D", 28 , "01/01/2026"));
        listaSocios.add(new Socio("Naruto","123456E", 29 , "01/01/2020"));



       // Cargamos 5 Productos en el MAP
    
        mapaProductos.put("P001", new Producto("P001", "PC", 800.0,10));
        mapaProductos.put("P002", new Producto("P002", "SWITCH", 400.0,50));
        mapaProductos.put("P003", new Producto("P003", "PS5", 500.0,500));
        mapaProductos.put("P004", new Producto("P004", "XBOX", 450.0,40));
        mapaProductos.put("P005", new Producto("P005", "TABLET", 250.0,150));

        System.out.println("Datos iniciales cargados correctamente.");

    }

    //Ahora creamos los menus de Gimnasio y Tienda.

    private static void menuGimnasio(){
        int opcionGimnasio;
        do {
        System.out.println("\n--- GESTIÓN DEL GIMNASIO ---");
        System.out.println("1. Alta de socio");
        System.out.println("2. Baja de socio");
        System.out.println("3. Listado de socios activos (Por nombre)");
        System.out.println("4. Listado de socios inactivos (Por DNI)");
        System.out.println("5. Borrar socio");
        System.out.println("6. Volver al menú principal");
        System.out.print("Seleccione una opción: ");

        opcionGimnasio = sc.nextInt();
        //LIMPIAR BUFFER
        sc.nextLine();
        

        switch (opcionGimnasio) {
            case 1:
                GestionColecciones.darAltaSocio(listaSocios, sc);
                break;
            case 2:
                GestionColecciones.darBajaSocio(listaSocios, sc);
                break;
            case 3:
                GestionColecciones.listarActivos(listaSocios);
                break;
            case 4:
                GestionColecciones.listarInactivos(listaSocios);
                break;
            case 5:
                GestionColecciones.borrarSocio(listaSocios, sc);
                break;
            case 6:
                System.out.println("Regresando al menu principal...");
                break;
            default:
                System.out.println("Opcion no valida.");
        }
        // Se repite hasta que el usuario quiera salir.
    } while (opcionGimnasio != 6);
    }


    private static void menuTienda(){

        int opcionTienda;
        do {
        System.out.println("\n--- GESTIÓN DE LA TIENDA ---");
        System.out.println("1. Alta de producto");
        System.out.println("2. Modificar stock");
        System.out.println("3. Listado de productos disponibles");
        System.out.println("4. Listado de productos sin Stock");
        System.out.println("5. Borrar Producto");
        System.out.println("6. Volver al menú principal");
        System.out.print("Seleccione una opción: ");

        opcionTienda = sc.nextInt();
        sc.nextLine();


        switch (opcionTienda) {
            case 1:
                GestionColecciones.darAltaProducto(mapaProductos, sc);
                break;
            case 2:
                GestionColecciones.modificarStock(mapaProductos, sc);
                break;
            case 3:
                GestionColecciones.listarDisponibles(mapaProductos);
                break;
            case 4:
                GestionColecciones.listarSinStock(mapaProductos);
                break;
            case 5:
                GestionColecciones.borrarProducto(mapaProductos, sc);
                break;
            case 6:
                System.out.println("Regresando al menu principal...");
                break;
            default:
                System.out.println("Opcion no valida.");
        }
        // Se repite hasta que el usuario quiera salir.
    } while (opcionTienda != 6);
    }

}