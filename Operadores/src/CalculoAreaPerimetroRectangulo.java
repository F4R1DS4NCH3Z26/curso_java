import java.util.Scanner;

public class CalculoAreaPerimetroRectangulo {
    public static void main(String[] args) {
        System.out.println(" *** Calculo de Area y perimetro de un rectangulo *** ");

        var consola = new Scanner(System.in);
        System.out.print("Digite en centimentros la base?: ");
        var base = Double.parseDouble(consola.nextLine());
        System.out.print("Digite en centimentros la altura?: ");
        var altura = Double.parseDouble(consola.nextLine());

        final var AREA = base * altura;
        final var PERIMETRO = 2 * (base + altura);
        System.out.println("AREA = " + AREA);
        System.out.println("PERIMETRO = " + PERIMETRO);
    }
}
