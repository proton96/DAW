
import java.util.*;

public class Ej2 {
    
    public static Scanner sc = new Scanner(System.in);
    public static HashMap<String, Vehiculo> parking = new HashMap<>();



    //CONDICIONES INICIALES

    static {

        parking.put("01", new Vehiculo("10:00", "1010ABC", false, 01, "jc1"));
        parking.put("02", new Vehiculo("11:00", "1010AAA", false, 02, "jc2"));
        parking.put("03", new Vehiculo("12:00", "1010BBB", false, 03, "jc3"));
        parking.put("04", new Vehiculo("13:00", "1010CCC", false, 04, "jc4"));
        parking.put("05", new Vehiculo("14:00", "1010CBA", false, 05, "jc5"));



    }



    //Creamos menu

        public  void menu() {
        int num;
        do {
            System.out.println("==========PARKING==========");
            System.out.println("[1] Entrada de vehículo");
            System.out.println("[2] Salida de vehículo (pago)");
            System.out.println("[3] Listado de vehículos pendientes de pago");
            System.out.println("[4] Listado de vehículos pagados");
            System.out.println("[5] Borrar vehículo");
            System.out.println("[6] Salir");
            System.out.println("Opcion: ");
            num = sc.nextInt();

            switch (num) {
                case 1:
                    entrada();
                    break;
                case 2:
                    salida();
                    break;
                case 3:
                    listaPendientes();
                    break;
                case 4:
                    listaPagados();
                    break;
                case 5:
                    borrar();
                    break;

                default:
                    break;
            }

        } while (num != 6);
    }


    //Registrar un nuevo vehículo. No se permite matrícula duplicada.
    public void entrada(){
        System.out.println("Introduce la matrícula del vehículo: ");
        String matricula = sc.next();
        System.out.println("Introduce el propietario del vehículo: ");
        String propietario = sc.next();
        System.out.println("Introduce la hora de entrada del vehículo: ");
        String horaEntrada = sc.next();
        System.out.println();
        System.out.println("Introduce el número de plaza del vehículo: ");
        int plaza = sc.nextInt();

        Vehiculo nuevoVehiculo = new Vehiculo(horaEntrada, matricula, false, plaza, propietario);
        parking.put(matricula, nuevoVehiculo);

        
    }

    //Buscar el vehículo por matrícula y cambiar pagado = true.
    public void salida(){
        System.out.println("Introduce la matrícula del vehículo: ");
        String matricula = sc.next();

        if (parking.containsKey(matricula)) {
            Vehiculo vehiculo = parking.get(matricula);
            vehiculo.setPagado(true);
            System.out.println("El vehículo con matrícula " + matricula + " ha sido marcado como pagado.");
        } else {
            System.out.println("No se encontró ningún vehículo con la matrícula " + matricula + ".");
        }

    }

    //Mostrar todos los vehículos con pagado = false, ordenados por plaza, mostrando todos los datos.
    public void listaPendientes(){
        List<Vehiculo> pendientes = new ArrayList<>();

        for (Vehiculo vehiculo : parking.values()) {
            if (!vehiculo.isPagado()) {
                pendientes.add(vehiculo);
            }
        }

        pendientes.sort(Comparator.comparing(Vehiculo::getPlaza));

        for (Vehiculo vehiculo : pendientes) {
            System.out.println(vehiculo);
        }

    }

    //Mostrar todos los vehículos con pagado = true, ordenados por propietario, mostrando todos los datos.
    public void listaPagados() {
        List<Vehiculo> pagados = new ArrayList<>();

        for (Vehiculo vehiculo : parking.values()) {
            if (vehiculo.isPagado()) {
                pagados.add(vehiculo);
            }
        }

        pagados.sort(Comparator.comparing(Vehiculo::getPropietario));

        for (Vehiculo vehiculo : pagados) {
            System.out.println(vehiculo);
        }

    }

    //Eliminar un vehículo por matrícula.
    public void borrar() {
        System.out.println("Introduce la matrícula del vehículo a eliminar: ");
        String matricula = sc.next();

        if (parking.containsKey(matricula)) {
            parking.remove(matricula);
            System.out.println("El vehículo con matrícula " + matricula + " ha sido eliminado.");
        } else {
            System.out.println("No se encontró ningún vehículo con la matrícula " + matricula + ".");
        }

    }

}
