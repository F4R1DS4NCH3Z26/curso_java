import java.util.Scanner;

public class RecetaCocina {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.print("Escriba nombre de la receta: ");
        var nombre_receta = consola.nextLine();

        System.out.print("Escriba los ingredientes principales: ");
        var ingredientes_principales = consola.nextLine();

        System.out.print("Escriba tiempo de duracion de la receta: ");
        var tiempo_receta = Double.parseDouble(consola.nextLine());

        System.out.print("Escriba la dificultad (Facil, Media o Alta): ");
        var dificultad = consola.nextLine().toLowerCase();

      /*  while (dificultad != "FACIL") {
            System.out.println("PON ALGO BUENO COMPAE"  );
            System.out.print("Escriba la dificultad (Facil, Media o Alta): ");
            dificultad = consola.nextLine().toLowerCase();

        }
      */

        System.out.println("* RECETA SUPER BUENA *");
        System.out.println("- Nombre Receta = " + nombre_receta);
        System.out.println("- Tiempo Receta = " + tiempo_receta);
        System.out.println("- Ingredientes Principales = " + ingredientes_principales);
        System.out.println("- Dificultad = " + dificultad);

    }
}
