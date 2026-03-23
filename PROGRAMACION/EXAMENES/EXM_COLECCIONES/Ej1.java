
import java.util.*;

public class Ej1 {

    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Alumno> academia = new ArrayList<>();

    //CONDICIONES INICIALES
    static {
        academia.add(new Alumno("jc1", "01A", "01/08/2026", "01", true));
        academia.add(new Alumno("jc2", "02B", "02/08/2026", "01", true));
        academia.add(new Alumno("jc3", "03C", "03/08/2026", "02", true));
        academia.add(new Alumno("jc4", "04D", "04/08/2026", "01", true));
        academia.add(new Alumno("jc5", "05E", "05/08/2026", "04", true));
    }

    //Creamos el menu 
    public  void menu() {
        int num;
        do {
            System.out.println("==========ACADEMIA==========");
            System.out.println("[1] Alta de alumno");
            System.out.println("[2] Baja de alumno");
            System.out.println("[3] Lista alumnos activos");
            System.out.println("[4] Lista de alumnos inactivos");
            System.out.println("[5] Borrar alumno");
            System.out.println("[6] Salir");
            System.out.println("Opcion: ");
            num = sc.nextInt();

            switch (num) {
                case 1:
                    alta();
                    break;
                case 2:
                    baja();
                    break;
                case 3:
                    listaActivos();
                    break;
                case 4:
                    listaInactivos();
                    break;
                case 5:
                    borrar();
                    break;

                default:
                    break;
            }

        } while (num != 6);
    }

    //Registrar un nuevo alumno. No se permiten DNIs duplicados.
    public  void alta() {
        System.out.println("Introduce el nombre del alumno: ");
        String nombre = sc.next();
        System.out.println("Introduce el DNI del alumno: ");
        String dni = sc.next();

        // CONTROL DE DUPLICADOS
        for (Alumno alumno : academia) {
            if (alumno.getDni().equals(dni)) {
                System.out.println("El DNI ya existe. No se puede registrar el alumno.");
                return; // Salir del método si se encuentra un DNI duplicado
            }
        }

        System.out.println("Introduce la fecha de matricula del alumno: ");
        String fechaMatricula = sc.next();
        System.out.println("Introduce el curso del alumno: ");
        String curso = sc.next();

        Alumno alumno = new Alumno(nombre, dni, fechaMatricula, curso, true);
        academia.add(alumno);

    }

    //Buscar un alumno por su DNI y cambiar su estado a activo = false.
    public  void baja() {
        System.out.println("Introduce el DNI del alumno a dar de baja: ");
        String dni = sc.next();

        for (Alumno alumno : academia) {
            if (alumno.getDni().equals(dni)) {
                alumno.setActivo(false);
                System.out.println("Alumno dado de baja correctamente.");
                return; // Salir del método después de dar de baja al alumno
            }
        }

        System.out.println("No se encontró un alumno con el DNI proporcionado.");

    }

    //Mostrar todos los alumnos con activo = true, ordenados por nombre, mostrando todos sus datos.
    public  void listaActivos() {
        List<Alumno> activos = new ArrayList<>();

        for (Alumno alumno : academia) {
            if (alumno.isActivo()) {
                activos.add(alumno);
            }
        }

        activos.sort(Comparator.comparing(Alumno::getNombre));

        for (Alumno alumno : activos) {
            System.out.println(alumno);
        }
    }

    //Mostrar todos los alumnos con activo = false, ordenados por DNI, mostrando todos sus datos.
    public  void listaInactivos() {
        List<Alumno> inactivos = new ArrayList<>();

        for (Alumno alumno : academia) {
            if (!alumno.isActivo()) {
                inactivos.add(alumno);
            }
        }

        inactivos.sort(Comparator.comparing(Alumno::getDni));

        for (Alumno alumno : inactivos) {
            System.out.println(alumno);
        }
    }

    //Eliminar un alumno buscando por DNI.
    public  void borrar() {
        System.out.println("Introduce el DNI del alumno a eliminar: ");
        String dni = sc.next();

        Iterator<Alumno> iterator = academia.iterator();
        while (iterator.hasNext()) {
            Alumno alumno = iterator.next();
            if (alumno.getDni().equals(dni)) {
                iterator.remove();
                System.out.println("Alumno eliminado correctamente.");
                return; // Salir del método después de eliminar al alumno
            }
        }

        System.out.println("No se encontró un alumno con el DNI proporcionado.");

    }

}
