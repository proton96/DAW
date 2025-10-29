
import java.util.Scanner;

public class ACT2 {
public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

    //Cosas que vamos a necesitar 
    double precio, descuento =0, precioFinal;
    String tipocliente;

    // Vamos a pedir los datos 
    System.out.println("Ingrese el precio del producto: ");
    precio = scanner.nextDouble();
    scanner.nextLine();
    System.out.println("Ingrese el tipo de cliente ( REGULAR / PREMIUM / VIP): ");
    tipocliente = scanner.nextLine().toLowerCase(); //El toLowerCase es para que no importe si ponen VIP o vip.

    // Vamos a hacer el descuento 
    if (tipocliente.equals("regular")) {
        descuento = 0.05;
    } else if (tipocliente.equals("premium")){
        descuento = 0.10;
    } else if (tipocliente.equals("vip")){
        descuento = 0.20;
    }else if (precio > 500) {
            descuento += 0.05;

    }   else {
        System.out.println("Tipo de cliente no valido.");
        return;
    }
    
    //Calcular el precio final 

    precioFinal = precio - (precio*descuento);

    //Ahora vamos a mostrar los resultados
    System.out.println("=======RESULTADO=======");
    System.out.println("Precio original: " +precio + "EUR");
    System.out.println("Descuento aplicado: " + (descuento*100) + "%");
    System.out.println("Total a pagar: " + precioFinal + "EUR");

    scanner.close();

}
    
}

