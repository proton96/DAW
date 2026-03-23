package documentacion;


public class Tienda {
    private String nombre;
    private String direccion;
    private int numeroEmpleados;


    public Tienda(String nombre, String direccion, int numeroEmpleados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroEmpleados = numeroEmpleados;
    }

    public Tienda(String nombre) {
        this(nombre, "", 0);
    }


    public String getNombre() {
        return nombre;
    }


    public String getDireccion() {
        return direccion;
    }


    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }


    public boolean necesitaContratar() {
        return numeroEmpleados < 10;
    }
}
