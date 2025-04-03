import java.util.Scanner;

public class SistemasDescuentoVIP {
    public static void main(String[] args) {
        System.out.println(" *** SISTEMA DE FACTURACION *** ");
        var consola = new Scanner(System.in);

        final var NO_PRODUCTOS_DESCUYENTO = 10;
        System.out.print("¿Cuantas compras hizo? : ");
        var numeroCompras = Integer.parseInt(consola.nextLine());
        System.out.print("¿Es miembro VIP? : ");
        var miembreVIP = Boolean.parseBoolean(consola.nextLine());

        if (numeroCompras >= NO_PRODUCTOS_DESCUYENTO && miembreVIP) {
            System.out.println("Aplica para el descuento VIP");
        } else {
            System.out.println("No aplica para el descuento VIP");

        }

    }
}
