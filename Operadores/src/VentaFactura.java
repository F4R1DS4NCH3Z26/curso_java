import java.util.Scanner;

public class VentaFactura {
    public static void main(String[] args) {
        System.out.println(" *** Facturacion de venta *** ");
        var consola = new Scanner(System.in);

        //Precio de la lechuga
        System.out.print(" Precio de la lechuga: ");
        var precioLechuga = Double.parseDouble(consola.nextLine());

        //Precio del platano
        System.out.print(" Precio del platanao: ");
        var precioPlatano = Double.parseDouble(consola.nextLine());

        //Precio del arroz
        System.out.print(" Precio del arroz: ");
        var precioArroz = Double.parseDouble(consola.nextLine());

        //Precio del Gaseosa
        System.out.print(" Precio de la gaseosa: ");
        var precioGaseosa = Double.parseDouble(consola.nextLine());

        System.out.print(" Aplicar descuento: (Numero entero) : ");
        var porcentajeDescuento = Integer.parseInt(consola.nextLine());

        var subtotal = precioGaseosa + precioArroz + precioLechuga + precioPlatano;

        var descuento = subtotal * (porcentajeDescuento /100.0);
        var subtotalDescuento = subtotal - descuento;
        var immpuesto = subtotalDescuento * 0.16;

        var costoTotalCompra = subtotalDescuento + immpuesto;


        System.out.printf("""
                Subtotal sin impuesto: $%.2f
                Descuento: $%.2f (%s%%)
                Impuesto (16%%): $%.2f
                Total de la compra: $%.2f 
                """, subtotal, descuento,porcentajeDescuento,  immpuesto, costoTotalCompra);


    }
}
