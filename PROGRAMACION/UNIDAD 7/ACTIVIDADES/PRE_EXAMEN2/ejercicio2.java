import java.util.*;



public class ejercicio2 {
    public static Scanner sc = new Scanner(System.in);
    public static HashMap<String, paciente> hospital = new HashMap<>();


    //CONDICIONES INICIALES

    static{
        hospital.put("1", new paciente("1", "Esquirol", 20, 01, false));
        hospital.put("2", new paciente("2", "Esquirol1", 21, 02, false));
        hospital.put("3", new paciente("3", "Esquirol2", 22, 03, false));
        hospital.put("4", new paciente("4", "Esquirol3", 23, 04, false));
        hospital.put("5", new paciente("5", "Esquirol4", 24, 05, false));

    }
    
    public static void menu(){
        int num;
        do {
        System.out.println("==========HOSPITAL==========");
        System.out.println("[1] Alta Paciente");
        System.out.println("[2] Modificar habitacion");
        System.out.println("[3] Lista pacientes");
        System.out.println("[4] Lista pacientes dados de alta");
        System.out.println("[5] Dar de alta");
        System.out.println("[6] Borrar paciente");
        System.out.println("[7] Salir");
        System.out.println("Opcion: ");
        num = sc.nextInt();
        switch (num) {
            case 1:
            alta();
            break;
            case 2:
            habitacion();
            break;
            case 3:
            listapacientes();
            break;
            case 4:
            listaalta();
            break;
            case 5:
            daralta();
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

        boolean dadoAlta = false;

        System.out.println("Codigo: ");
        String codigo = sc.nextLine();

        if (hospital.containsKey(codigo)) {
            System.out.println("Error: codigo duplicado");
            return;
        }
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Edad: ");
        int edad = sc.nextInt();
        System.out.println("Habitacion: ");
        int habitacion = sc.nextInt();


        paciente p = new paciente(codigo, nombre, edad, habitacion, dadoAlta);

        hospital.put(codigo,p);
        System.out.println("Paciente dado de alta: " + p);

    }
    public static void habitacion(){
        System.out.println("Codigo: ");
        String codigo = sc.nextLine();
        System.out.println("Habitacion nueva: ");
        int habitacion = sc.nextInt();

        hospital. get(codigo).setHabitacion(0);
        System.out.println("Habitacion nueva del paciente: " + habitacion); 

    }
    public static void listapacientes(){

        ArrayList<paciente> lista = new ArrayList<>();

        for (paciente p : lista) {
            if (!p.isDadoAlta()) {
                lista.add(p);
            }
        }

        lista.sort(Comparator.comparing(paciente::getNombre));

        for (paciente p : lista) {
            System.out.println(p);
        }

    }
    public static void listaalta(){
                ArrayList<paciente> lista = new ArrayList<>();

        for (paciente p : lista) {
            if (p.isDadoAlta()) {
                lista.add(p);
            }
        }

        for (paciente p : lista) {
            System.out.println(p);
        }
    }
    public static void daralta(){
        System.out.println("Codigo: ");
        String codigo = sc.nextLine();

        hospital. get(codigo).setDadoAlta(true);
        System.out.println("Paciente dado de alta: " + hospital.get(codigo)); 
    }
    public static void borrar(){
        System.out.println("Codigo: ");
        String codigo = sc.nextLine();

        paciente eliminado = hospital.remove(codigo);

        if (eliminado == null) {
            System.out.println("No existe un paciente con ese codigo. ");
        }else{
            System.out.println("Paciente eliminado: " + eliminado);
        }
    }


}
