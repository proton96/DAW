import java.util.Scanner;

public class ACT1 {
    public static void main(String[] args) throws Exception {
        Scanner escaner = new Scanner(System.in);
      System.out.print("Pon el nombre de usuario: ");
      String usuario = escaner.nextLine().trim();
      System.out.print("Pon la contraseña: ");
      String pass = escaner.nextLine().trim();
      if (usuario.equals("admin") && pass.equals(1234)) {
         System.out.println("Acceso como Administrador (Lvl 1)");
      } else if (usuario.equals("user") && pass.equals("abcd")) {
         System.out.println("Acceso como usuario normal (Lvl 2)");
      } else if (usuario.equals("guest") && pass.equals("xyz")) {
         System.out.println("Acceso como invitado (Lvl 3)");
      } else {
         System.out.println("Acceso denegado");
      }

      escaner.close();
    }
}
