import java.util.Scanner;

public class AplicacionSaludFitness {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        final var META_PASOS_DIARIO = 10000;
        final var CALORIAS_POR_PASO = 0.04;
        System.out.println("*** Aplicacion de Salud y Fitness ***");

        System.out.print("Nombre de usuario: ");
        var nombre_usuario = consola.nextLine();

        System.out.print("Pasos caminados: ");
        var pasos_caminados = Integer.parseInt(consola.nextLine());

        var calorias_quemadas = pasos_caminados * CALORIAS_POR_PASO;

        var meta_alcanzada = (pasos_caminados >= META_PASOS_DIARIO) ? "Si :)" : "No :(";

        System.out.printf("""
                -------------------------------
                - Nombre de usuario: %s
                - Pasosa caminados: %s / %s
                - Cumple con la meta? %s
                --------------------------------
                """, nombre_usuario, pasos_caminados, META_PASOS_DIARIO, meta_alcanzada);

    }
}
