import java.util.Scanner;

public class ACT7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Piedra, Papel, Tijera, Lagarto, Spock ===");
        System.out.println("Jugador 1, elige: 1-Piedra, 2-Papel, 3-Tijeras, 4-Lagarto, 5-Spock");
        int jugador1 = sc.nextInt();
        
        System.out.println("Jugador 2, elige: 1-Piedra, 2-Papel, 3-Tijeras, 4-Lagarto, 5-Spock");
        int jugador2 = sc.nextInt();
        
        scanner.close();
        
        // Validar entradas
        if (jugador1 < 1 || jugador1 > 5 || jugador2 < 1 || jugador2 > 5) {
            System.out.println("Elección inválida. Debe ser entre 1 y 5.");
            return;
        }
        
        // Verificar empate
        if (jugador1 == jugador2) {
            System.out.println("¡Empate!");
            return;
        }
        
        // Determinar ganador con switch 
        switch (jugador1) {
            // Piedra
            case 1: 
                switch (jugador2) {
                    case 3:
                        System.out.println("Piedra aplasta Tijeras. ¡Gana Jugador 1!");
                        break;
                    case 4:
                        System.out.println("Piedra aplasta Lagarto. ¡Gana Jugador 1!");
                        break;
                    default: // 2 o 5
                        if (jugador2 == 2) {
                            System.out.println("Papel cubre Piedra. ¡Gana Jugador 2!");
                        } else {
                            System.out.println("Spock vaporiza Piedra. ¡Gana Jugador 2!");
                        }
                        break;
                }
                break;

            // Papel 
            case 2: 
                switch (jugador2) {
                    case 1:
                        System.out.println("Papel cubre Piedra. ¡Gana Jugador 1!");
                        break;
                    case 5:
                        System.out.println("Papel desautoriza Spock. ¡Gana Jugador 1!");
                        break;
                    default: // 3 o 4
                        if (jugador2 == 3) {
                            System.out.println("Tijeras cortan Papel. ¡Gana Jugador 2!");
                        } else {
                            System.out.println("Lagarto come Papel. ¡Gana Jugador 2!");
                        }
                        break;
                }
                break;
            // Tijeras    
            case 3: 
                switch (jugador2) {
                    case 2:
                        System.out.println("Tijeras cortan Papel. ¡Gana Jugador 1!");
                        break;
                    case 4:
                        System.out.println("Tijeras decapitan Lagarto. ¡Gana Jugador 1!");
                        break;
                    default: // 1 o 5
                        if (jugador2 == 1) {
                            System.out.println("Piedra aplasta Tijeras. ¡Gana Jugador 2!");
                        } else {
                            System.out.println("Spock rompe Tijeras. ¡Gana Jugador 2!");
                        }
                        break;
                }
                break;

            // Lagarto   
            case 4: 
                switch (jugador2) {
                    case 5:
                        System.out.println("Lagarto envenena Spock. ¡Gana Jugador 1!");
                        break;
                    case 2:
                        System.out.println("Lagarto come Papel. ¡Gana Jugador 1!");
                        break;
                    default: // 1 o 3
                        if (jugador2 == 1) {
                            System.out.println("Piedra aplasta Lagarto. ¡Gana Jugador 2!");
                        } else {
                            System.out.println("Tijeras decapitan Lagarto. ¡Gana Jugador 2!");
                        }
                        break;
                }
                break;
                
            // Spock   
            case 5: 
                switch (jugador2) {
                    case 3:
                        System.out.println("Spock rompe Tijeras. ¡Gana Jugador 1!");
                        break;
                    case 1:
                        System.out.println("Spock vaporiza Piedra. ¡Gana Jugador 1!");
                        break;
                    default: // 2 o 4
                        if (jugador2 == 2) {
                            System.out.println("Papel desautoriza Spock. ¡Gana Jugador 2!");
                        } else {
                            System.out.println("Lagarto envenena Spock. ¡Gana Jugador 2!");
                        }
                        break;
                }
                break;
    }
}
