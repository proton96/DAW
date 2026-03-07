
// Clase para la logica de los menus

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GestionColecciones {

    //Metodo para el ejercicio 1 ArrayList.
    public static void darAltaSocio(List<Socio> lista, Scanner sc) {
        System.out.print("DNI: ");
        String dni = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

         //CONTROL DE DUPLICADOS (ES OBLIGATORIO)
        for (Socio s : lista) {
            if (s.getDni().equalsIgnoreCase(dni)) {
                System.out.println("Error: DNI duplicado");
                return;
            }
        }

        System.out.print("Edad: ");
        int edad;

        try {
            edad = Integer.parseInt(sc.nextLine());
            if (edad < 0 || edad > 120) {
                System.out.println("Error: Edad invalida.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("La edad debe ser un número");
            return;
        }


        System.out.print("Fecha inscripción (dd/mm//aaaa)");
        String fecha = sc.nextLine();



        // Crear y añadir el socio.
        Socio nuevo = new Socio(nombre,dni,edad,fecha);
        lista.add(nuevo);
        System.out.println("Socio dado de alta: " + nuevo);

    }

    // BAJA socio (cambiamos el activo = false)
    public static void darBajaSocio(List<Socio> lista, Scanner sc) {

        System.out.print("DNI: ");
        String dni = sc.nextLine();

        for (Socio s : lista) {
            if (s.getDni().equalsIgnoreCase(dni)) {
                s.setActivo(false);
                System.out.println("Socio dado de baja: " + s);
                return;
            }
        }
        System.out.println("Socio no encontrado");
    }

    // Listamos los activos (Ordeneados por nombre)
    public static void listarActivos(List<Socio> lista) {
        List<Socio> activos = new ArrayList<>();
        for (Socio s : lista) {
            if (s.isActivo()) {
                activos.add(s);
            }
        }

        //Ordenamos por nombre (OBLIGATORIO)
        activos.sort(Comparator.comparing(Socio::getNombre));

        System.out.println("\n SOCIOS ACTIVOS (" + activos.size() + "):");
        if (activos.isEmpty()) {
            System.out.println("No hay socios activos");
            return;
        }
        for (Socio s : activos) {
            System.out.println(s);
        }

    }

    //Listamos los inactivos (Ordenados por DNI)
    public static void listarInactivos(List<Socio> lista) {
        List<Socio> inactivos = new ArrayList<>();
        for (Socio s : lista) {
            if (!s.isActivo()) {
                inactivos.add(s);
            }
        }

        //ORDENAMOS
        inactivos.sort(Comparator.comparing(Socio::getDni));

        System.out.println("\n SOCIOS INACTIVOS (" + inactivos.size() + "):");
        if (inactivos.isEmpty()) {
            System.out.println("No hay socios inactivos");
            return;
        }
        for (Socio s : inactivos) {
            System.out.println(s);
        }
    }

    // BORRAR SOCIO
    public static void borrarSocio(List<Socio> lista, Scanner sc){
        System.out.print("DNI: ");
        String dni = sc.nextLine();


        Iterator<Socio> it = lista.iterator();
        while (it.hasNext()) {
            Socio s = it.next();
            if (s.getDni().equalsIgnoreCase(dni)) {
                System.out.println("Socio borrado. "+ s);
                it.remove();
                return;
            }
        }
        System.out.println("Socio no encontrado.");
    }






      //Metodo para el ejercicio 2 MAP.

      //DAR DE ALTA PRODUCTO

    public static void darAltaProducto(Map<String, Producto> mapa, Scanner sc) {
        System.out.print("Codigo: ");
        String codigo = sc.nextLine();

        //CONTROL DE DUPLICADOS
        if (mapa.containsKey(codigo)) {
            System.out.println("Error: codigo duplicado");
            return;
        }

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Precio: ");
        double precio;
        try {
            precio = Double.parseDouble(sc.nextLine());
            if (precio < 0) {
                System.out.println("El precio no puede ser negativo");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Precio invalido");
            return;
        }

        System.out.println("Stock: ");
        int stock;
        try {
            stock = Integer.parseInt(sc.nextLine());
            if (stock < 0) {
                System.out.println("El stock no puede ser negativo");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Stock invalido.");
            return;
        }

        Producto p = new Producto(codigo, nombre , precio , stock);

        mapa.put(codigo, p);
        System.out.println("Producto dado de alta: " + p );
        
    }

    // MODIFICAR STOCK

    public static void modificarStock (Map<String, Producto> mapa, Scanner sc) {
        System.out.print("Codigo del producto: ");
        String codigo = sc.nextLine();

        Producto p = mapa.get(codigo);
        if (p == null) {
            System.out.println("Producto no encontrado.");
            return;
        }


        System.out.println("Producto actual: " + p);
        System.out.println("Nuevo stock: ");
        int nuevoStock;
        try {
            nuevoStock = Integer.parseInt(sc.nextLine());
            if (nuevoStock < 0) {
                System.out.println("El stock no puede ser negativo.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Stock invalido.");
            return;
        }

        p.setStock(nuevoStock);

        //Si queremos actualizamos el disponible segun stock:
        if (nuevoStock == 0) {
            p.setDisponible(false);
        } else {
            p.setDisponible(true);
        }

        System.out.println("Stock actualizado: " + p );


    }

    //LISTADO DE PRODUCTOS DISPONIBLES

    public static void listarDisponibles(Map<String, Producto> mapa) {

        List<Producto> disponibles = new ArrayList<>();

        for (Producto p : mapa.values()) {
            if (p.isDisponible()) {
                disponibles.add(p);
            }
        }


        //Ordenamos por el nombre
        disponibles.sort(Comparator.comparing(Producto::getNombre));
        
        System.out.println("\n PRODUCTOS DISPONIBLES (" +disponibles.size() + "):");
        if (disponibles.isEmpty()) {
            System.out.println("No hay productos disponibles");
            return;
        }

        for (Producto p : disponibles) {
            System.out.println(p);
        }

    
    }


    //LISTADO DE PRODUCTOS  SIN STOCK

    public static void listarSinStock (Map<String, Producto> mapa) {
        List<Producto> sinStock = new ArrayList<>();

        for (Producto p : mapa.values()) {
            if (p.getStock() == 0) {
                sinStock.add(p);
            }
        }

        System.out.println("\n PRODUCTOS SIN STOCK (" + sinStock.size() + "):");
        if (sinStock.isEmpty()) {
            System.out.println("No hay productos sin stock.");
            return;
        }

        for (Producto p : sinStock) {
            System.out.println(p);
        }
    }
    
    //BORRAR PRODUCTO

    public static void borrarProducto(Map<String, Producto> mapa, Scanner sc) {
        System.out.println("Codigo del producto a borrar");
        String codigo = sc.nextLine();

        Producto eliminado = mapa.remove(codigo);
        if (eliminado == null) {
            System.out.println("No existe un producto con ese codigo");
        } else {
            System.out.println("Producto borrado: " + eliminado);
        }
    }



}
