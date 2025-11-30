
import java.util.Scanner;

public class Coche extends Vehiculo {

    private int numPuertas;

    public Coche (String marca, String modelo , int numPuertas) {
        super(marca, modelo);
        this.numPuertas = numPuertas;
        
    }

    @Override
    public void encenderMotor() {
        System.out.println("El motor del coche ha sido encendido.");
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Numero de puertas: " + numPuertas);
    }

    public void abrirPuertas(){
        for (int i=1; i<=numPuertas; i++){
            System.out.println(" Abriendo puerta: "+i);
        }
        if (numPuertas>2){
            System.out.println("Este coche tiene mas de 2 puertas.");
        }

    }

    public static Coche crearCochePorConsola(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la marca: ");
        String marca = sc.nextLine();
        System.out.println("Introduce el modelo: ");
        String modelo = sc.nextLine();
        System.out.println("Introduce numero de puertas: ");
        int numPuertas = sc.nextInt();
        sc.nextLine();
        return new Coche(marca, modelo, numPuertas);
        

    }

}
