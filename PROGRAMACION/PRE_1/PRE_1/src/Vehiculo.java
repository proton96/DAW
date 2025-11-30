abstract class Vehiculo {
    // Metemos aqui los atributos de vehiculo
    String marca;
    String modelo;

    //Creamos el constructor
    public Vehiculo (String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    //Creamos el metodo abstracto encenderMotor
    public abstract void encenderMotor();

    //Creamos el metodo mostrar detalles
    public void mostrarDetalles() {
        System.out.println("Marca: \n"+marca +"Modelo"+ modelo);
    }
    
}
