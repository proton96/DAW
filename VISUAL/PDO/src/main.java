public class main {
    public static void main(String[] args) {
        // Crear objetos de la clase TIENDA
        Tienda producto1 = new Tienda("Laptop", 1200.0, 0.21, 0.1);
        Tienda producto2 = new Tienda("Smartphone");
        Tienda producto3 = new Tienda("Tablet", 300.0, 0.21, 0.05);
        Tienda producto4 = new Tienda("Monitor", 250.0, 0.21, 0.15);            

        // Mostrar información de los productos
        System.out.println(producto1.mostrarInformacion());
        System.out.println();
        System.out.println(producto2.mostrarInformacion());
        System.out.println();
        System.out.println(producto3.mostrarInformacion());
        System.out.println();
        System.out.println(producto4.mostrarInformacion());
    }
}
