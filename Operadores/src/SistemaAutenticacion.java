import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println(" *** Sistemas de Autenticación *** ");
        final var USERNAME = "estudios";
        final var PASSWORD = "1";

        System.out.print(" Username: ");
        var username = consola.nextLine();
        System.out.print(" Password: ");
        var password = consola.nextLine();

        var resultAuth = username.equals(USERNAME) && password.equals(PASSWORD);
        System.out.print("El usuario y contraseña son correctos? = " + resultAuth);


    }
}
