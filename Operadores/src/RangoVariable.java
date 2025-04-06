import java.util.Scanner;

public class RangoVariable {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println(" *** Rango entre variables *** ");
        System.out.print(" Proporciona un valor entero: ");
        var valor = Integer.parseInt(consola.nextLine());
        var estaDentroRango = valor >= 1 && valor <= 10;
        System.out.println(" Variable esta dentro de rango (1 - 10): " + estaDentroRango);

        var noEstaDentroRango = !(valor >= 1 && valor <= 10);
        System.out.println(" Variable no esta dentro de rango (1 - 10)? : " + noEstaDentroRango);

    }
}
