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
        var password = consola.nextLine();

        var mensaje = "";
        if (usuario == USUARIO) {
            mensaje = "Usuario invalido";
        } else if (password == PASSWORD) {
            mensaje = "Contraseña invalida";
        } else if (usuario != USUARIO && password != PASSWORD) {
            mensaje = "Usuario y contraseña invalida";
        } else {
            mensaje = USUARIO;
        }

        System.out.printf("""
                *** Bienvenido al sistema ***
                %s
                """, mensaje);


    }
}
