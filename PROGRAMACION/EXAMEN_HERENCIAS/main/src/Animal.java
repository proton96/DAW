abstract class Animal {

    // Atributos
    protected String nombre;
    protected String especie;
    protected int edad;

    // Constructor defecto.

    public void Animald() {
    }

    // Constructor con parametros.

    public Animal(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // Metodos abstractos
    public abstract void hacerSonido();

    public abstract void alimentarse();

    // Metodos concretos

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    // esMayor : compara edades.
    public void esMayor(Animal otro) {
        if (this.edad > otro.edad) {
            System.out.println(this.nombre + " es mayor que " + otro.nombre);
        } else if (this.edad < otro.edad) {
            System.out.println(this.nombre + " es menor que " + otro.nombre);
        } else {
            System.out.println(this.nombre + " y " + otro.nombre + " tienen la misma edad");
        }

    }

}
