import java.util.Scanner;

public class SistemaAdministracionCuentas {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false;

        while (!salir) {
            System.out.println("""
                    *** Sistemas adminitracion de cuentas ***
                    Menu:
                    1. Crear cuenta
                    2. Eliminar cuenta
                    1. Salir del sistema
                    Escoge una opcion:\s
                    """);
            var opcion = consola.nextInt();

            switch (opcion) {
                case 1 -> System.out.println("Creando cuenta...");
                case 2 -> System.out.println("Eliminando cuenta...");
                case 3 -> {
                    System.out.println("Saliendo del sistema. Hasta pronto!!");
                    salir = true;
                }
            }
        }
    }
}
