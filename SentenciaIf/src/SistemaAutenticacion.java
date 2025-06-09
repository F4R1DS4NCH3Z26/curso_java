import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("*** Sistema de Autenticacion ***");

        final var USUARIO = "FASO";
        final var PASSWORD = "Cl4v3123*";

        System.out.print("Usuario: ");
        var usuario = consola.nextLine();

        System.out.print("Contraseña: ");
        var password = consola.nextLine().strip();


        var mensaje = switch (usuario) {
            case USUARIO -> {
                if (PASSWORD.equals(password))
                    yield "Bienvinodo al Sistema!";
                else
                    yield "Password incorrecta, por favor debe corregirlo!";
            }
            default -> {
                if (PASSWORD.equals(password))
                    yield "Usuario incorrecto, por favor debe corregirlo!";
                else
                    yield "Usuario y contraseña invalida";
            }
        };

        System.out.println(mensaje);


    }
}
