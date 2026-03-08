
import java.util.*;


public class ejercicio1 {

    
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList <libro> biblioteca = new ArrayList<>();


    // CONDICIONES INICIALES

    static {
        biblioteca.add(new libro("01", "A", "100", 20, "Esquirol", false));
        biblioteca.add(new libro("02", "B", "200", 30, "Esquirol1", false));
        biblioteca.add(new libro("03", "C", "300", 40, "Esquirol2", false));
        biblioteca.add(new libro("04", "D", "400", 50, "Esquirol3", false));
        biblioteca.add(new libro("05", "E", "500", 60, "Esquirol4", false));
    }


    public static void menu(){
        int num;
        do {
        System.out.println("==========BIBLIOTECA==========");
        System.out.println("[1] Alta");
        System.out.println("[2] Prestamo");
        System.out.println("[3] Lista disponible");
        System.out.println("[4] Lista de prestados");
        System.out.println("[5] Devolucion");
        System.out.println("[6] Borrar Libro");
        System.out.println("[7] Salir");
        System.out.println("Opcion: ");
        num = sc.nextInt();

        switch (num) {
            case 1:
            alta();
            break;
            case 2:
            prestamo();
            break;
            case 3:
            disponible();
            break;
            case 4:
            prestado();
            break;
            case 5:
            devolucion();
            break;
            case 6:
            borrar();
            break;

            default:
                break;
        }

        } while (num !=7);
    }


    public static void alta(){

        boolean prestado = false;


        System.out.println("Codigo: ");
        String codigo = sc.next();
        System.out.println("Nombre: ");
        String nombre = sc.next();
        System.out.println("ISBN: ");
        String isbn = sc.next();

        // CONTROL DE DUPLICADOS

        for (libro l : biblioteca) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                System.out.println("Error: ISBN duplicado");
                return;
            }
        }

        System.out.println("Paginas: ");
        int paginas = sc.nextInt();
        System.out.println("Autor: ");
        String autor = sc.next();


        // CREAR Y AÑADIR LIBRO

        libro nuevo = new libro(codigo, nombre, isbn, paginas, autor, prestado);
        biblioteca.add(nuevo);
        System.out.println("Libro dado de alta: " + nuevo);






    }

    public static void prestamo(){
        System.out.println("Introduce ISBN: ");
        String isbn = sc.nextLine();

        for (libro l : biblioteca) {
            if (l.getIsbn().equals(isbn)) {
                l.isPrestado();
                System.out.println("Libro prestado: " + l.getNombre());
            }
        }
    }

    public static void  disponible(){
        ArrayList<libro> disponible = new ArrayList<>();

        for (libro l : biblioteca) {
            if (!l.isPrestado()) {
                disponible.add(l);
            }
        }
        disponible.sort(Comparator.comparing(libro::getNombre));

        for (libro l : disponible) {
            System.out.println(l);
        }


    }

    public static void prestado(){
        ArrayList<libro> prestado = new ArrayList<>();

        for (libro l : prestado) {
            if (l.isPrestado()) {
                prestado.add(l);
            }
        }
        prestado.sort(Comparator.comparing(libro::getIsbn));

        for (libro l : prestado) {
            System.out.println(l);
        }
    }

    public static void devolucion(){
        System.out.println("ISBN: ");
        String isbn = sc.nextLine();

        for (libro l : biblioteca) {
            if (l.getIsbn().equals(isbn)) {
                l.setPrestado(false);
                System.out.println("El libro devuelto: " + l.getNombre());
            }
        }
    }

    public static void borrar(){
        System.out.println("ISBN: ");
        String isbn = sc.nextLine();

        for (libro l : biblioteca) {
            if (l.getIsbn().equals(isbn)) {
                biblioteca.remove(l);
                System.out.println("Libro borrado: " + l.getNombre());
            }
        }
    }


}