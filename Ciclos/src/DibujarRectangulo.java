import java.util.Scanner;

public class DibujarRectangulo {
    public static void main(String[] args) {
        System.out.println("*** Dibujar un rectangulo ***");
        var consola = new Scanner(System.in);

        System.out.print("Proporcione un numiero de filas: ");
        var numero = consola.nextInt();

        for (int filas = 1; filas <= numero; filas++) {
            var espaciosBlanco = " ".repeat(numero - filas);
            var asteriscos = "*".repeat(2 * filas -1);
            System.out.println(espaciosBlanco + asteriscos);
        }
    }
}
