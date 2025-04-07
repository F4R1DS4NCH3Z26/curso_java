import java.util.Scanner;

public class TiendaEnLinea {
    public static void main(String[] args) {
        System.out.println(" *** Tienda en Linea *** ");
        var consola = new Scanner(System.in);

        System.out.println(" Digite el total de la compra: ");
        var subtotal = Double.parseDouble(consola.nextLine());

        System.out.println(" Usted es miembre: ");
        var esMiembro = Boolean.parseBoolean(consola.nextLine());
        Double descuento;
        Double montoTotal;
        if (subtotal > 1000 && esMiembro) {
            descuento = subtotal * 0.10;

        } else if (esMiembro) {
            descuento = subtotal * 0.5;
        } else {
            descuento = 0.0;
        }
        montoTotal = subtotal - descuento;

        System.out.printf("""
                *** Facturacion de compra ***
                
                Subtotal: %.2f
                Miembro: %s
                Descuento: %.2f
                Monto Total: %.2f
                """, subtotal, esMiembro, descuento, montoTotal);
    }
}
