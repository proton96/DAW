package documentacion;
/**
 * Clase contenedora con la informacion de cada empleado
 *
 * @author Daniel
 * @version 1.5
 */
public class Empleado {
 
    //Atributos
 
    /**
     * Nombre del empleado
     */
    private String nombre;
    /**
     * Apellido del empleado
     */
    private String apellido;
    /**
     * Edad del empleado
     */
    private int edad;
    /**
     * Salario del empleado
     */
    private double salario;
 
    //Metodos publicos
    
    /**
     * Constructor con 3 parametros
     * El salario es por defecto el minimo 500€
     * @param nombre nombre del empleado
     * @param apellido nombre del empleado
     * @param edad edad del empleado
     */
    public Empleado(String nombre, String apellido, int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.salario=500;
    }
    
    /**
     * Constructor con 4 parametros
     * @since 1.5
     * @param nombre nombre del empleado
     * @param apellido nombre del empleado
     * @param edad edad del empleado
     * @param salario salario del empleado
     */
    
    public Empleado(String nombre, String apellido, int edad, double salario){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.salario=salario;
    }

    /**
     * Metodo selector para el atributo nombre
     * @return nombre del objeto empleado
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Metodo modificador para el atributo nombre
     * @param nombre, si el nombres la cadena vacia muestra mensaje de error
     */
    public void setNombre(String nombre) {
        if(nombre.length()>0){
            this.nombre = nombre;
        }else{
            System.out.println("El nombre no puede ser vacio");
        }
    }

    /**
     * Metodo selector para el atributo apellido
     * @return apellido del objeto empleado
     */
    public String getApellido() {
        return this.apellido;
    }
    
    /**
     * Metodo modificador para el atributo apellidos
     * @param apellido, si el nombres la cadena vacia muestra mensaje de error
     */
    public void setApellido(String apellido) {
        if(apellido.length()>0){
            this.apellido = apellido;
        }else{
            System.out.println("El apellido no puede ser vacio");
        }
    }

    /**
     * Metodo selector para el atributo edad
     * @return edad del objeto empleado
     */
    public int getEdad() {
        return this.edad;
    }
    
    /**
     * Metodo modificador para el atributo nombre
     * @param edad  
     *  <ul>
     *    <li>La edad tiene que ser al menos 18 años</li>
     *    <li>si la edad no es correcta muestra mensaje de error</li>
     *  </ul>
     */
    public void setEdad(int edad) {
        if(edad>=18){
            this.edad = edad;
        }else{
            System.out.println("Tiene que ser mayor de edad para trabajar");
        }
    }
    //Metodos privados
    /**
     * Comprueba que el empleado merece un plus segun un criterio de salario y edad del objeto Empleado
     * @since 1.5
     * @return <ul>
     *  <li>true: cumple los requisitos</li>
     *  <li>false: no los cumple</li>
     *  </ul>
     */
    private boolean merecePlus(){
        return this.edad>40 && this.salario<1000;
    }
    
    /**
     * Metodo selector para el atributo salario
     * @return salario del objeto empleado
     */
    public double getSalario() {
        return this.salario;
    }

    /**
     * Metodo modificador para el atributo nombre
     * @param salario, si salario no al menos el minimo muestra mensaje de error
     */
    public void setSalario(double salario) {
        if(salario>=500){
            this.salario = salario;
        }else{
            System.out.println("Tiene que ser al menos el salario minimo");
        }
    }
    
    /**
     * Metodo toString basico de Java
     * @return Devuelve un String empezando por el nombre de la clase y con el 
     * orden nombre, apellido, edad y salario
     */
    public String toString() {
        return "Empleado{" + "nombre=" + this.nombre + 
                         ", apellido=" + this.apellido + 
                         ", edad=" + this.edad + 
                         ", salario=" + this.salario +'}';
    }
    
    /**
     * Suma un plus al salario del empleado si el empleado lo merece
     * @param sueldoPlus
     * @since 1.5
     * @see #merecePlus()
     */
    public void concederPlus(double sueldoPlus){
      
        if (this.merecePlus()){
            this.salario+=sueldoPlus;
        }
    }
 
    
 }